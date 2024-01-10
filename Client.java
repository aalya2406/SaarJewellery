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
public class Client {

    private SimpleStringProperty clientID;
    private SimpleStringProperty clientName;
    private SimpleStringProperty contactNo;
    private SimpleStringProperty emailAddress;
    private SimpleStringProperty address;

    public Client(String clientID, String clientName, String contactNo, String emailAddress, String address) {
        this.clientID = new SimpleStringProperty(clientID);
        this.clientName = new SimpleStringProperty(clientName);
        this.contactNo = new SimpleStringProperty(contactNo);
        this.emailAddress = new SimpleStringProperty(emailAddress);
        this.address = new SimpleStringProperty(address);
    }

    public String getClientID() {
        return clientID.get();
    }

    public String getClientName() {
        return clientName.get();
    }

    public String getContactNo() {
        return contactNo.get();
    }

    public String getEmailAddress() {
        return emailAddress.get();
    }

    public String getAddress() {
        return address.get();
    }

    public void setClientID(String clientID) {
        this.clientID = new SimpleStringProperty(clientID);
    }

    public void setClientName(String clientName) {
        this.clientName = new SimpleStringProperty(clientName);
    }

    public void setContactNo(String contactNo) {
        this.contactNo = new SimpleStringProperty(contactNo);
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = new SimpleStringProperty(emailAddress);
    }

    public void setAddress(String address) {
        this.address = new SimpleStringProperty(address);
    }
    
    
}
