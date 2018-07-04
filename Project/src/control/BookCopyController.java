package control;

import control.tables.TableMappingBookCopyController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.domain.Book;

public class BookCopyController extends Application {

	private Book book;

	public BookCopyController() {
		// TODO Auto-generated constructor stub
		super();

	}

	public BookCopyController(Book newSelection) {
		// TODO Auto-generated constructor stub
		super();
		this.book = newSelection;
	}

	@Override
	public void start(Stage stage) throws Exception {

		FXMLLoader root = new FXMLLoader(getClass().getResource("/view/templates/book-copy-list-and-create.fxml"));

		stage.setTitle("FXML Welcome" + this.book);

		TableMappingBookCopyController controller = new TableMappingBookCopyController(this.book, stage);

		root.setController(controller);
		stage.setScene(new Scene(root.load(), 600, 400));

		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(BookCopyController.class, args);
	}
}