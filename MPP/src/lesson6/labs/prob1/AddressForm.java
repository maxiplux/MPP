package lesson6.labs.prob1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.ColumnConstraints;
import javafx.stage.Stage;

public class AddressForm extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Address Form");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		// grid.setGridLinesVisible(true);

		ColumnConstraints col = new ColumnConstraints();
		col.setPercentWidth(10);
		grid.getColumnConstraints().addAll(col, col, col, col);
		// Name
		Label nameLabel = new Label("Name: ");
		grid.add(nameLabel, 0, 0, 2, 1);

		TextField nameField = new TextField();
		grid.add(nameField, 0, 1, 2, 1);

		// Street
		Label streetLabel = new Label("Street: ");
		grid.add(streetLabel, 2, 0, 2, 1);

		TextField streetField = new TextField();
		grid.add(streetField, 2, 1, 2, 1);

		// Street
		Label cityLabel = new Label("City: ");
		grid.add(cityLabel, 4, 0, 2, 1);

		TextField cityField = new TextField();
		grid.add(cityField, 4, 1, 2, 1);

		GridPane grid2 = new GridPane();
		grid2.setAlignment(Pos.CENTER);
		grid2.setHgap(10);

		// State
		Label stateLabel = new Label("State: ");
		grid2.add(stateLabel, 0, 2, 2, 1);

		TextField stateField = new TextField();
		grid2.add(stateField, 0, 3, 2, 1);

		// Zip
		Label zipLabel = new Label("Zip: ");
		grid2.add(zipLabel, 2, 2, 2, 1);

		TextField zipField = new TextField();
		grid2.add(zipField, 2, 3, 2, 1);

		HBox row2 = new HBox(10);
		row2.setAlignment(Pos.CENTER);
		row2.getChildren().add(grid2);

		grid.add(row2, 0, 2, 8, 1);

		// Submit
		Button btn = new Button("Submit");
		HBox row3 = new HBox(10);
		row3.setAlignment(Pos.CENTER);
		row3.getChildren().add(btn);
		grid.add(row3, 0, 3, 8, 1);

		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println(nameField.getText());
				System.out.println(streetField.getText());
				System.out.print(stateField.getText() + ", " + zipField.getText());
			}
		});

		Scene scene = new Scene(grid);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
