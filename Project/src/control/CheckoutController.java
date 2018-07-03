package control;

import java.util.HashMap;
import java.util.Map.Entry;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import model.dataaccess.DataAccess;
import model.dataaccess.DataAccessFacade;
import model.domain.Book;
import model.domain.LibraryMember;
import model.domain.User;
import util.Util;

public class CheckoutController extends Application {
	private User user;
	private Stage primaryStage;

	@Override
	public void start(Stage stage) throws Exception {
		this.primaryStage = stage;
		Parent root = FXMLLoader.load(getClass().getResource("/view/templates/checkoutbook.fxml"));

		stage.setTitle("FXML Welcome");
		stage.setScene(new Scene(root, 300, 200));

		TextField memberId = (TextField) root.lookup("#memberId");
		TextField txtIsbn = (TextField) root.lookup("#txtIsbn");

		Button btnBack = (Button) root.lookup("#btnBack");
		btnBack.setOnAction((event) -> {
			MainController maincontroller = new MainController(user);
			try {
				maincontroller.start(this.primaryStage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		Button btnCheckout = (Button) root.lookup("#btnCheckout");
		btnCheckout.setOnAction((event) -> {
			boolean badmember = true;
			boolean badisbn = true;
			DataAccess db = new DataAccessFacade();
			HashMap<String, LibraryMember> list_members = db.readMemberMap();
			HashMap<String, Book> books = db.readBooksMap();
			for (Entry<String, LibraryMember> entry : list_members.entrySet()) {
				if (entry.getValue().getMemberId().equals(memberId.getText())) {
					badmember = false;
					break;

				}
			}
			

			if (badmember) {
				Util.showAlert("Member Id No found", "Not data found", AlertType.WARNING);
				return ;
			}
			
			Book temp_book= new Book();
			for (Entry<String, Book > entry : books.entrySet()) {
				if (entry.getValue().getIsbn().equals(txtIsbn.getText())) 
				{
					badisbn = false;
					temp_book=entry.getValue();

				}
			}

			if (badisbn) {
				Util.showAlert("Book Isbn No found", "Not data found", AlertType.WARNING);
				return ;
			}
			else
			{
				if ( !temp_book.isAvailable() )				
				{
					Util.showAlert("Book is avaible in this moment ", "Not data found", AlertType.INFORMATION);
					return ;
				}
			}			
			
			//Util.showAlert("All is good", "All is good", AlertType.INFORMATION);

		});

		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(CheckoutController.class, args);
	}
}