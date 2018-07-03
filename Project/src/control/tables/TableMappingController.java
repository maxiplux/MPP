package control.tables;

import model.domain.Book;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.Map.Entry;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.dataaccess.DataAccess;
import model.dataaccess.DataAccessFacade;
import model.domain.LibraryMember;


/**
 *
 * @author ericjbruno
 */
public class TableMappingController implements Initializable {

	public class Item {
		 
		public SimpleStringProperty getIsbn() {
			return Isbn;
		}
		
		public SimpleStringProperty getName() {
			return Name;
		}
		
		public SimpleStringProperty getCheckoutDate() {
			return CheckoutDate;
		}

		public SimpleStringProperty Isbn = new SimpleStringProperty();
		public SimpleStringProperty Name = new SimpleStringProperty();
		public SimpleStringProperty CheckoutDate = new SimpleStringProperty();
		
 
	}

	// The table and columns
	@FXML
	TableView<Item> itemTbl;

	@FXML
	TableColumn itemIsbn;
	@FXML
	TableColumn itemName;
	@FXML
	TableColumn itemCheckoutDate;


	// The table's data
	ObservableList<Item> data;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		
		
		// Set up the table data
		itemIsbn.setCellValueFactory(new PropertyValueFactory<Item, String>("Isbn"));
		itemName.setCellValueFactory(new PropertyValueFactory<Item, String>("Name"));
		itemCheckoutDate.setCellValueFactory(new PropertyValueFactory<Item, String>("CheckoutDate"));
		

		data = FXCollections.observableArrayList();
		
		DataAccess db = new DataAccessFacade();
		 HashMap<String, Book> books = db.readBooksMap();
		for (Entry<String, Book> entry : books.entrySet()) {
			Item new_item=new Item();
			new_item.Isbn.setValue(entry.getValue().getIsbn());
			new_item.Name.setValue(entry.getValue().getTitle());
			new_item.CheckoutDate.setValue(entry.getValue().getNextAvailableCopy().toString());
			
			
			
			data.add(new_item);
			
			

		}
	 
		
		
		itemTbl.setItems(data);
		itemTbl.refresh();
	}

	static long nextId = 1;

 
}
