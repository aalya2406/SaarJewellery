/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author 
 */
public class Product {
    
    private SimpleStringProperty type;
    private SimpleStringProperty size;   
    private SimpleStringProperty quantity;
    private SimpleStringProperty description;
    private SimpleStringProperty cost;    
    private SimpleStringProperty discount;
    
    public Product(String type,String size,String quantity, String description, String cost, String discount)
    {
        this.type = new SimpleStringProperty(type);
        this.size = new SimpleStringProperty(size);
        this.quantity = new SimpleStringProperty(quantity);
        this.description = new SimpleStringProperty(description);
        this.cost = new SimpleStringProperty(cost);
        this.discount = new SimpleStringProperty(discount);
    }

    public String getType() {
        return type.get();
    }

    public String getSize() {
        return size.get();
    }

    public String getQuantity() {
        return quantity.get();
    }

    public String getDescription() {
        return description.get();
    }

    public String getCost() {
        return cost.get();
    }

    public String getDiscount() {
        return discount.get();
    }

    public void setType(String type) {
        this.type = new SimpleStringProperty(type);
    }

    public void setSize(String size) {
        this.size = new SimpleStringProperty(size);
    }

    public void setQuantity(String quantity) {
        this.quantity = new SimpleStringProperty(quantity);
    }

    public void setDescription(String description) {
        this.description = new SimpleStringProperty(description);
    }

    public void setCost(String cost) {
        this.cost = new SimpleStringProperty(cost);
    }

    public void setDiscount(String discount) {
        this.discount = new SimpleStringProperty(discount);
    }
    
}
