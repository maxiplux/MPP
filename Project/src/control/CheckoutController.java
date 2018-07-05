package control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map.Entry;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.dataaccess.DataAccess;
import model.dataaccess.DataAccessFacade;
import model.domain.Book;
import model.domain.BookCopy;
import model.domain.CheckoutRecordEntry;
import model.domain.LibraryMember;
import model.domain.User;
import util.Util;

public class CheckoutController {

	private User user;

	public CheckoutController(User user) {
		this.user = user;
	}

	protected static CheckoutRecordEntry checkoutABook(String userId, String isbn) {
		DataAccess db = new DataAccessFacade();
		HashMap<String, LibraryMember> memMap = db.readMemberMap();
		LibraryMember mb = memMap.get(userId);
		if (mb == null) {
			Util.showAlert("fember does not exist", "Not data found", AlertType.ERROR);
		}

		HashMap<String, Book> bookMap = db.readBooksMap();
		Book bk = bookMap.get(isbn);
		if (bk == null) {
			Util.showAlert("Book does not exist", "Not data found", AlertType.ERROR);
		} else {
			System.out.println("Procceed checkout book");
			BookCopy bc = bk.getNextAvailableCopy();

			CheckoutRecordEntry cre = mb.addCheckoutRecordEntry(bc, LocalDate.now(),
					LocalDate.now().plusDays(bk.getMaxCheckoutLength()));
			bc.changeAvailability();
			db.saveNewMember(mb);
			db.saveAbook(bk);
			return cre;
		}
		return null;
	}

	private Stage primaryStage;

	//@Override
	public void start(Stage stage) throws Exception {
		this.primaryStage = stage;
		Parent root = FXMLLoader.load(getClass().getResource("/view/templates/checkoutbook.fxml"));

		stage.setTitle("FXML Checkout Book Controller");
		stage.setScene(new Scene(root, 300, 200));

		TextField memberId = (TextField) root.lookup("#memberId");
		TextField txtIsbn = (TextField) root.lookup("#txtIsbn");

		Button btnBack = (Button) root.lookup("#btnBack");

		btnBack.setOnAction((event) -> {

			MainMenuController mainMenuController = new MainMenuController(user);

			try {
				mainMenuController.start(this.primaryStage);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		Button btnCheckout = (Button) root.lookup("#btnCheckout");
		btnCheckout.setOnAction((event) -> {
			checkoutButtonHanle(memberId.getText(), txtIsbn.getText());
		});

		stage.show();
	}

	public void checkoutButtonHanle(String memberId, String txtIsbn) {

		boolean badmember = true;
		boolean badisbn = true;
		DataAccess db = new DataAccessFacade();
		HashMap<String, LibraryMember> list_members = db.readMemberMap();
		HashMap<String, Book> books = db.readBooksMap();
		for (Entry<String, LibraryMember> entry : list_members.entrySet()) {
			if (entry.getValue().getMemberId().equals(memberId)) {
				badmember = false;
				break;

			}
		}

		if (badmember) {
			Util.showAlert("Member Id Not found", "Not data found", AlertType.WARNING);
			return;
		}

		Book temp_book = new Book();
		for (Entry<String, Book> entry : books.entrySet()) {
			if (entry.getValue().getIsbn().equals(txtIsbn)) {
				badisbn = false;
				temp_book = entry.getValue();

			}
		}

		if (badisbn) {
			Util.showAlert("Book Isbn No found", "Not data found", AlertType.WARNING);
			return;
		} else {
			if (temp_book.isAvailable()) {

				CheckoutRecordEntry cre = checkoutABook(memberId, txtIsbn);
				//CheckoutRecordEntrySuccessController checkoutrecordentrysuccess = new CheckoutRecordEntrySuccessController(
				//		cre, this.user);

				try {
				//	checkoutrecordentrysuccess.start(this.primaryStage);
					 checkoutSuccess( cre);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return;
			} else {
				Util.showAlert("No available copy for the book", "Not data found", AlertType.ERROR);
				return;
			}
		}
	}
	
	public void  checkoutSuccess(CheckoutRecordEntry cre) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/view/templates/checkoutbook-success.fxml"));
		this.primaryStage.setTitle("FXML Welcome");

		this.primaryStage.setScene(new Scene(root, 300, 300));

		Label lblIsbn = (Label) root.lookup("#lblIsbn");
		Label lblBookName = (Label) root.lookup("#lblBookName");
		Label lblMemberId = (Label) root.lookup("#lblMemberId");

		Label lblMemberName = (Label) root.lookup("#lblMemberName");

		Label lblCheckoutDate = (Label) root.lookup("#lblCheckoutDate");
		Label lblDueDate = (Label) root.lookup("#lblDueDate");

		lblIsbn.setText(cre.getBookcopy().getBook().getIsbn());
		lblBookName.setText(cre.getBookcopy().getBook().getTitle());

		lblMemberId.setText(cre.getMember().getMemberId());
		lblMemberName.setText(cre.getMember().getFirstName());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LLLL/yyyy");

		lblCheckoutDate.setText(cre.getCheckoutDate().format(formatter));
		lblDueDate.setText(cre.getDueDate().format(formatter));

		Button btnBackMenu = (Button) root.lookup("#btnBackMenu");

		btnBackMenu.setOnAction((event) -> {
			System.out.println(event);
			CheckoutController checkoutcontroller = new CheckoutController(this.user);
			try {
				checkoutcontroller.start(this.primaryStage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		this.primaryStage.show();
	}
}