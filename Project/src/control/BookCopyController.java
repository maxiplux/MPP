package control;



 

import control.tables.TableMappingBookCopyController;
import control.tables.TableMappingController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
    	this.book=newSelection;
	}

	@Override
    public void start(Stage stage) throws Exception {
        
		FXMLLoader  root = new FXMLLoader(getClass().getResource("/view/templates/book-copy-list-and-create.fxml"));
 
    	
        
        
        stage.setTitle("FXML Welcome");
        TableMappingBookCopyController controller = new TableMappingBookCopyController(this.book,stage);        
      
        
        stage.setScene(new Scene(root.load(), 600, 400));
        root.setController(controller);
        
      
        
        stage.show();
    }
    
    public static void main(String[] args) 
    {
        Application.launch(BookCopyController.class, args);
    }
}