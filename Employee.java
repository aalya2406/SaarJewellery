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
public class Employee {
    
    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;   
    private SimpleStringProperty salary;
    private SimpleStringProperty phone;
    private SimpleStringProperty attendance;    
    private SimpleStringProperty designation;
    private SimpleStringProperty gender;
    

    public Employee() {

    }

    public Employee(String firstName, String lastName, String salary,
	    String phone, String attendance, String designation, String gender) {	
	
	this.firstName = new SimpleStringProperty(firstName);
	this.lastName = new SimpleStringProperty(lastName);
	this.salary = new SimpleStringProperty(salary);
	this.phone = new SimpleStringProperty(phone);
	
	this.attendance = new SimpleStringProperty(attendance);	
	this.designation = new SimpleStringProperty(designation);
	this.gender = new SimpleStringProperty(gender);
    }
    
    

    public String getFirstName() {
	return firstName.get();
    }

    public String getLastName() {
	return lastName.get();
    }

    
    public String getSalary() {
	return salary.get();
    }
    
    public String getPhone() {
	return phone.get();
    }
    
    public String getAttendance() {
	return attendance.get();
    }
    
    public String getDesignation() {
	return designation.get();
    }
    
    
    public String getGender() {
	return gender.get();
    }

    

    public void setFirstName(String firstName) {
	this.firstName = new SimpleStringProperty(firstName);
    }

    public void setLastName(String lastName) {	
	this.lastName = new SimpleStringProperty(lastName);
    }

    public void setSalary(String salary) {	
	this.salary = new SimpleStringProperty(salary);
    }

    public void setPhone(String phone) {
	this.phone = new SimpleStringProperty(phone);
    }
    
    public void setAttendance(String attendance) {	
	this.attendance = new SimpleStringProperty(attendance);
    }

    public void setDesignation(String designation) {		
	this.designation = new SimpleStringProperty(designation);
    }

    

    public void setGender(String gender) {	
	this.gender = new SimpleStringProperty(gender);
    }

    
}
