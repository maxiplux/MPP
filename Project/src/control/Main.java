package control;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import util.Util;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;

public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/view/login.fxml"));

		stage.setTitle("Welcome MUM Library");
		stage.setScene(new Scene(root));
		
		TextField userId = (TextField) root.lookup("#userId");
		TextField txtPassword = (TextField) root.lookup("#txtPassword");

		Button button = (Button) root.lookup("#btnLogin");
		
		System.out.println(root.lookup("#btnLogin"));
		
		button.setOnAction((event) -> {
			Util.showAlert("User id or password Wrong ", "Error login", AlertType.ERROR);
			 
			
		});
			
	 
	 

		stage.show();

	}

	public static void main(String[] args) {
		Application.launch(Main.class, args);
	}

}
