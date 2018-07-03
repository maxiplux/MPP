package lesson6.labs.prob2;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 

public class ViewFx extends Application {
	
	//// Defining JTextField
	private TextField jtInput;
	private TextField jtOutput;
	private GridPane grid;

	private Button btnCountLetters;
	private Button btnReverseLetters;
	private Button btnRemoveDuplicates;
	private Scene scene ;
	int columnIndex;
	int rowIndex;

	public static final int DEFAULT_WIDTH = 400;
	public static final int DEFAULT_HEIGHT = 275;
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		primaryStage.setTitle("String utility");
		this.columnIndex=0;
		this.rowIndex=0;

		
		
		this.grid=new GridPane();
		this.grid.setAlignment(Pos.CENTER_LEFT);
		this.grid.setHgap(10);
		this.grid.setVgap(50);
		int padding=20;
		this.grid.setPadding(new Insets(padding, padding,padding, padding));
		
		
		
		this.btnCountLetters = new Button("Count Letters");
		this.btnReverseLetters = new Button("Reverse Letters");
		this.btnRemoveDuplicates = new Button("Remove Duplicates");
		

		btnCountLetters.setOnAction((event) -> {
			  String value=jtInput.getText();
			  jtOutput.setText(String.valueOf( Util.countLetters(value)));
		});
		
		btnReverseLetters.setOnAction((event) -> {
			 String value=jtInput.getText();
			  jtOutput.setText(String.valueOf( Util.reverseLetters(value)));
		});
		
		btnRemoveDuplicates.setOnAction((event) -> {
			 String value=jtInput.getText();
			  jtOutput.setText(String.valueOf( Util.removeDuplicates(value)));
		});
		
		
		HBox boxCountLetters = new HBox(10);
		boxCountLetters.setAlignment(Pos.BOTTOM_LEFT);
		boxCountLetters.getChildren().add(this.btnCountLetters);
		
		
		
		HBox boxReverseLetters = new HBox(10);
		boxReverseLetters.setAlignment(Pos.BOTTOM_LEFT);
		boxReverseLetters.getChildren().add(this.btnReverseLetters);
		
		
		HBox boxRemoveDuplicates = new HBox(10);
		boxRemoveDuplicates.setAlignment(Pos.CENTER_LEFT);
		boxRemoveDuplicates.getChildren().add(this.btnRemoveDuplicates);
		
		this.grid.add(boxCountLetters,this.columnIndex, this.rowIndex);
		this.rowIndex++;
		this.grid.add(boxReverseLetters,this.columnIndex, 1);
		this.rowIndex++;
		this.grid.add(boxRemoveDuplicates,this.columnIndex, 2);
		
		
		this.jtInput= new TextField();		
		this.jtInput.setPromptText("Input");
		 
		
		HBox boxjtInput = new HBox(50);
		boxjtInput.setAlignment(Pos.TOP_CENTER);
		boxjtInput.getChildren().add( new Label("Input:"));
		boxjtInput.getChildren().add(jtInput);
		
		 
		grid.add(boxjtInput, 1, 0);
		
		this.jtOutput= new TextField();		
		this.jtOutput.setPromptText("Output:");
		this.jtOutput.setEditable(false);		
		
		HBox boxjtOutput = new HBox(45);
		boxjtOutput.setAlignment(Pos.BOTTOM_LEFT);
		boxjtOutput.getChildren().add( new Label("Output:"));
		boxjtOutput.getChildren().add(jtOutput);
		
		grid.add(boxjtOutput, 1, 1);
		
		


		
		
		
		this.bBuildScene(primaryStage);
		
		
		
	}
	private void bBuildScene(Stage primaryStage) 
	{
		scene = new Scene(grid, this.DEFAULT_WIDTH, this.DEFAULT_HEIGHT);
		scene.getStylesheets().add("/lesson6/labs/prob2/base.css");
		primaryStage.setScene(scene);		
		primaryStage.show();
	}

}
