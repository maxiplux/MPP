package lesson6.labs.prob2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewFx extends Application {

	//// Defining JTextField
	private TextField jtInput;
	private TextField jtOutput;
	private GridPane grid;
	private GridPane gridleft;
	private GridPane gridright;

	private Button btnCountLetters;
	private Button btnReverseLetters;
	private Button btnRemoveDuplicates;
	private Scene scene;
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
		this.columnIndex = 0;
		this.rowIndex = 0;

		this.grid = gridSetUp(10, 20, 20);

		this.gridleft = gridSetUp(10, 20, 20);

		this.btnCountLetters = new Button("Count Letters");
		this.btnReverseLetters = new Button("Reverse Letters");
		this.btnRemoveDuplicates = new Button("Remove Duplicates");

		// LEFT COLUMN
		VBox leftColumn = new VBox(10);
		leftColumn.setAlignment(Pos.CENTER);

		gridleft.add(btnCountLetters, 0, 0);
		gridleft.add(btnReverseLetters, 0, 1);
		gridleft.add(btnRemoveDuplicates, 0, 2);

		// actions
		btnCountLetters.setOnAction((event) -> {
			String value = jtInput.getText();
			jtOutput.setText(String.valueOf(Util.countLetters(value)));
		});

		btnReverseLetters.setOnAction((event) -> {
			String value = jtInput.getText();
			jtOutput.setText(String.valueOf(Util.reverseLetters(value)));
		});

		btnRemoveDuplicates.setOnAction((event) -> {
			String value = jtInput.getText();
			jtOutput.setText(String.valueOf(Util.removeDuplicates(value)));
		});

		leftColumn.getChildren().add(gridleft);
		grid.add(leftColumn, 0, 0);

		// RIGHT COLUMN

		this.gridright = gridSetUp(0, 0, 0);

		this.jtInput = new TextField();
		this.jtInput.setPromptText("Input");

		this.jtOutput = new TextField();
		this.jtOutput.setPromptText("Output:");
		this.jtOutput.setEditable(false);

		gridright.add(new Label("Input:"), 0, 0);
		gridright.add(jtInput, 0, 1);
		gridright.add(new Label("Output:"), 0, 3);
		gridright.add(jtOutput, 0, 4);

		VBox rightColumn = new VBox(10);
		rightColumn.setAlignment(Pos.CENTER);
		rightColumn.getChildren().add(gridright);
		grid.add(rightColumn, 1, 0);

		this.bBuildScene(primaryStage);

	}

	private GridPane gridSetUp(int Hgap, int Bgap, int padding) {
		GridPane gg = new GridPane();
		gg.setAlignment(Pos.CENTER_LEFT);
		gg.setHgap(Hgap);
		gg.setVgap(Bgap);
		gg.setPadding(new Insets(padding, padding, padding, padding));
		return gg;
	}

	private void bBuildScene(Stage primaryStage) {
		scene = new Scene(grid, this.DEFAULT_WIDTH, this.DEFAULT_HEIGHT);
		scene.getStylesheets().add("/lesson6/labs/prob2/base.css");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
