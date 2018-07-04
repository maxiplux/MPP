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
import view.MainWindow;

public class CheckEntriesMemberController extends Application {

	public static void main(String[] args) {
		Application.launch(CheckEntriesMemberController.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/view/templates/checkcheckoutsfromember.fxml"));
		
		stage.setTitle("FXML Welcome");
		stage.setScene(new Scene(root, 300, 300));
		
		TextField memberId = (TextField) root.lookup("#memberId");
		
		Button btnPrintConsole = (Button) root.lookup("#btnPrintConsole");
		
		
		btnPrintConsole.setOnAction((event) -> {
			boolean userOrIdWrong =true;

			DataAccess db = new DataAccessFacade();
			HashMap<String, LibraryMember> users = db.readMemberMap();
			
			for (Entry<String, LibraryMember> entry : users.entrySet()) {
				String key = entry.getKey();
				LibraryMember member = entry.getValue();
				
				if ( member.getMemberId().equals(memberId.getText()))
				{
					System.out.println("|ISBN\t\t|Book Name\t\t\t\t\t|checkout Date\t|dueDate\t|");
					for (CheckoutRecordEntry entrie : member.getCheckoutRecordEntries()) {
						System.out.println(entrie);
					}
					userOrIdWrong=false;
					
				} 
				}

			
			if (userOrIdWrong) {
				Util.showAlert("User id or password Wrong ", "Error login", AlertType.ERROR);
			}

		});
		
		
		
		
		stage.show();
	}
}