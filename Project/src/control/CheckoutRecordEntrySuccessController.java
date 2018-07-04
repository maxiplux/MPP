package control;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.dataaccess.Auth;
import model.domain.CheckoutRecordEntry;
import model.domain.User;
import util.Util;

public class CheckoutRecordEntrySuccessController extends Application {

	private CheckoutRecordEntry checkoutrecordentry;

	private User user;

	CheckoutRecordEntrySuccessController(CheckoutRecordEntry checkoutrecordentry, User user) {
		super();
		this.user = user;
		this.checkoutrecordentry = checkoutrecordentry;
	}

	public static void main(String[] args) {
		Application.launch(CheckoutRecordEntrySuccessController.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/view/templates/checkoutbook-success.fxml"));
		stage.setTitle("FXML Welcome");

		stage.setScene(new Scene(root, 300, 300));

		Label lblIsbn = (Label) root.lookup("#lblIsbn");
		Label lblBookName = (Label) root.lookup("#lblBookName");
		Label lblMemberId = (Label) root.lookup("#lblMemberId");

		Label lblMemberName = (Label) root.lookup("#lblMemberName");

		Label lblCheckoutDate = (Label) root.lookup("#lblCheckoutDate");
		Label lblDueDate = (Label) root.lookup("#lblDueDate");

		lblIsbn.setText(this.checkoutrecordentry.getBookcopy().getBook().getIsbn());
		lblBookName.setText(this.checkoutrecordentry.getBookcopy().getBook().getTitle());

		lblMemberId.setText(this.checkoutrecordentry.getMember().getMemberId());
		lblMemberName.setText(this.checkoutrecordentry.getMember().getFirstName());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LLLL/yyyy");

		lblCheckoutDate.setText(this.checkoutrecordentry.getCheckoutDate().format(formatter));
		lblDueDate.setText(this.checkoutrecordentry.getDueDate().format(formatter));

		Button btnBackMenu = (Button) root.lookup("#btnBackMenu");

		btnBackMenu.setOnAction((event) -> {
			System.out.println(event);
			CheckoutController checkoutcontroller = new CheckoutController(this.user);
			try {
				checkoutcontroller.start(stage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		stage.show();
	}
}