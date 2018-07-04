package control.tables;

import java.net.URL;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ResourceBundle;

import control.BookCopyController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.dataaccess.DataAccess;
import model.dataaccess.DataAccessFacade;
import model.domain.Book;

/**
 *
 * @author ericjbruno
 */
public class TableMappingController implements Initializable {
	private Book book;
	private Stage primaryStage;

	public TableMappingController(Stage primaryStage) {

		this.primaryStage = primaryStage;
	}

	// The table and columns
	@FXML
	TableView<Book> itemTbl;

	@FXML
	TableColumn itemIsbn;
	@FXML
	TableColumn itemName;
	@FXML
	TableColumn itemCheckoutDate;

	// The table's data
	ObservableList<Book> data;

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		// Set up the table data
		itemIsbn.setCellValueFactory(new PropertyValueFactory<Book, String>("isbn"));
		itemName.setCellValueFactory(new PropertyValueFactory<Book, String>("title"));
		itemCheckoutDate.setCellValueFactory(new PropertyValueFactory<Book, Integer>("maxCheckoutLength"));
		data = FXCollections.observableArrayList();
		DataAccess db = new DataAccessFacade();
		HashMap<String, Book> books = db.readBooksMap();
		for (Entry<String, Book> entry : books.entrySet()) {
			data.add(entry.getValue());

		}

		itemTbl.setItems(data);

		itemTbl.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
			if (newSelection != null) {

				System.out.println(newSelection);
				System.out.println("sending selection");
				BookCopyController bookcontroller = new BookCopyController(newSelection);
				try {
					bookcontroller.start(this.primaryStage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

	}

	static long nextId = 1;

}
