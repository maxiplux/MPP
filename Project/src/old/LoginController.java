package old;

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
import model.domain.User;
import util.Util;

public class LoginController {
	
	@FXML
	private TextField userId;
	@FXML
	private TextField txtPassword;

	@FXML
	protected void handleLoginButtonAction(ActionEvent event) {
		
		DataAccess db = new DataAccessFacade();
		HashMap<String, User> users = db.readUserMap();
		boolean userOrIdWrong = true;
		for (Entry<String, User> entry : users.entrySet()) {
			String key = entry.getKey();
			User user = entry.getValue();
			if (user.authenticate(userId.getText(), txtPassword.getText())) {
				userOrIdWrong = false;
				
//				MainController secondWindow = new MainController();
//				try {
//					
//					secondWindow.show();
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}  
				
			}
		}
		if (userOrIdWrong) {
			Util.showAlert("User id or password Wrong ", "Error login", AlertType.ERROR);
		}

	}

}
