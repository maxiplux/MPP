package control.tables;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.dataaccess.DataAccess;
import model.dataaccess.DataAccessFacade;
import model.domain.Book;
import model.domain.BookCopy;

/**
 *
 * @author ericjbruno
 */
public class TableMappingBookCopyController implements Initializable {
	private Stage primaryStage;
	Book book;

	public TableMappingBookCopyController(Book book, Stage primaryStage) {
		super();
		this.book = book;
		this.primaryStage = primaryStage;
	}

	// The table and columns
	@FXML
	TableView<BookCopy> itemTbl;

	@FXML
	TableColumn CopyId;
	@FXML
	TableColumn isAvaible;

	@FXML
	Button btnnewCopy;

	// The table's data
	ObservableList<BookCopy> data;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		DataAccess db = new DataAccessFacade();
		// Set up the table data
		System.out.println("::::::::::::::::::::::::::");
		System.out.println(this.book.getNumCopies());
		System.out.println("::::::::::::::::::::::::::");

		CopyId.setCellValueFactory(new PropertyValueFactory<BookCopy, String>("copyNum"));
		isAvaible.setCellValueFactory(new PropertyValueFactory<BookCopy, String>("exists"));
		// checkoutBy.setCellValueFactory(new PropertyValueFactory<BookCopy,
		// Integer>("copyNum"));

		data = FXCollections.observableArrayList();

		HashMap<String, Book> books = db.readBooksMap();

		if (book.hasCopies()) {
			for (BookCopy bookCopy : book.getCopies()) {

				data.add(bookCopy);

			}

		}

		itemTbl.setItems(data);

		itemTbl.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
			if (newSelection != null) {
				System.out.println(newSelection);

			}
		});

		btnnewCopy.setOnAction((event) -> {

			BookCopy bookcopy = this.book.addCopy();
			data.add(bookcopy);

			db.saveAbook(this.book);

			itemTbl.refresh();

		});

		btnnewCopy.setOnAction((event) -> {

			BookCopy bookcopy = this.book.addCopy();
			data.add(bookcopy);

			db.saveAbook(this.book);

			itemTbl.refresh();

		});

	}

	static long nextId = 1;

}
