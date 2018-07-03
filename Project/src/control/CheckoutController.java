package control;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map.Entry;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.dataaccess.DataAccess;
import model.dataaccess.DataAccessFacade;
import model.domain.Book;
import model.domain.BookCopy;
import model.domain.LibraryMember;
import model.domain.User;
import util.Util;

public class CheckoutController {

//	@FXML
//	private TextField userId;
//	@FXML
//	private TextField txtIsbn;
//
//	@FXML
//	protected void hannAction(ActionEvent event) {
//
//		DataAccess db = new DataAccessFacade();
//		HashMap<String, LibraryMember> memMap = db.readMemberMap();
//		LibraryMember mb = memMap.get(userId.getText().trim());
//		if (mb == null)
//			Util.showAlert("member does not exist ", "Error Checkout", AlertType.ERROR);
//
//		HashMap<String, Book> bookMap = db.readBooksMap();
//		Book bk = bookMap.get(txtIsbn.getText().trim());
//		if (bk == null || !bk.isAvailable())
//			Util.showAlert("Book is not available ", "Error Checkout", AlertType.ERROR);
//		else {
//			BookCopy bc = bk.getNextAvailableCopy();
//			
//			mb.addCheckoutRecordEntry(bc, LocalDate.now(), LocalDate.now().plusDays(bk.getMaxCheckoutLength()));
//			bc.changeAvailability();
//			db.saveNewMember(mb);
//			db.saveAbook(bk);
//		}
//
//		if (true) {
//			Util.showAlert("User id or password Wrong ", "Error login", AlertType.ERROR);
//		}
//
//	}
	
	protected static void hannAction(String userId, String isbn) {

		DataAccess db = new DataAccessFacade();
		HashMap<String, LibraryMember> memMap = db.readMemberMap();
		LibraryMember mb = memMap.get(userId);
		if (mb == null) {
			System.out.println("member is null");
		}

		HashMap<String, Book> bookMap = db.readBooksMap();
		Book bk = bookMap.get(isbn);
		if (bk == null || !bk.isAvailable()) {
			System.out.println("book is null");
		}

		else {
			BookCopy bc = bk.getNextAvailableCopy();
			
			mb.addCheckoutRecordEntry(bc, LocalDate.now(), LocalDate.now().plusDays(bk.getMaxCheckoutLength()));
			bc.changeAvailability();
			db.saveNewMember(mb);
			db.saveAbook(bk);
		}

		if (true) {
//			Util.showAlert("User id or password Wrong ", "Error login", AlertType.ERROR);
		}

	}
	
	public static void main(String[] args) {
		hannAction("1001","23-11451");
	}

}
