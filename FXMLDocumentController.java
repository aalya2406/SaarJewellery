/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saarjewelleryventure;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import database.Database;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
	

/**
 *
 * @author 
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private JFXButton btnLogin;

    @FXML
    private JFXButton btnClear;

    @FXML
    private JFXButton btnExit;

    @FXML
    private JFXTextField txtUsername;

    @FXML
    private JFXPasswordField txtPassword;

    @FXML
    private void handleButtonAction(ActionEvent event) {
	System.out.println("You clicked me!");
    }
    
    @FXML
    public void login(ActionEvent event) throws IOException, SQLException
    {
	String user=txtUsername.getText();
	String pass=txtPassword.getText();
	if (user.length()==0 || pass.length()==0) {
	    Alert al = new Alert(Alert.AlertType.WARNING);
	    al.setTitle("Empty Fields");
	    al.setContentText("Please enter Username & password");
	    al.setHeaderText(null);
	    al.showAndWait();
	    return;
	}
        Database db = new Database();
        Connection connection = db.openConnection();

        int index = -1;
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM allemployees";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {

                String id = result.getString("ID");
                String username = result.getString("Username");
                String password = result.getString("Password");
                if (user.equals("admin") && pass.equals(password)) {
                    // data.addAll(new Employee(id, name, gender, phone, email, department, designation, empType, salary));
                    Parent root = FXMLLoader.load(getClass().getResource("/mainWindow/MainFXML.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene);
                    stage.show();
                    index++;
                }
                else if (user.equals(username) && pass.equals(password)) {
                    // data.addAll(new Employee(id, name, gender, phone, email, department, designation, empType, salary));
                    Parent root = FXMLLoader.load(getClass().getResource("/mainWindow/MainFXML_1.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene);
                    stage.show();
                    index++;
                }
            }
            if (index == -1) {
                Alert al = new Alert(Alert.AlertType.INFORMATION);
                al.setTitle("Search Unsuccessful...");
                al.setContentText("We could not find " + user + " in our database.");
                al.setHeaderText(null);
                al.showAndWait();
            } else {
                //empTable.setItems(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        /**
	if (user.equals("admin") && pass.equals("admin")) {
	    Parent root = FXMLLoader.load(getClass().getResource("/mainWindow/MainFXML.fxml"));

	    Scene scene = new Scene(root);

	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    stage.setScene(scene);
	    stage.show();
	} else {
	    Alert al = new Alert(Alert.AlertType.WARNING);
	    al.setTitle("Wrong Username/Password");
	    al.setContentText("You have entered wrong Username/password");
	    al.setHeaderText(null);
	    al.showAndWait();
	}*/
        
	
	
    }
    
    @FXML
    public void clear(ActionEvent event)
    {
	txtUsername.setText("");
	txtPassword.setText("");
    }
    
    
    @FXML
    public void exit(ActionEvent event)
    {
	Platform.exit();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
	// TODO
    }    
    
}
