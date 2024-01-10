/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;

import employees.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import objects.Client;
import database.Database;
import java.util.Properties;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

/**
 * FXML Controller class
 *
 * @author 
 */
public class ClientFXMLController implements Initializable {
    
    //Search
    /**
    @FXML
    private Pane pniSearch;

    @FXML
    private JFXButton btnSearchInS;

    @FXML
    private JFXTextField txtNameS;

    @FXML
    private TableView<Client> clientTableS;

    @FXML
    private TableColumn<Client, SimpleStringProperty> firstNameS;

    @FXML
    private TableColumn<Client, SimpleStringProperty> lastNameS;

    @FXML
    private TableColumn<Client, SimpleStringProperty> salaryS;

    @FXML
    private TableColumn<Client, SimpleStringProperty> phoneS;

    @FXML
    private TableColumn<Client, SimpleStringProperty> attendanceS;

    @FXML
    private TableColumn<Client, SimpleStringProperty> designationS;

    @FXML
    private TableColumn<Client, SimpleStringProperty> genderS;
    
    //Delete

    @FXML
    private Pane pniDelete;

    @FXML
    private JFXButton btnDeleteInD;

    @FXML
    private JFXButton btnViewD;

    @FXML
    private TableView<Client> clientTableD;

    @FXML
    private TableColumn<Client, SimpleStringProperty> firstNameD;

    @FXML
    private TableColumn<Client, SimpleStringProperty> lastNameD;

    @FXML
    private TableColumn<Client, SimpleStringProperty> salaryD;

    @FXML
    private TableColumn<Client, SimpleStringProperty> phoneD;

    @FXML
    private TableColumn<Client, SimpleStringProperty> attendanceD;

    @FXML
    private TableColumn<Client, SimpleStringProperty> designationD;

    @FXML
    private TableColumn<Client, SimpleStringProperty> genderD;
    
    //View

    @FXML
    private Pane pniView;

    @FXML
    private JFXButton btnViewInView;
    
    @FXML
    private JFXButton btnChartInView;

    @FXML
    private TableView<Client> clientTable;

    @FXML
    private TableColumn<Client, SimpleStringProperty> firstName;

    @FXML
    private TableColumn<Client, SimpleStringProperty> lastName;

    @FXML
    private TableColumn<Client, SimpleStringProperty> salary;

    @FXML
    private TableColumn<Client, SimpleStringProperty> phone;

    @FXML
    private TableColumn<Client, SimpleStringProperty> attendance;

    @FXML
    private TableColumn<Client, SimpleStringProperty> designation;

    @FXML
    private TableColumn<Client, SimpleStringProperty> gender;
    
    //Add

    @FXML
    private Pane pniAdd;

    @FXML
    private JFXTextField txtFirstName;

    @FXML
    private JFXTextField txtLastName;

    @FXML
    private JFXTextField txtSalary;

    @FXML
    private JFXTextField txtPhone;

    @FXML
    private JFXTextField txtAttendance;

    @FXML
    private JFXTextField txtDesignation;

    @FXML
    private JFXButton btnAddInSave;

    @FXML
    private JFXButton btnClear;

    @FXML
    private JFXTextField txtGender;
    
    //Edit

    @FXML
    private Pane pniEdit;

    @FXML
    private JFXButton btnEditInEdit;

    @FXML
    private JFXButton btnViewE;

    @FXML
    private JFXButton btnSelectE;

    @FXML
    private TableView<Client> clientTableU;

    @FXML
    private TableColumn<Client, SimpleStringProperty> firstNameU;

    @FXML
    private TableColumn<Client, SimpleStringProperty> lastNameU;

    @FXML
    private TableColumn<Client, SimpleStringProperty> salaryU;

    @FXML
    private TableColumn<Client, SimpleStringProperty> phoneU;

    @FXML
    private TableColumn<Client, SimpleStringProperty> attendanceU;

    @FXML
    private TableColumn<Client, SimpleStringProperty> designationU;

    @FXML
    private TableColumn<Client, SimpleStringProperty> genderU;

    @FXML
    private JFXTextField txtFirstNameU;

    @FXML
    private JFXTextField txtLastNameU;

    @FXML
    private JFXTextField txtSalaryU;

    @FXML
    private JFXTextField txtPhoneU;

    @FXML
    private JFXTextField txtAttendanceU;

    @FXML
    private JFXTextField txtDesignationU;

    @FXML
    private JFXTextField txtGenderU;

    @FXML
    private JFXButton btnSave;

    @FXML
    private JFXButton btnSearch;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnEdit;

    @FXML
    private JFXButton btnHome;

    @FXML
    private JFXButton btnView;
    
    private ObservableList<Client> dataV = FXCollections.observableArrayList();
    
    private ObservableList<Client> dataD = FXCollections.observableArrayList();

    private ObservableList<Client> dataS = FXCollections.observableArrayList();
    
    private ObservableList<Client> dataU = FXCollections.observableArrayList();
     
    */
    
    //ADD
    @FXML
    private Pane pniAdd;

    @FXML
    private JFXTextField txtClientID;

    @FXML
    private JFXTextField txtClientName;

    @FXML
    private JFXTextField txtContactNo;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXButton btnAddInSave;

    @FXML
    private JFXButton btnClear;
    
    //VIEW

    @FXML
    private Pane pniView;

    @FXML
    private JFXButton btnViewInView;

    @FXML
    private TableView<Client> clientTable;

    @FXML
    private TableColumn<Client, SimpleStringProperty> clientID;

    @FXML
    private TableColumn<Client, SimpleStringProperty> clientName;

    @FXML
    private TableColumn<Client, SimpleStringProperty> contactNo;

    @FXML
    private TableColumn<Client, SimpleStringProperty> emailAddress;

    @FXML
    private TableColumn<Client, SimpleStringProperty> address;

    @FXML
    private JFXButton btnChartInView;
    
    @FXML
    private JFXButton btnEmailV;

    @FXML
    private JFXTextField txtEmailV;

    @FXML
    private JFXTextField txtRecipientV;

    @FXML
    private JFXPasswordField txtPasswordV;
    
    //SEARCH
    @FXML
    private Pane pniSearch;

    @FXML
    private JFXButton btnSearchInS;

    @FXML
    private JFXTextField txtNameS;

    @FXML
    private TableView<Client> clientTableS;

    @FXML
    private TableColumn<Client, SimpleStringProperty> clientIDS;

    @FXML
    private TableColumn<Client, SimpleStringProperty> clientNameS;

    @FXML
    private TableColumn<Client, SimpleStringProperty> contactNoS;

    @FXML
    private TableColumn<Client, SimpleStringProperty> emailAddressS;

    @FXML
    private TableColumn<Client, SimpleStringProperty> addressS;
    
    //DELETE
    @FXML
    private Pane pniDelete;

    @FXML
    private JFXButton btnDeleteInD;

    @FXML
    private JFXButton btnViewD;

    @FXML
    private TableView<Client> clientTableD;

    @FXML
    private TableColumn<Client, SimpleStringProperty> clientIDD;

    @FXML
    private TableColumn<Client, SimpleStringProperty> clientNameD;

    @FXML
    private TableColumn<Client, SimpleStringProperty> contactNoD;

    @FXML
    private TableColumn<Client, SimpleStringProperty> emailAddressD;

    @FXML
    private TableColumn<Client, SimpleStringProperty> addressD;
    
    
    //UPDATE
    @FXML
    private Pane pniEdit;

    @FXML
    private JFXButton btnEditInEdit;

    @FXML
    private JFXButton btnViewE;

    @FXML
    private JFXButton btnSelectE;

    @FXML
    private JFXTextField txtNameU;

    @FXML
    private JFXTextField txtContactU;

    @FXML
    private JFXTextField txtEmailU;

    @FXML
    private JFXTextField txtAddressU;

    @FXML
    private JFXTextField txtFirstNameU;

    @FXML
    private JFXTextField txtFirstNameU1;

    @FXML
    private JFXTextField txtClientIDU;

    @FXML
    private TableView<Client> clientTableU;

    @FXML
    private TableColumn<Client, SimpleStringProperty> clientIDU;

    @FXML
    private TableColumn<Client, SimpleStringProperty> clientNameU;

    @FXML
    private TableColumn<Client, SimpleStringProperty> contactNoU;

    @FXML
    private TableColumn<Client, SimpleStringProperty> emailAddressU;

    @FXML
    private TableColumn<Client, SimpleStringProperty> addressU;

    @FXML
    private JFXButton btnSave;

    @FXML
    private JFXButton btnSearch;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnEdit;

    @FXML
    private JFXButton btnHome;

    @FXML
    private JFXButton btnView;
    
    private ObservableList<Client> dataV = FXCollections.observableArrayList();
    
    private ObservableList<Client> dataD = FXCollections.observableArrayList();

    private ObservableList<Client> dataS = FXCollections.observableArrayList();
    
    private ObservableList<Client> dataU = FXCollections.observableArrayList();


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
	// TODO
	
	pniAdd.toFront();
	
	clientID.setCellValueFactory(new PropertyValueFactory<>("clientID"));
	clientName.setCellValueFactory(new PropertyValueFactory<>("clientName"));
	contactNo.setCellValueFactory(new PropertyValueFactory<>("contactNo"));
	emailAddress.setCellValueFactory(new PropertyValueFactory<>("emailAddress"));
	address.setCellValueFactory(new PropertyValueFactory<>("address"));
	
	
	//Delete
	clientIDD.setCellValueFactory(new PropertyValueFactory<>("clientID"));
	clientNameD.setCellValueFactory(new PropertyValueFactory<>("clientName"));
	contactNoD.setCellValueFactory(new PropertyValueFactory<>("contactNo"));
	emailAddressD.setCellValueFactory(new PropertyValueFactory<>("emailAddress"));
	addressD.setCellValueFactory(new PropertyValueFactory<>("address"));
        
	//Search
	clientIDS.setCellValueFactory(new PropertyValueFactory<>("clientID"));
	clientNameS.setCellValueFactory(new PropertyValueFactory<>("clientName"));
	contactNoS.setCellValueFactory(new PropertyValueFactory<>("contactNo"));
	emailAddressS.setCellValueFactory(new PropertyValueFactory<>("emailAddress"));
	addressS.setCellValueFactory(new PropertyValueFactory<>("address"));
	
	//Update
	clientIDU.setCellValueFactory(new PropertyValueFactory<>("clientID"));
	clientNameU.setCellValueFactory(new PropertyValueFactory<>("clientName"));
	contactNoU.setCellValueFactory(new PropertyValueFactory<>("contactNo"));
	emailAddressU.setCellValueFactory(new PropertyValueFactory<>("emailAddress"));
	addressU.setCellValueFactory(new PropertyValueFactory<>("address"));
	
	
    }    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
	if (event.getSource() == btnSave) {
	    pniAdd.toFront();
	} else if (event.getSource() == btnView) {
	    pniView.toFront();
	    clientTable.getItems().clear();
	} else if (event.getSource() == btnSearch) {
	    pniSearch.toFront();
	    clientTableS.getItems().clear();
	} else if (event.getSource() == btnDelete) {
	    pniDelete.toFront();
	    clientTableD.getItems().clear();
	} else if (event.getSource() == btnEdit) {
	    pniEdit.toFront();
	    clientTableU.getItems().clear();
	} else if (event.getSource() == btnHome) {
	    Parent root = FXMLLoader.load(getClass().getResource("/mainWindow/MainFXML.fxml"));
	    Scene scene = new Scene(root);
	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    stage.setScene(scene);
	    stage.show();
	}
    }
    
    //ADD PRODUCT
    @FXML
    private void addClient(ActionEvent event) throws IOException, SQLException {
	Database db = new Database();
	Connection connection = db.openConnection();
	try {
	    Statement statement = connection.createStatement();

	    String id = txtClientID.getText();
	    String name = txtClientName.getText();
	    String contact = txtContactNo.getText();
	    String email = txtEmail.getText();
	    String address = txtAddress.getText();

	    //System.out.println(pn + "\t" + pt + "\t" + qt + "\t" + c + "\t" + p + "\t" + t + "\t" + s);
	    //String dob = dpDOB.getValue().toString();

	    String sql = "INSERT into client Values('" + id + "','" + name + "','"
		    + contact + "','" + email + "','" + address +"')";
	    int result = statement.executeUpdate(sql);
	    //System.out.println(result);
	    Alert al = new Alert(Alert.AlertType.INFORMATION);
	    al.setTitle("Added Client...");
	    al.setContentText("You have added new client successfully...");
	    //System.out.println("You have added new product successfully...");
	    al.setHeaderText(null);
	    al.showAndWait();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    @FXML
    private void clearAll(ActionEvent event) throws IOException {
	txtClientID.setText("");
	txtClientName.setText("");
	txtContactNo.setText("");
	txtEmail.setText("");
	txtAddress.setText("");
    }
    
    
    //VIEW PRODUCT
    @FXML
    private void viewClient(ActionEvent event) throws IOException, SQLException {
	clientTable.setVisible(true);
	Database db = new Database();
	Connection connection = db.openConnection();
	clientTable.getItems().clear();
	//data = FXCollections.observableArrayList();
	try {
	    Statement statement = connection.createStatement();
	    String sql = "SELECT * FROM client";
	    ResultSet result = statement.executeQuery(sql);
	    while (result.next()) {

		String id = result.getString("ClientID");
		String name = result.getString("ClientName");
		String contact = result.getString("ContactNo");

		String email = result.getString("EmailAddress");
		String address = result.getString("Address");

		dataV.addAll(new Client(id, name, contact, email, address));
		//lblRecord.setText(title+","+first+","+ last+","+ company+","+ email+","+ telephone+","+ fax+","+
		//	address+","+ bank+"," +country+","+ social+","+ stone+","+ exhibition);
	    }
	    clientTable.setItems(dataV);
	    //clientTable.getItems().addAll(data);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
     @FXML
    private void salaryChart(ActionEvent event) throws Exception {
	/**Parent root = FXMLLoader.load(getClass().getResource("/employee/ChartFXML.fxml"));
	Scene scene = new Scene(root);
	//Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	Stage stage = new Stage();
	stage.setScene(scene);
	stage.setTitle("  SALRY CHART  ");
	stage.centerOnScreen();
	stage.show();*/
    }
    
    @FXML
    public void sendEmail(ActionEvent event)throws IOException, AddressException, MessagingException //throws AddressException, MessagingException 
    {
	String from = txtEmailV.getText();	
	String password = txtPasswordV.getText();			
	String to =txtRecipientV.getText();	
	if (from.length()==0 || password.length()==0 || to.length()==0) {
	    Alert al = new Alert(Alert.AlertType.WARNING);
	    al.setTitle("Empty Fields");
	    al.setContentText("Please enter all the required data.");
	    al.setHeaderText(null);
	    al.showAndWait();
	    return;
	}
	String host = "smtp.gmail.com";
	Properties props = System.getProperties();
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.host", host);
	props.put("mail.smtp.user", from);
	props.put("mail.smtp.password", password);
	props.put("mail.smtp.port", "587");
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	
	Alert al = new Alert(Alert.AlertType.INFORMATION);
	al.setTitle("Sending Email...");
	al.setContentText("You have successfully sent email to "+txtRecipientV.getText()+".");
	al.setHeaderText(null);
	al.showAndWait();
    }
    
    //Search
    @FXML
    private void searchClient(ActionEvent event) throws IOException, SQLException {
	clientTableS.setVisible(true);
	Database db = new Database();
	Connection connection = db.openConnection();
	clientTableS.getItems().clear();
	String nm = txtNameS.getText();
	int index = -1;
	//data = FXCollections.observableArrayList();
	try {
	    Statement statement = connection.createStatement();
	    String sql = "SELECT * FROM client";
	    ResultSet result = statement.executeQuery(sql);
	    while (result.next()) {

		String id = result.getString("ClientID");
		String name = result.getString("ClientName");
		String contact = result.getString("ContactNo");

		String email = result.getString("EmailAddress");
		String address = result.getString("Address");

		

		

		if (name.equalsIgnoreCase(nm)) {
		    dataS.addAll(new Client(id, name, contact, email, address));
		    index = 0;
		}
		//lblRecord.setText(title+","+first+","+ last+","+ company+","+ email+","+ telephone+","+ fax+","+
		//	address+","+ bank+"," +country+","+ social+","+ stone+","+ exhibition);
	    }

	    if (index == -1) {
		Alert al = new Alert(Alert.AlertType.INFORMATION);
		al.setTitle("Search Unsuccessful...");
		al.setContentText("We could not find " + nm + " in our database.");
		al.setHeaderText(null);
		al.showAndWait();
	    } else {
		clientTableS.setItems(dataS);
	    }
	    //clientTable.getItems().addAll(data);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    //Delete
    
    @FXML
    private void viewClientInDelete(ActionEvent event) throws IOException, SQLException {
	clientTableD.setVisible(true);
	Database db = new Database();
	Connection connection = db.openConnection();
	clientTableD.getItems().clear();
	//data = FXCollections.observableArrayList();
	try {
	    Statement statement = connection.createStatement();
	    String sql = "SELECT * FROM client";
	    ResultSet result = statement.executeQuery(sql);
	    while (result.next()) {

		String id = result.getString("ClientID");
		String name = result.getString("ClientName");
		String contact = result.getString("ContactNo");

		String email = result.getString("EmailAddress");
		String address = result.getString("Address");

		dataD.addAll(new Client(id, name, contact, email, address));
		//lblRecord.setText(title+","+first+","+ last+","+ company+","+ email+","+ telephone+","+ fax+","+
		//	address+","+ bank+"," +country+","+ social+","+ stone+","+ exhibition);
	    }
	    clientTableD.setItems(dataD);
	    //clientTable.getItems().addAll(data);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    
    @FXML
    private void deleteClient(ActionEvent event) throws SQLException {
	TablePosition pos = clientTableD.getSelectionModel().getSelectedCells().get(0);

	int row = pos.getRow();
	Client obj = clientTableD.getItems().get(row);
	String cid = obj.getClientID();
	String cname = obj.getClientName();
	TableColumn col = pos.getTableColumn();

	// this gives the value in the selected cell:
	String value = (String) col.getCellObservableValue(obj).getValue();

	Alert al = new Alert(Alert.AlertType.CONFIRMATION);
	al.setTitle("Confirmation Dialogue");
	al.setContentText("Are you sure you want to delete this record?");
	al.setHeaderText(null);
	Optional<ButtonType> option = al.showAndWait();
	if (option.get() == ButtonType.OK) {
	
	    clientTableD.getItems().removeAll(clientTableD.getSelectionModel().getSelectedItem());
	    Database db = new Database();
	    Connection connection = db.openConnection();
	    //data = FXCollections.observableArrayList();
	    try {
		Statement statement = connection.createStatement();
		String sql = "DELETE FROM client Where ClientID = '" + cid + "' AND ClientName = '" + cname + "'";
		statement.executeUpdate(sql);
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}

    }
    
    //Update
    @FXML
    private void viewClientInUpdate(ActionEvent event) throws IOException, SQLException {
	clientTableU.setVisible(true);
	Database db = new Database();
	Connection connection = db.openConnection();
	clientTableU.getItems().clear();
	//data = FXCollections.observableArrayList();
	try {
	    Statement statement = connection.createStatement();
	    String sql = "SELECT * FROM client";
	    ResultSet result = statement.executeQuery(sql);
	    while (result.next()) {

		String id = result.getString("ClientID");
		String name = result.getString("ClientName");
		String contact = result.getString("ContactNo");

		String email = result.getString("EmailAddress");
		String address = result.getString("Address");

		dataV.addAll(new Client(id, name, contact, email, address));
		//lblRecord.setText(title+","+first+","+ last+","+ company+","+ email+","+ telephone+","+ fax+","+
		//	address+","+ bank+"," +country+","+ social+","+ stone+","+ exhibition);
	    }
	    clientTableU.setItems(dataU);
	    //clientTable.getItems().addAll(data);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    @FXML
    private void selectInUpdate(ActionEvent event) throws SQLException {
	TablePosition pos = clientTableU.getSelectionModel().getSelectedCells().get(0);

	int row = pos.getRow();
	Client obj = clientTableU.getItems().get(row);
	String record = obj.toString();
	
	txtClientIDU.setText(obj.getClientID());
	txtNameU.setText(obj.getClientName());
	//cbGender.setText(obj.getGender());
	txtContactU.setText(obj.getContactNo());
	txtEmailU.setText(obj.getEmailAddress());
	txtAddressU.setText(obj.getAddress());
	
	TableColumn col = pos.getTableColumn();

	// this gives the value in the selected cell:
	String value = (String) col.getCellObservableValue(obj).getValue();
    }
    
    @FXML
    private void updateClient(ActionEvent event) throws SQLException {
        
	TablePosition pos = clientTableU.getSelectionModel().getSelectedCells().get(0);

	int row = pos.getRow();
	Client obj = clientTableU.getItems().get(row);
//	String record = obj.toString();
//	lblRecord.setText(record);
//		
//	txtTitle.setText(obj.getTitle());
//	txtFirst.setText(obj.getFirst());
//	txtLast.setText(obj.getLast());

	Database db = new Database();
	Connection connection = db.openConnection();
	try {
	    Statement statement = connection.createStatement();
	    
	    String id = txtClientIDU.getText();
	    String name = txtNameU.getText();

	    String contact = txtContactU.getText();
	    String email = txtEmailU.getText();

	    String address = txtAddressU.getText();

	    //String sql = "INSERT into client Values('" + title +"','"+ first +"','"+ last +"','"+company+"','"+email+"','"+telephone+"','"+fax+"','"+address+"','"+bank+"','"+
	    //    country+"','"+social+"','"+stone+"','"+exhibition+"')";
	    String sql;
	    sql = "update client set ClientID='" + id + "',ClientName='" + name + "'," + "ContactNo='" + contact + "', "
		    + "EmailAddress='" + email + "', Addresss='" + address + "' "
		    + " where ClientID='" + obj.getClientID() + "' AND ClientName='"+obj.getClientName()+"'"; // And LastName='"+obj.getLast()+"'";
	    //System.out.println("Search Successful");
	    int result = statement.executeUpdate(sql);
	    Alert al = new Alert(Alert.AlertType.INFORMATION);
	    al.setTitle("Updated Client...");
	    al.setContentText("Client data has beed updated successfully...");
	    al.setHeaderText(null);
	    al.showAndWait();
	    
	    System.out.println(result);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
}
