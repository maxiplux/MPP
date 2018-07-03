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
    private Stage primaryStage;
    
    public MainController() {
    	super();
    	 
    }
	public MainController(User user) {
		
		super();
		this.user=user;
    }
	
    @Override
    public void start(Stage stage) throws Exception {
    	this.primaryStage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/view/templates/main.fxml"));
        
        stage.setTitle("FXML");
        stage.setScene(new Scene(root, 600, 275));
        
        
        Button btnCheckoutBooks = (Button) root.lookup("#btnCheckoutBooks");
		btnCheckoutBooks.setOnAction((event) -> {
			CheckoutController checkoutcontroller = new CheckoutController();
			try {
				checkoutcontroller.start(this.primaryStage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		
		Button btnBooks = (Button) root.lookup("#btnBooks");
		btnBooks.setOnAction((event) -> {
			
		});
		
		
		Button btnLibraryMembers = (Button) root.lookup("#btnLibraryMembers");
		btnLibraryMembers.setOnAction((event) -> {
		 System.out.println("btnLibraryMembers");
		 
		 LibraryMemberController librarymember = new LibraryMemberController();
		 try {
			librarymember.start(this.primaryStage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		});
		
        stage.show();
    }
    
    public static void main(String[] args) 
    {
        Application.launch(MainController.class, args);
    }
}