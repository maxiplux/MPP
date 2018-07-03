package control;



 

import java.util.HashMap;
import java.util.Map.Entry;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import model.dataaccess.DataAccess;
import model.dataaccess.DataAccessFacade;
import model.domain.User;
import util.Util;

public class MainController extends Application {
    private User user;
    
    public MainController() {
    	super();
    	 
    }
	public MainController(User user) {
		
		super();
		this.user=user;
    }
	
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/templates/main.fxml"));
        
        stage.setTitle("FXML Welcome");
        stage.setScene(new Scene(root, 600, 275));
        
        
        Button btnCheckoutBooks = (Button) root.lookup("#btnCheckoutBooks");
		btnCheckoutBooks.setOnAction((event) -> {
		 System.out.println("btnCheckoutBooks");
		});
		
		Button btnBooks = (Button) root.lookup("#btnBooks");
		btnBooks.setOnAction((event) -> {
		 System.out.println("btnBooks");
		});
		
		
		Button btnLibraryMembers = (Button) root.lookup("#btnLibraryMembers");
		btnLibraryMembers.setOnAction((event) -> {
		 System.out.println("btnLibraryMembers");
		});
		
		
		
        stage.show();
    }
    
    public static void main(String[] args) 
    {
        Application.launch(MainController.class, args);
    }
}