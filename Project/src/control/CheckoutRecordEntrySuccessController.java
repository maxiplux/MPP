package control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.dataaccess.Auth;
import model.domain.CheckoutRecordEntry;
import util.Util;

public class CheckoutRecordEntrySuccessController extends Application {
	
	
	private CheckoutRecordEntry checkoutrecordentry;
	
	
	
	
	CheckoutRecordEntrySuccessController(CheckoutRecordEntry checkoutrecordentry)
	{
		super();		
		this.checkoutrecordentry=checkoutrecordentry;
	}


	public static void main(String[] args) {
		Application.launch(CheckoutRecordEntrySuccessController.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
		Parent root = FXMLLoader.load(getClass().getResource("/view/templates/checkoutbook-success.fxml"));
		stage.setTitle("FXML Welcome");
		
		
		stage.setScene(new Scene(root, 300, 300));
		
		Label lblIsbn = (Label) root.lookup("#lblIsbn");
		Label lblBookName = (Label) root.lookup("#lblBookName");
		Label lblMemberId = (Label) root.lookup("#lblMemberId");
		Label lblMemberName = (Label) root.lookup("#lblMemberName");
		Label lblCheckoutDate = (Label) root.lookup("#lblCheckoutDate");
		Label lblDueDate = (Label) root.lookup("#lblDueDate"); 
		
		
		Button btnBackMenu = (Button)root.lookup("#btnBackMenu");
		
		btnBackMenu.setOnAction((event) -> {
			System.out.println(event);
			CheckoutController checkoutcontroller = new CheckoutController();
			try {
				checkoutcontroller.start(stage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		});
		
		
		
		
		stage.show();
	}
}