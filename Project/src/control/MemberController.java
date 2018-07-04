package control;

import java.util.HashMap;
import java.util.Map.Entry;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.dataaccess.DataAccess;
import model.dataaccess.DataAccessFacade;
import model.domain.Address;
import model.domain.LibraryMember;
import model.domain.User;
import util.Util;

public class MemberController {

	@FXML
	private TextField txtFirtsName;
	@FXML
	private TextField txtLastName;
	@FXML
	private TextField txtStreet;
	@FXML
	private TextField txtCity;
	@FXML
	private TextField txtState;
	@FXML
	private TextField txtZip;
	@FXML
	private TextField txtPhone;

	@FXML
	protected void addMemberButtonAction(ActionEvent event) {

		DataAccess db = new DataAccessFacade();
		HashMap<String, LibraryMember> users = db.readMemberMap();
		int mId= users.size();
		Address add= new Address(txtStreet.getText(), txtCity.getText(), txtState.getText(), txtZip.getText());
		LibraryMember lm = new  LibraryMember(mId+"", txtFirtsName.getText(),txtLastName.getText(), txtCity.getText(), add);
		
		db.saveNewMember(lm);
		

	}

}
