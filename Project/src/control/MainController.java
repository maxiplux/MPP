package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import model.dataaccess.Auth;
import model.domain.User;
import util.Util;

public class MainController implements Initializable {
	private User user;
	private Stage primaryStage;

	@FXML
	private Button btnCheckoutBooks;
	@FXML
	private Button btnBooks;
	@FXML
	private Button btnLibraryMembers;

	public MainController() {
		super();
	}

	public MainController(Stage primaryStage, User user) {
		this.primaryStage = primaryStage;
		this.user = user;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		btnCheckoutBooks.setOnAction((event) -> {
			if (user.getAuthorization().equals(Auth.ADMIN)) {
				Util.showAlert("Administrator can not checkout books", "Permission denied", AlertType.ERROR);
				return;
			}
			
			CheckoutController checkoutcontroller = new CheckoutController(this.user);
			
			try {
				checkoutcontroller.start(this.primaryStage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		btnBooks.setOnAction((event) -> {
			if (user.getAuthorization().equals(Auth.LIBRARIAN)) {
				Util.showAlert("Librarian cannot add Books", "Permission denied", AlertType.ERROR);
				return;
			}
			
			BookController bc = new BookController(user);
			try {
				bc.start(this.primaryStage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		btnLibraryMembers.setOnAction((event) -> {
			if (user.getAuthorization().equals(Auth.LIBRARIAN)) {
				Util.showAlert("Librarian cannot add Member", "Permission denied", AlertType.ERROR);
				return;
			}
			System.out.println("btnLibraryMembers");

			LibraryMemberController librarymember = new LibraryMemberController();
			try {
				librarymember.start(this.primaryStage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
	}
}