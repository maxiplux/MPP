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
import model.domain.CheckoutRecordEntry;
import model.domain.LibraryMember;
import model.domain.User;
import util.Util;

public class CheckEntriesMemberController extends Application {

	private User user;

	CheckEntriesMemberController(User user) {
		this.user = user;
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/view/templates/checkcheckoutsfromember.fxml"));

		stage.setTitle("FXML Welcome");
		stage.setScene(new Scene(root, 300, 300));

		TextField memberId = (TextField) root.lookup("#memberId");

		Button btnPrintConsole = (Button) root.lookup("#btnPrintConsole");
		Button btnBack = (Button) root.lookup("#btnBack");

		btnPrintConsole.setOnAction((event) -> {
			prinRecordToConsole(memberId.getText());
		});

		btnBack.setOnAction((event) -> {
			MainMenuController mainMenuController = new MainMenuController(user);
			try {
				mainMenuController.start(stage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		stage.show();
	}
	
	public void prinRecordToConsole(String memberId)
	{
		boolean userOrIdWrong = true;

		DataAccess db = new DataAccessFacade();
		HashMap<String, LibraryMember> users = db.readMemberMap();

		for (Entry<String, LibraryMember> entry : users.entrySet()) {
			String key = entry.getKey();
			LibraryMember member = entry.getValue();

			if (member.getMemberId().equals(memberId)) {
				System.out.println("|ISBN\t\t|Book Name\t\t\t\t\t|checkout Date\t|dueDate\t|");
				for (CheckoutRecordEntry entrie : member.getCheckoutRecordEntries()) {
					System.out.println(entrie);
				}
				userOrIdWrong = false;

			}
		}

		if (userOrIdWrong) {
			Util.showAlert("Member id No found", "Error", AlertType.ERROR);
		}
	}
}