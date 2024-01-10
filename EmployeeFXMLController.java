/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

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
import objects.Employee;
import database.Database;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * FXML Controller class
 *
 * @author 
 */
public class EmployeeFXMLController implements Initializable {
    
    //Search
    
    @FXML
    private Pane pniSearch;

    @FXML
    private JFXButton btnSearchInS;

    @FXML
    private JFXTextField txtNameS;

    @FXML
    private TableView<Employee> empTableS;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> firstNameS;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> lastNameS;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> salaryS;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> phoneS;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> attendanceS;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> designationS;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> genderS;
    
    //Delete

    @FXML
    private Pane pniDelete;

    @FXML
    private JFXButton btnDeleteInD;

    @FXML
    private JFXButton btnViewD;

    @FXML
    private TableView<Employee> empTableD;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> firstNameD;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> lastNameD;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> salaryD;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> phoneD;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> attendanceD;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> designationD;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> genderD;
    
    //View

    @FXML
    private Pane pniView;

    @FXML
    private JFXButton btnViewInView;
    
    @FXML
    private JFXButton btnChartInView;

    @FXML
    private TableView<Employee> empTable;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> firstName;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> lastName;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> salary;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> phone;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> attendance;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> designation;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> gender;
    
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
    private TableView<Employee> empTableU;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> firstNameU;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> lastNameU;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> salaryU;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> phoneU;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> attendanceU;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> designationU;

    @FXML
    private TableColumn<Employee, SimpleStringProperty> genderU;

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
    
    private ObservableList<Employee> dataV = FXCollections.observableArrayList();
    
    private ObservableList<Employee> dataD = FXCollections.observableArrayList();

    private ObservableList<Employee> dataS = FXCollections.observableArrayList();
    
    private ObservableList<Employee> dataU = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
	// TODO
	
	pniAdd.toFront();
	
	firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
	lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
	salary.setCellValueFactory(new PropertyValueFactory<>("salary"));
	phone.setCellValueFactory(new PropertyValueFactory<>("phone"));
	attendance.setCellValueFactory(new PropertyValueFactory<>("attendance"));
	designation.setCellValueFactory(new PropertyValueFactory<>("designation"));
	gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
	
	
	firstNameD.setCellValueFactory(new PropertyValueFactory<>("firstName"));
	lastNameD.setCellValueFactory(new PropertyValueFactory<>("lastName"));
	salaryD.setCellValueFactory(new PropertyValueFactory<>("salary"));
	phoneD.setCellValueFactory(new PropertyValueFactory<>("phone"));
	attendanceD.setCellValueFactory(new PropertyValueFactory<>("attendance"));
	designationD.setCellValueFactory(new PropertyValueFactory<>("designation"));
	genderD.setCellValueFactory(new PropertyValueFactory<>("gender"));
	
	
	firstNameS.setCellValueFactory(new PropertyValueFactory<>("firstName"));
	lastNameS.setCellValueFactory(new PropertyValueFactory<>("lastName"));
	salaryS.setCellValueFactory(new PropertyValueFactory<>("salary"));
	phoneS.setCellValueFactory(new PropertyValueFactory<>("phone"));
	attendanceS.setCellValueFactory(new PropertyValueFactory<>("attendance"));
	designationS.setCellValueFactory(new PropertyValueFactory<>("designation"));
	genderS.setCellValueFactory(new PropertyValueFactory<>("gender"));
	
	
	firstNameU.setCellValueFactory(new PropertyValueFactory<>("firstName"));
	lastNameU.setCellValueFactory(new PropertyValueFactory<>("lastName"));
	salaryU.setCellValueFactory(new PropertyValueFactory<>("salary"));
	phoneU.setCellValueFactory(new PropertyValueFactory<>("phone"));
	attendanceU.setCellValueFactory(new PropertyValueFactory<>("attendance"));
	designationU.setCellValueFactory(new PropertyValueFactory<>("designation"));
	genderU.setCellValueFactory(new PropertyValueFactory<>("gender"));
	
	
    }    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
	if (event.getSource() == btnSave) {
	    pniAdd.toFront();
	} else if (event.getSource() == btnView) {
	    pniView.toFront();
	    empTable.getItems().clear();
	} else if (event.getSource() == btnSearch) {
	    pniSearch.toFront();
	    empTableS.getItems().clear();
	} else if (event.getSource() == btnDelete) {
	    pniDelete.toFront();
	    empTableD.getItems().clear();
	} else if (event.getSource() == btnEdit) {
	    pniEdit.toFront();
	    empTableU.getItems().clear();
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
    private void addEmployee(ActionEvent event) throws IOException, SQLException {
	Database db = new Database();
	Connection connection = db.openConnection();
	try {
	    Statement statement = connection.createStatement();

	    String fn = txtFirstName.getText();
	    String ln = txtLastName.getText();

	    String sal = txtSalary.getText();
	    String ph = txtPhone.getText();

	    String at = txtAttendance.getText();
	    String des = txtDesignation.getText();
	    String g = txtGender.getText();

	    //System.out.println(pn + "\t" + pt + "\t" + qt + "\t" + c + "\t" + p + "\t" + t + "\t" + s);
	    //String dob = dpDOB.getValue().toString();

	    String sql = "INSERT into employee Values('" + fn + "','" + ln + "','"
		    + sal + "','" + ph + "','" + at + "','" + des + "','" + g + "')";
	    int result = statement.executeUpdate(sql);
	    //System.out.println(result);
	    Alert al = new Alert(Alert.AlertType.INFORMATION);
	    al.setTitle("Added Product...");
	    al.setContentText("You have added new product successfully...");
	    //System.out.println("You have added new product successfully...");
	    al.setHeaderText(null);
	    al.showAndWait();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    @FXML
    private void clearAll(ActionEvent event) throws IOException {
	txtFirstName.setText("");
	txtLastName.setText("");

	txtSalary.setText("");
	txtPhone.setText("");

	txtAttendance.setText("");
	txtDesignation.setText("");
	txtGender.setText("");
    }
    
    
    //VIEW PRODUCT
    @FXML
    private void viewEmployee(ActionEvent event) throws IOException, SQLException {
	empTable.setVisible(true);
	Database db = new Database();
	Connection connection = db.openConnection();
	empTable.getItems().clear();
	//data = FXCollections.observableArrayList();
	try {
	    Statement statement = connection.createStatement();
	    String sql = "SELECT * FROM employee";
	    ResultSet result = statement.executeQuery(sql);
	    while (result.next()) {

		String fn = result.getString("FirstName");
		String ln = result.getString("LastName");
		String sal = result.getString("Salary");

		String ph = result.getString("Phone");
		String at = result.getString("Attendance");
		String des = result.getString("Designation");
		String g = result.getString("Gender");

		dataV.addAll(new Employee(fn, ln, sal, ph, at,des,g));
		//lblRecord.setText(title+","+first+","+ last+","+ company+","+ email+","+ telephone+","+ fax+","+
		//	address+","+ bank+"," +country+","+ social+","+ stone+","+ exhibition);
	    }
	    empTable.setItems(dataV);
	    //clientTable.getItems().addAll(data);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
     @FXML
    private void exportToExcel(ActionEvent event) throws Exception {
	/**Parent root = FXMLLoader.load(getClass().getResource("/employee/ChartFXML.fxml"));
	Scene scene = new Scene(root);
	//Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	Stage stage = new Stage();
	stage.setScene(scene);
	stage.setTitle("  SALRY CHART  ");
	stage.centerOnScreen();
	stage.show();*/
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet spreadsheet = workbook.createSheet("sample");
        HSSFRow row = spreadsheet.createRow(0);
        for (int j = 0; j < empTable.getColumns().size(); j++) {
            row.createCell(j).setCellValue(empTable.getColumns().get(j).getText());
        }
        for (int i = 0; i < empTable.getItems().size(); i++) {
            row = spreadsheet.createRow(i + 1);
            for (int j = 0; j < empTable.getColumns().size(); j++) {
                if (empTable.getColumns().get(j).getCellData(i) != null) {
                    row.createCell(j).setCellValue(empTable.getColumns().get(j).getCellData(i).toString());
                } else {
                    row.createCell(j).setCellValue("");
                }
            }
        }
        FileOutputStream fileOut = new FileOutputStream("EmployeeList1.xls");
        workbook.write(fileOut);
        fileOut.close();
        Alert al = new Alert(Alert.AlertType.INFORMATION);
        al.setTitle("Exported to Excel File...");
        al.setContentText("You have created new excel file using table records successfully...");
        al.setHeaderText(null);
        al.showAndWait();
    }
    
    //Search
    @FXML
    private void searchEmployee(ActionEvent event) throws IOException, SQLException {
	empTableS.setVisible(true);
	Database db = new Database();
	Connection connection = db.openConnection();
	empTableS.getItems().clear();
	String nm = txtNameS.getText();
	int index = -1;
	//data = FXCollections.observableArrayList();
	try {
	    Statement statement = connection.createStatement();
	    String sql = "SELECT * FROM employee";
	    ResultSet result = statement.executeQuery(sql);
	    while (result.next()) {

		String fn = result.getString("FirstName");
		String ln = result.getString("LastName");
		String sal = result.getString("Salary");

		String ph = result.getString("Phone");
		String at = result.getString("Attendance");
		String des = result.getString("Designation");
		String g = result.getString("Gender");

		

		if (nm.equalsIgnoreCase(fn)) {
		    dataS.addAll(new Employee(fn, ln, sal, ph, at,des,g));
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
		empTableS.setItems(dataS);
	    }
	    //clientTable.getItems().addAll(data);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    //Delete
    
    @FXML
    private void viewEmployeeInDelete(ActionEvent event) throws IOException, SQLException {
	empTableD.setVisible(true);
	Database db = new Database();
	Connection connection = db.openConnection();
	empTableD.getItems().clear();
	//data = FXCollections.observableArrayList();
	try {
	    Statement statement = connection.createStatement();
	    String sql = "SELECT * FROM employee";
	    ResultSet result = statement.executeQuery(sql);
	    while (result.next()) {

		String fn = result.getString("FirstName");
		String ln = result.getString("LastName");
		String sal = result.getString("Salary");

		String ph = result.getString("Phone");
		String at = result.getString("Attendance");
		String des = result.getString("Designation");
		String g = result.getString("Gender");

		dataD.addAll(new Employee(fn, ln, sal, ph, at,des,g));
		//lblRecord.setText(title+","+first+","+ last+","+ company+","+ email+","+ telephone+","+ fax+","+
		//	address+","+ bank+"," +country+","+ social+","+ stone+","+ exhibition);
	    }
	    empTableD.setItems(dataD);
	    //clientTable.getItems().addAll(data);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    
    @FXML
    private void deleteEmployee(ActionEvent event) throws SQLException {
	TablePosition pos = empTableD.getSelectionModel().getSelectedCells().get(0);

	int row = pos.getRow();
	Employee obj = empTableD.getItems().get(row);
	String fn = obj.getFirstName();
	String ln = obj.getLastName();
	TableColumn col = pos.getTableColumn();

	// this gives the value in the selected cell:
	String value = (String) col.getCellObservableValue(obj).getValue();

	Alert al = new Alert(Alert.AlertType.CONFIRMATION);
	al.setTitle("Confirmation Dialogue");
	al.setContentText("Are you sure you want to delete this record?");
	al.setHeaderText(null);
	Optional<ButtonType> option = al.showAndWait();
	if (option.get() == ButtonType.OK) {
	
	    empTableD.getItems().removeAll(empTableD.getSelectionModel().getSelectedItem());
	    Database db = new Database();
	    Connection connection = db.openConnection();
	    //data = FXCollections.observableArrayList();
	    try {
		Statement statement = connection.createStatement();
		String sql = "DELETE FROM employee Where FirstName = '" + fn + "' AND LastName = '" + ln + "'";
		statement.executeUpdate(sql);
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}

    }
    
    //Update
    @FXML
    private void viewEmployeeInUpdate(ActionEvent event) throws IOException, SQLException {
	empTableU.setVisible(true);
	Database db = new Database();
	Connection connection = db.openConnection();
	empTableU.getItems().clear();
	//data = FXCollections.observableArrayList();
	try {
	    Statement statement = connection.createStatement();
	    String sql = "SELECT * FROM employee";
	    ResultSet result = statement.executeQuery(sql);
	    while (result.next()) {

		String fn = result.getString("FirstName");
		String ln = result.getString("LastName");
		String sal = result.getString("Salary");

		String ph = result.getString("Phone");
		String at = result.getString("Attendance");
		String des = result.getString("Designation");
		String g = result.getString("Gender");

		dataU.addAll(new Employee(fn, ln, sal, ph, at,des,g));
		//lblRecord.setText(title+","+first+","+ last+","+ company+","+ email+","+ telephone+","+ fax+","+
		//	address+","+ bank+"," +country+","+ social+","+ stone+","+ exhibition);
	    }
	    empTableU.setItems(dataU);
	    //clientTable.getItems().addAll(data);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    @FXML
    private void selectInUpdate(ActionEvent event) throws SQLException {
	TablePosition pos = empTableU.getSelectionModel().getSelectedCells().get(0);

	int row = pos.getRow();
	Employee obj = empTableU.getItems().get(row);
	String record = obj.toString();
	
	txtFirstNameU.setText(obj.getFirstName());
	txtLastNameU.setText(obj.getLastName());
	//cbGender.setText(obj.getGender());
	txtSalaryU.setText(obj.getSalary());
	txtPhoneU.setText(obj.getPhone());
	txtAttendanceU.setText(obj.getAttendance());
	txtDesignationU.setText(obj.getDesignation());
	txtGenderU.setText(obj.getGender());
	
	TableColumn col = pos.getTableColumn();

	// this gives the value in the selected cell:
	String value = (String) col.getCellObservableValue(obj).getValue();
    }
    
    @FXML
    private void updateEmployee(ActionEvent event) throws SQLException {
        
	TablePosition pos = empTableU.getSelectionModel().getSelectedCells().get(0);

	int row = pos.getRow();
	Employee obj = empTableU.getItems().get(row);
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
	    
	    String pn = txtFirstNameU.getText();
	    String pt = txtLastNameU.getText();

	    String qt = txtSalaryU.getText();
	    String c = txtPhoneU.getText();

	    String p = txtAttendanceU.getText();
	    String t = txtDesignationU.getText();
	    String s = txtGenderU.getText();


	    //String sql = "INSERT into client Values('" + title +"','"+ first +"','"+ last +"','"+company+"','"+email+"','"+telephone+"','"+fax+"','"+address+"','"+bank+"','"+
	    //    country+"','"+social+"','"+stone+"','"+exhibition+"')";
	    String sql;
	    sql = "update employee set FirstName='" + pn + "',LastName='" + pt + "'," + "Salary='" + qt + "', "
		    + "Phone='" + c + "', Attendance='" + p + "', Designation='" + t + "', Gender='" + s + "' "
		    + " where FirstName='" + obj.getFirstName() + "' AND LastName='"+obj.getLastName()+"'"; // And LastName='"+obj.getLast()+"'";
	    //System.out.println("Search Successful");
	    int result = statement.executeUpdate(sql);
	    Alert al = new Alert(Alert.AlertType.INFORMATION);
	    al.setTitle("Updated Employee...");
	    al.setContentText("Employee data has beed updated successfully...");
	    al.setHeaderText(null);
	    al.showAndWait();
	    
	    System.out.println(result);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
}
