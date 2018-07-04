package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginWindow extends Application {
	public static void main(String[] args) {
		Application.launch(LoginWindow.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/view/templates/login.fxml"));

		stage.setTitle("Welcome MUM Library");
		stage.setScene(new Scene(root));

		stage.show();

	}

}
