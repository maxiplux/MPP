package control;

import control.tables.TableMappingController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.domain.User;

public class BookController extends Application {

	private User user;

	public BookController(User user) {
		this.user = user;
	}

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader root = new FXMLLoader(getClass().getResource("/view/templates/book-list.fxml"));

		stage.setTitle("FXML Welcome");
		TableMappingController controller = new TableMappingController(stage, this.user);
		root.setController(controller);
		stage.setScene(new Scene(root.load(), 600, 400));

		stage.show();
	}
}