package control;

import control.tables.TableMappingBookCopyController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.domain.Book;
import model.domain.User;

public class BookCopyController extends Application {

	public static void main(String[] args) {
		Application.launch(BookCopyController.class, args);
	}
	private Book book;

	private User user;

	public BookCopyController() {
		// TODO Auto-generated constructor stub
		super();

	}

	public BookCopyController(Book newSelection, User user) {
		// TODO Auto-generated constructor stub
		super();
		this.book = newSelection;
		this.user=user;
	}

	@Override
	public void start(Stage stage) throws Exception {

		FXMLLoader root = new FXMLLoader(getClass().getResource("/view/templates/book-copy-list-and-create.fxml"));

		stage.setTitle("FXML Welcome" + this.book);

		TableMappingBookCopyController controller = new TableMappingBookCopyController(this.book, stage,this.user);

		root.setController(controller);
		stage.setScene(new Scene(root.load(), 600, 400));
		stage.show();
	}
}