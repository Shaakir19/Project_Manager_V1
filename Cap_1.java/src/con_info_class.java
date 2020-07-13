/*Task Number : 2
* File Name : con_info_class.java
* Written by : Shaakir Caroto
* Date Written : 06/04/2020
* The function of this class: This class is the used to hold and change the information received for the main program
* called main
* this holds the information for the contractor  */

public class con_info_class {

    /* Creating attributes for the class*/
    String name;
    String surname;
    String cell_number;
    String work_number;
    String address;
    String email;

    // this is a default constructor that has no variables and allows the user to assign values not variables to the attributes
    public con_info_class(){
        this.name = "John";
        this.surname = "Smith";
        this.cell_number = "0987653456";
        this.work_number = "0116782345";
        this.address = "33 Riley Rd, Rivonia, Sandton, 2199";
        this.email = "johnsmith@newcon.co.za";

    }

    // This is a get method that receives information from the main program
    // this allows the user to change the contractors cellphone number
    // This have a return function to return the output
    // This are not a void function therefore need a return function
    public String getCell_number(String up_cell){
        cell_number = up_cell;

        return cell_number;
}
    // This is a get method that receives information from the main program
    // this allows the user to change the contractors work number
    // This have a return function to return the output
    // This are not a void function therefore need a return function
    public String getWork_number(String up_work){
        work_number   = up_work;

        return work_number;
    }

    // This is a get method that receives information from the main program
    // this allows the user to change the contractors address
    // This have a return function to return the output
    // This are not a void function therefore need a return function
    public String getAddress(String up_address) {
        address  = up_address;

        return address;
    }

    // This is a get method that receives information from the main program
    // this allows the user to change the contractors email address
    // This have a return function to return the output
    // This are not a void function therefore need a return function
    public String getEmail(String up_email) {
        email  = up_email;

        return email;
    }

    //This toString function collects all the information from the class and displays then in a user-friendly manner
    // This have a return function to return the output
    // This are not a void function therefore need a return function
    public String toString(){
        System.out.println("The contractor's details: ");
        String con_details = "The contractor's full name : " + name + " " + surname+ "\n";
        con_details += "The contractor's cell number: " + cell_number+ "\n";
        con_details += "The contractor's work number: " + work_number+ "\n";
        con_details += "The contractor's address: " + address+ "\n";
        con_details += "The contractor's email: " + email+ "\n";

        return  con_details;
    }
}
