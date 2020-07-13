/*Task Number : 2
 * File Name : pro_info_class.java
 * Written by : Shaakir Caroto
 * Date Written : 06/04/2020
 * The function of this class: This class is the used to hold and change the information received for the main program
 * called main
 * this gives the information for the project */

public class pro_info_class {

    /* Creating attributes for the class*/
    String name_project;
    String company_name;
    String area_name;
    String due_date;
    float area_project;
    float fee_date;

    // This is the classes constructor that has variable
    // So you will need to assign the attributes to the constructor variables
    public pro_info_class (String name_project, String company_name, String area_name, String due_date, float area_project,float fee_date){
        this.name_project = name_project;
        this.company_name = company_name;
        this.area_name = area_name;
        this.due_date = due_date;
        this.area_project = area_project;
        this.fee_date = fee_date;
    }

    // This upDue_date method a allows the user to change the due_date of the function
    // This works as a get method
    // This have a return function to return the output
    // This are not a void function therefore need a return function
    public String upDue_date(String up_due){
        due_date  = up_due ;

        return due_date;
    }

    // This upFee_date method a allows the user to change the fee-date values of the function
    // This works as a get method
    // This have a return function to return the output
    // This are not a void function therefore need a return function
    public float upFee_date(float up_fee){
        fee_date  = up_fee ;

        return fee_date;
    }

    //This toString function collects all the information from the class and displays then in a user-friendly manner
    // This have a return function to return the output
    // This are not a void function therefore need a return function
    public String toString() {
       System.out.println("The project information: ");
       String finalize_project = "The project name : " + name_project+ "\n";
       finalize_project += "The company's name: "+ company_name+ "\n";
       finalize_project += "The name of the area in which the project to going: " + area_name+ "\n";
       finalize_project += "The project due date: " + due_date+ "\n";
       finalize_project += "The space of the project: " + area_project+ " square metres\n";
       finalize_project += "The fee to date amount: R" + fee_date+ "\n";
       return finalize_project;
    }
}
