package control;



 

import control.tables.TableMappingBookCopyController;
import control.tables.TableMappingController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BookController extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
    	FXMLLoader  root = new FXMLLoader(getClass().getResource("/view/templates/book-list.fxml"));
 
    	
        
        
        stage.setTitle("FXML Welcome");
        TableMappingController controller = new TableMappingController(stage);
        root.setController(controller);        
        stage.setScene(new Scene(root.load(), 600, 400));
        
        
        
 
        
        stage.show();
    }
    
    public static void main(String[] args) 
    {
        Application.launch(BookController.class, args);
    }
}