/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
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
import objects.Product;
import database.Database;
import java.awt.Desktop;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import javafx.scene.control.Hyperlink;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * FXML Controller class
 *
 * @author
 */
public class ProductFXMLController implements Initializable {

    //Search
    /**
     * @FXML private Pane pniSearch;
     *
     * @FXML private JFXButton btnSearchInS;
     *
     * @FXML private JFXTextField txtNameS;
     *
     * @FXML private TableView<Product> productTableS;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> firstNameS;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> lastNameS;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> salaryS;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> phoneS;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> attendanceS;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> designationS;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> genderS;
     *
     * //Delete
     *
     * @FXML private Pane pniDelete;
     *
     * @FXML private JFXButton btnDeleteInD;
     *
     * @FXML private JFXButton btnViewD;
     *
     * @FXML private TableView<Product> productTableD;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> firstNameD;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> lastNameD;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> salaryD;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> phoneD;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> attendanceD;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> designationD;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> genderD;
     *
     * //View
     *
     * @FXML private Pane pniView;
     *
     * @FXML private JFXButton btnViewInView;
     *
     * @FXML private JFXButton btnChartInView;
     *
     * @FXML private TableView<Product> productTable;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> firstName;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> lastName;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> salary;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> phone;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> attendance;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> designation;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> gender;
     *
     * //Add
     *
     * @FXML private Pane pniAdd;
     *
     * @FXML private JFXTextField txtFirstName;
     *
     * @FXML private JFXTextField txtLastName;
     *
     * @FXML private JFXTextField txtSalary;
     *
     * @FXML private JFXTextField txtPhone;
     *
     * @FXML private JFXTextField txtAttendance;
     *
     * @FXML private JFXTextField txtDesignation;
     *
     * @FXML private JFXButton btnAddInSave;
     *
     * @FXML private JFXButton btnClear;
     *
     * @FXML private JFXTextField txtGender;
     *
     * //Edit
     *
     * @FXML private Pane pniEdit;
     *
     * @FXML private JFXButton btnEditInEdit;
     *
     * @FXML private JFXButton btnViewE;
     *
     * @FXML private JFXButton btnSelectE;
     *
     * @FXML private TableView<Product> productTableU;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> firstNameU;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> lastNameU;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> salaryU;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> phoneU;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> attendanceU;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> designationU;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> genderU;
     *
     * @FXML private JFXTextField txtFirstNameU;
     *
     * @FXML private JFXTextField txtLastNameU;
     *
     * @FXML private JFXTextField txtSalaryU;
     *
     * @FXML private JFXTextField txtPhoneU;
     *
     * @FXML private JFXTextField txtAttendanceU;
     *
     * @FXML private JFXTextField txtDesignationU;
     *
     * @FXML private JFXTextField txtGenderU;
     *
     * @FXML private JFXButton btnSave;
     *
     * @FXML private JFXButton btnSearch;
     *
     * @FXML private JFXButton btnDelete;
     *
     * @FXML private JFXButton btnEdit;
     *
     * @FXML private JFXButton btnHome;
     *
     * @FXML private JFXButton btnView;
     *
     * private ObservableList<Product> dataV = FXCollections.observableArrayList();
     *
     * private ObservableList<Product> dataD = FXCollections.observableArrayList();
     *
     * private ObservableList<Product> dataS = FXCollections.observableArrayList();
     *
     * private ObservableList<Product> dataU = FXCollections.observableArrayList();
     *
     *
     *
     * //ADD
     * @FXML private Pane pniAdd;
     *
     * @FXML private JFXTextField txtProductID;
     *
     * @FXML private JFXTextField txtProductName;
     *
     * @FXML private JFXTextField txtContactNo;
     *
     * @FXML private JFXTextField txtEmail;
     *
     * @FXML private JFXTextField txtAddress;
     *
     * @FXML private JFXButton btnAddInSave;
     *
     * @FXML private JFXButton btnClear;
     *
     * //VIEW
     *
     * @FXML private Pane pniView;
     *
     * @FXML private JFXButton btnViewInView;
     *
     * @FXML private TableView<Product> productTable;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> productID;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> productName;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> contactNo;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> emailAddress;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> address;
     *
     * @FXML private JFXButton btnChartInView;
     *
     * //SEARCH
     * @FXML private Pane pniSearch;
     *
     * @FXML private JFXButton btnSearchInS;
     *
     * @FXML private JFXTextField txtNameS;
     *
     * @FXML private TableView<Product> productTableS;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> productIDS;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> productNameS;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> contactNoS;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> emailAddressS;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> addressS;
     *
     * //DELETE
     * @FXML private Pane pniDelete;
     *
     * @FXML private JFXButton btnDeleteInD;
     *
     * @FXML private JFXButton btnViewD;
     *
     * @FXML private TableView<Product> productTableD;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> productIDD;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> productNameD;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> contactNoD;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> emailAddressD;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> addressD;
     *
     *
     * //UPDATE
     * @FXML private Pane pniEdit;
     *
     * @FXML private JFXButton btnEditInEdit;
     *
     * @FXML private JFXButton btnViewE;
     *
     * @FXML private JFXButton btnSelectE;
     *
     * @FXML private JFXTextField txtNameU;
     *
     * @FXML private JFXTextField txtContactU;
     *
     * @FXML private JFXTextField txtEmailU;
     *
     * @FXML private JFXTextField txtAddressU;
     *
     * @FXML private JFXTextField txtFirstNameU;
     *
     * @FXML private JFXTextField txtFirstNameU1;
     *
     * @FXML private JFXTextField txtProductIDU;
     *
     * @FXML private TableView<Product> productTableU;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> productIDU;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> productNameU;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> contactNoU;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> emailAddressU;
     *
     * @FXML private TableColumn<Product, SimpleStringProperty> addressU;
     *
     * @FXML private JFXButton btnSave;
     *
     * @FXML private JFXButton btnSearch;
     *
     * @FXML private JFXButton btnDelete;
     *
     * @FXML private JFXButton btnEdit;
     *
     * @FXML private JFXButton btnHome;
     *
     * @FXML private JFXButton btnView;
     */
    //View
    @FXML
    private Pane pniView;

    @FXML
    private JFXButton btnViewInView;

    @FXML
    private TableView<Product> productTable;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodType;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodSize;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodQuantity;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodDescription;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodCost;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodDiscount;

    @FXML
    private JFXButton btnChartInView;

    //Delete
    @FXML
    private Pane pniDelete;

    @FXML
    private JFXButton btnDeleteInD;

    @FXML
    private JFXButton btnViewD;

    @FXML
    private TableView<Product> productTableD;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodTypeD;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodSizeD;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodQuantityD;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodDescriptionD;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodCostD;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodDiscountD;

    //Search
    @FXML
    private Pane pniSearch;

    @FXML
    private JFXButton btnSearchInS;

    @FXML
    private JFXTextField txtNameS;

    @FXML
    private TableView<Product> productTableS;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodTypeS;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodSizeS;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodQuantityS;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodDescriptionS;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodCostS;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodDiscountS;

    //Update
    @FXML
    private Pane pniEdit;

    @FXML
    private JFXButton btnEditInEdit;

    @FXML
    private JFXButton btnViewE;

    @FXML
    private JFXButton btnSelectE;

    @FXML
    private JFXComboBox<String> cbTypeU;

    @FXML
    private JFXTextField txtQuantityU;

    @FXML
    private JFXTextField txtDescriptionU;

    @FXML
    private JFXTextField txtCostU;

    @FXML
    private JFXTextField txtDiscountU;

    @FXML
    private JFXTextField txtFirstNameU;

    @FXML
    private JFXTextField txtFirstNameU1;

    @FXML
    private JFXTextField txtSizeU;

    @FXML
    private TableView<Product> productTableU;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodTypeU;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodSizeU;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodQuantityU;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodDescriptionU;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodCostU;

    @FXML
    private TableColumn<Product, SimpleStringProperty> prodDiscountU;

    //Add
    @FXML
    private Pane pniAdd;

    @FXML
    private JFXTextField txtSize;

    @FXML
    private JFXTextField txtQuantity;

    @FXML
    private JFXTextField txtDescription;

    @FXML
    private JFXTextField txtCost;

    @FXML
    private JFXButton btnAddInSave;

    @FXML
    private JFXButton btnClear;

    @FXML
    private JFXTextField txtDiscount;

    @FXML
    private Hyperlink hlinkGold;

    @FXML
    private JFXComboBox<String> cbType;

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

    private ObservableList<Product> dataV = FXCollections.observableArrayList();

    private ObservableList<Product> dataD = FXCollections.observableArrayList();

    private ObservableList<Product> dataS = FXCollections.observableArrayList();

    private ObservableList<Product> dataU = FXCollections.observableArrayList();

    private ObservableList<String> typeList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        typeList = FXCollections.observableArrayList("Earrings", "Rings", "Necklace");
        cbType.getItems().removeAll(cbType.getItems());
        cbType.setItems(typeList);

        typeList = FXCollections.observableArrayList("Earrings", "Rings", "Necklace");
        cbTypeU.getItems().removeAll(cbType.getItems());
        cbTypeU.setItems(typeList);

        pniAdd.toFront();

        //View
        prodType.setCellValueFactory(new PropertyValueFactory<>("type"));
        prodSize.setCellValueFactory(new PropertyValueFactory<>("size"));
        prodQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        prodDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        prodCost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        prodDiscount.setCellValueFactory(new PropertyValueFactory<>("discount"));

        //Delete
        prodTypeD.setCellValueFactory(new PropertyValueFactory<>("type"));
        prodSizeD.setCellValueFactory(new PropertyValueFactory<>("size"));
        prodQuantityD.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        prodDescriptionD.setCellValueFactory(new PropertyValueFactory<>("description"));
        prodCostD.setCellValueFactory(new PropertyValueFactory<>("cost"));
        prodDiscountD.setCellValueFactory(new PropertyValueFactory<>("discount"));

        //Search
        prodTypeS.setCellValueFactory(new PropertyValueFactory<>("type"));
        prodSizeS.setCellValueFactory(new PropertyValueFactory<>("size"));
        prodQuantityS.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        prodDescriptionS.setCellValueFactory(new PropertyValueFactory<>("description"));
        prodCostS.setCellValueFactory(new PropertyValueFactory<>("cost"));
        prodDiscountS.setCellValueFactory(new PropertyValueFactory<>("discount"));

        //Update
        prodTypeU.setCellValueFactory(new PropertyValueFactory<>("type"));
        prodSizeU.setCellValueFactory(new PropertyValueFactory<>("size"));
        prodQuantityU.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        prodDescriptionU.setCellValueFactory(new PropertyValueFactory<>("description"));
        prodCostU.setCellValueFactory(new PropertyValueFactory<>("cost"));
        prodDiscountU.setCellValueFactory(new PropertyValueFactory<>("discount"));

    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if (event.getSource() == btnSave) {
            pniAdd.toFront();
        } else if (event.getSource() == btnView) {
            pniView.toFront();
            productTable.getItems().clear();
        } else if (event.getSource() == btnSearch) {
            pniSearch.toFront();
            productTableS.getItems().clear();
        } else if (event.getSource() == btnDelete) {
            pniDelete.toFront();
            productTableD.getItems().clear();
        } else if (event.getSource() == btnEdit) {
            pniEdit.toFront();
            productTableU.getItems().clear();
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
    private void addProduct(ActionEvent event) throws IOException, SQLException {
        Database db = new Database();
        Connection connection = db.openConnection();
        try {
            Statement statement = connection.createStatement();

            String type = cbType.getValue();
            String size = txtSize.getText();
            String quantity = txtQuantity.getText();
            String description = txtDescription.getText();
            String cost = txtCost.getText();
            String discount = txtDiscount.getText();

            //System.out.println(pn + "\t" + pt + "\t" + qt + "\t" + c + "\t" + p + "\t" + t + "\t" + s);
            //String dob = dpDOB.getValue().toString();
            String sql = "INSERT into product Values(" + null + ",'" + type + "','"
                    + size + "','" + quantity + "','" + description + "','" + cost + "','" + discount + "')";
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
        cbType.setValue("Select type");
        txtSize.setText("");
        txtQuantity.setText("");
        txtDescription.setText("");
        txtCost.setText("");
        txtDiscount.setText("");
    }

    //VIEW PRODUCT
    @FXML
    private void viewProduct(ActionEvent event) throws IOException, SQLException {
        productTable.setVisible(true);
        Database db = new Database();
        Connection connection = db.openConnection();
        productTable.getItems().clear();
        //data = FXCollections.observableArrayList();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM product";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {

                String type = result.getString("Type");
                String size = result.getString("Size");
                String quantity = result.getString("Quantity");

                String description = result.getString("Description");
                String cost = result.getString("Cost");
                String discount = result.getString("Discount");

                dataV.addAll(new Product(type, size, quantity, description, cost, discount));
                //lblRecord.setText(title+","+first+","+ last+","+ company+","+ email+","+ telephone+","+ fax+","+
                //	address+","+ bank+"," +country+","+ social+","+ stone+","+ exhibition);
            }
            productTable.setItems(dataV);
            //productTable.getItems().addAll(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void productChart(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/products/StockChartFXML.fxml"));
        Scene scene = new Scene(root);
        //Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(" :: PRODUCT CHART PAGE :: ");
        stage.centerOnScreen();
        stage.show();
    }
    
    @FXML
    private void openURL(ActionEvent event) throws Exception {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("https://www.gold-rate.co.in/diamond-rates/mumbai-diamond-rate-today/"));
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (URISyntaxException e1) {
                e1.printStackTrace();
            }
        }
    }

    //Search
    @FXML
    private void searchProduct(ActionEvent event) throws IOException, SQLException {
        productTableS.setVisible(true);
        Database db = new Database();
        Connection connection = db.openConnection();
        productTableS.getItems().clear();
        String nm = txtNameS.getText();
        int index = -1;
        //data = FXCollections.observableArrayList();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM product";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {

                String type = result.getString("Type");
                String size = result.getString("Size");
                String quantity = result.getString("Quantity");

                String description = result.getString("Description");
                String cost = result.getString("Cost");
                String discount = result.getString("Discount");

                if (type.equalsIgnoreCase(nm)) {
                    dataS.addAll(new Product(type, size, quantity, description, cost, discount));
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
                productTableS.setItems(dataS);
            }
            //productTable.getItems().addAll(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Delete
    @FXML
    private void viewProductInDelete(ActionEvent event) throws IOException, SQLException {
        productTableD.setVisible(true);
        Database db = new Database();
        Connection connection = db.openConnection();
        productTableD.getItems().clear();
        //data = FXCollections.observableArrayList();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM product";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {

                String type = result.getString("Type");
                String size = result.getString("Size");
                String quantity = result.getString("Quantity");

                String description = result.getString("Description");
                String cost = result.getString("Cost");
                String discount = result.getString("Discount");

                dataD.addAll(new Product(type, size, quantity, description, cost, discount));
                //lblRecord.setText(title+","+first+","+ last+","+ company+","+ email+","+ telephone+","+ fax+","+
                //	address+","+ bank+"," +country+","+ social+","+ stone+","+ exhibition);
            }
            productTableD.setItems(dataD);
            //productTable.getItems().addAll(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void deleteProduct(ActionEvent event) throws SQLException {
        TablePosition pos = productTableD.getSelectionModel().getSelectedCells().get(0);

        int row = pos.getRow();
        Product obj = productTableD.getItems().get(row);
        String t = obj.getType();
        String s = obj.getSize();
        TableColumn col = pos.getTableColumn();

        // this gives the value in the selected cell:
        String value = (String) col.getCellObservableValue(obj).getValue();

        Alert al = new Alert(Alert.AlertType.CONFIRMATION);
        al.setTitle("Confirmation Dialogue");
        al.setContentText("Are you sure you want to delete this record");
        al.setHeaderText(null);
        Optional<ButtonType> option = al.showAndWait();
        if (option.get() == ButtonType.OK) {

            productTableD.getItems().removeAll(productTableD.getSelectionModel().getSelectedItem());
            Database db = new Database();
            Connection connection = db.openConnection();
            //data = FXCollections.observableArrayList();
            try {
                Statement statement = connection.createStatement();
                String sql = "DELETE FROM product Where Type = '" + t + "' AND Size = '" + s + "'";
                statement.executeUpdate(sql);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    //Update
    @FXML
    private void viewProductInUpdate(ActionEvent event) throws IOException, SQLException {
        productTableU.setVisible(true);
        Database db = new Database();
        Connection connection = db.openConnection();
        productTableU.getItems().clear();
        //data = FXCollections.observableArrayList();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM product";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {

                String type = result.getString("Type");
                String size = result.getString("Size");
                String quantity = result.getString("Quantity");

                String description = result.getString("Description");
                String cost = result.getString("Cost");
                String discount = result.getString("Discount");

                dataU.addAll(new Product(type, size, quantity, description, cost, discount));
                //lblRecord.setText(title+","+first+","+ last+","+ company+","+ email+","+ telephone+","+ fax+","+
                //	address+","+ bank+"," +country+","+ social+","+ stone+","+ exhibition);
            }
            productTableU.setItems(dataU);
            //productTable.getItems().addAll(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void selectInUpdate(ActionEvent event) throws SQLException {
        TablePosition pos = productTableU.getSelectionModel().getSelectedCells().get(0);

        int row = pos.getRow();
        Product obj = productTableU.getItems().get(row);
        String record = obj.toString();

        cbType.setValue(obj.getType());
        txtSizeU.setText(obj.getSize());
        txtQuantityU.setText(obj.getQuantity());
        //cbGender.setText(obj.getGender());
        txtDescriptionU.setText(obj.getDescription());
        txtCostU.setText(obj.getCost());
        txtDiscountU.setText(obj.getDiscount());

        TableColumn col = pos.getTableColumn();

        // this gives the value in the selected cell:
        String value = (String) col.getCellObservableValue(obj).getValue();
    }

    @FXML
    private void updateProduct(ActionEvent event) throws SQLException {

        TablePosition pos = productTableU.getSelectionModel().getSelectedCells().get(0);

        int row = pos.getRow();
        Product obj = productTableU.getItems().get(row);
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

            String type = cbType.getValue();
            String size = txtSize.getText();
            String quantity = txtQuantity.getText();
            String description = txtDescription.getText();
            String cost = txtCost.getText();
            String discount = txtDiscount.getText();

            //String sql = "INSERT into product Values('" + title +"','"+ first +"','"+ last +"','"+company+"','"+email+"','"+telephone+"','"+fax+"','"+address+"','"+bank+"','"+
            //    country+"','"+social+"','"+stone+"','"+exhibition+"')";
            String sql;
            sql = "update product set Type='" + type + "',Size='" + size + "'," + "Quantity='" + quantity + "', "
                    + "Description='" + description + "', Cost='" + cost + "' " + "', Discount='" + discount + "' "
                    + " where Type='" + obj.getType() + "' AND Size='" + obj.getSize() + "'"; // And LastName='"+obj.getLast()+"'";
            //System.out.println("Search Successful");
            int result = statement.executeUpdate(sql);
            Alert al = new Alert(Alert.AlertType.INFORMATION);
            al.setTitle("Updated Product...");
            al.setContentText("Product data has beed updated successfully...");
            al.setHeaderText(null);
            al.showAndWait();

            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
