package control;



 

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.domain.User;

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
        Parent root = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
        
        stage.setTitle("FXML Welcome");
        stage.setScene(new Scene(root, 600, 275));
        stage.show();
    }
    
    public static void main(String[] args) 
    {
        Application.launch(MainController.class, args);
    }
}