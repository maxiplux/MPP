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
import model.domain.BookCopy;

/**
 *
 * @author ericjbruno
 */
public class TableMappingBookCopyController implements Initializable {
	private Stage primaryStage;
	Book book;
	public TableMappingBookCopyController()
	{
		super();
		
	}
	
	public TableMappingBookCopyController(Book book,Stage primaryStage)
	{
		super();
		this.book=book;
		this.primaryStage=primaryStage;
	}
	// The table and columns
	@FXML
	TableView<BookCopy> itemTbl;

	@FXML
	TableColumn CopyId;
	@FXML
	TableColumn isAvaible;
	@FXML
	TableColumn checkoutBy;

	// The table's data
	ObservableList<BookCopy> data;

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		// Set up the table data
		System.out.println("¿¿¿");
		System.out.println(this.book);
		System.out.println("¿¿¿");
		CopyId.setCellValueFactory(new PropertyValueFactory<BookCopy, String>("isbn"));
		isAvaible.setCellValueFactory(new PropertyValueFactory<BookCopy, String>("title"));
		checkoutBy.setCellValueFactory(new PropertyValueFactory<BookCopy, Integer>("maxCheckoutLength"));
		data = FXCollections.observableArrayList();
		DataAccess db = new DataAccessFacade();
		HashMap<String, Book> books = db.readBooksMap();
		for (Entry<String, Book> book : books.entrySet()) {
			if (book.getValue().hasCopies() )
			{
				for (BookCopy bookCopy : book.getValue().getCopies()) 
				{
					data.add(bookCopy);
					
				}
				
			}

		}

		itemTbl.setItems(data);
		
		itemTbl.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
		    if (newSelection != null) 
		    {
		        
		        
		    }
		});

	}

	static long nextId = 1;

}
