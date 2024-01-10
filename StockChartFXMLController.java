/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import database.*;

/**
 * FXML Controller class
 *
 * @author    
 */
public class StockChartFXMLController implements Initializable {

    @FXML
    private BarChart<?, ?> materialChart;
    @FXML
    private NumberAxis yAxis;
    @FXML
    private CategoryAxis xAxis;

    private ArrayList<String> nameList;

    private ArrayList<String> quantityList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
	loadData();
	XYChart.Series set1 = new XYChart.Series<>();
	int no = nameList.size();
	for (int i = 0; i < no; i++) {
	    String name = nameList.get(i);
	    int quantity = Integer.parseInt(quantityList.get(i));
	    set1.getData().add(new XYChart.Data(name, quantity));
	}
	materialChart.getData().addAll(set1);
    }

    private void loadData() {

	//data = FXCollections.observableArrayList();
	try {
	    Database db = new Database();
	    Connection connection = db.openConnection();
	    Statement statement = connection.createStatement();
	    String sql = "SELECT * FROM product";
	    ResultSet result = statement.executeQuery(sql);

	    int count = 0;
	    nameList = new ArrayList<>();
	    quantityList = new ArrayList<>();
	    while (result.next()) {
		count++;
                
                String type = result.getString("Type");
		String size = result.getString("Size");
		String quantity = result.getString("Quantity");

		String description = result.getString("Description");
		String cost = result.getString("Cost");
                String discount = result.getString("Discount");
                
		nameList.add(type);
		quantityList.add(quantity);
	    }

	    System.out.println("Total number of records = " + count);
	    System.out.println("Total colour of records = " + nameList);
	    System.out.println("Total quantity of records = " + quantityList);
	} catch (SQLException e) {
	    e.printStackTrace();
	}
    }
}
