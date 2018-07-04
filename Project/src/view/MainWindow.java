package view;

import control.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.domain.User;

public class MainWindow extends Application {
	public static void main(String[] args) {
		Application.launch(MainWindow.class, args);
	}

	private User user;

	public MainWindow(User user) {
		this.user = user;
	}

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader root = new FXMLLoader(getClass().getResource("/view/templates/main.fxml"));
		stage.setTitle("FXML");

		MainController controller = new MainController(stage, user);
		root.setController(controller);
		stage.setScene(new Scene(root.load(), 600, 275));

		stage.show();
	}
}
