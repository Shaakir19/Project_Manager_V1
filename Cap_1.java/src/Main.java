/*Task Number : 2
 * File Name : con_info_class.java
 * Written by : Shaakir Caroto
 * Date Written : 06/04/2020
 * The function of this class: This class is the used to hold and change the information received for the main program
 * called main  */

/*This is a java imported package that allows the program to read user inputs */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // assigning an object to the scanner
        // This is used in the input of options
        Scanner quest_in = new Scanner(System.in);

        // Allows the program to run until a break function is found.
        while (true) {

            //Telling the user what to input to the option variable
            System.out.println("Would you like to enter a new project(1) or view contractor details (2) please enter 1 or 2 : ");
            String option = quest_in.nextLine();

            // Using a switch statement to work with the different options
            switch (option) {


                // if the user inputs new project
                case "1":
                    System.out.println("You have chosen a new project");
                    // Assigning the an object to the scanner function
                    // this is function the inputs that will go to the classes
                    Scanner scan = new Scanner(System.in);

                    // Asking the user for inputs and assigning the value to different variable for the class
                    System.out.println("Please answer all the questions.");
                    System.out.print("Please the name of the new project : ");
                    String name_project = scan.nextLine();
                    System.out.print("Please the company name that is paying for the project : ");
                    String company_name = scan.nextLine();
                    System.out.print("Which area is the project being done : ");
                    String area_name = scan.nextLine();
                    System.out.print("Please enter the due date of the  project: ");
                    String due_date = scan.nextLine();
                    System.out.print("Please enter the fee to date amount: ");
                    float fee_to_date = scan.nextFloat();
                    System.out.print("Please enter the area of the project : ");
                    float area_project = scan.nextFloat();

                    // assigning the variables to the class and producing the toString for the class
                    pro_info_class pro_new = new pro_info_class(name_project, company_name, area_name, due_date, area_project, fee_to_date);
                    System.out.println(pro_new.toString());

                    // Asking the user for a new option inputs
                    // This is asking the user if the would like to finalize or change some details
                    System.out.println("Would you like to finalize the projects details or is there anything that needs to be changed.(enter yes or finalize): ");
                    String option_2 = quest_in.nextLine();

                    if (option_2.equals("yes")) {
                        // if the user inputs yes
                        // The user will see the following message telling them what they are able to change
                        // Also receiving inputs
                        // and calling the get methods*/
                        System.out.println("You are able to change the fee amount and the due date.");
                        System.out.println("Please input the same information for the option you don't want to change");
                        System.out.println("The due date: ");
                        scan.nextLine();
                        String up_due = scan.nextLine();
                        pro_new.upDue_date(up_due);
                        System.out.println("The fee to date amount: ");
                        float up_fee = scan.nextFloat();
                        pro_new.upFee_date(up_fee);


                        // This is the program displaying the changed details
                        System.out.println("The new details:");
                        System.out.println(pro_new.toString());
                        System.out.println("Thank you for the updates.");

                        // The user is then asking if they would like to finalize the program and break the loop
                        // if the don't enter finalize the loop will go all the way to the top of the loop and ask
                        System.out.println("Do you need to do more changes or do you want to finalize the project.");
                        String option_4 = quest_in.nextLine();
                        if (option_4.equals("finalize")) {
                            System.out.println("The project has been finalized");
                            break;
                        }

                    } else if (option_2.equals("finalize")) {
                        // the project will
                        System.out.println("The project has been finalized");
                        break;
                    }
                    // This is used to break the case
                    break;


                // if the user inputs "contractor details"
                case "2":
                    System.out.println("You have chosen to view contractor information");
                    //This calls the con_info_class
                    // no variables are needed to be assigned as the are no variables in the constructor
                    // And displaying the information by using the toString method
                    con_info_class con_new = new con_info_class();
                    System.out.println(con_new.toString());

                    // Asking the user if they would like to update the constructors information
                    System.out.println("Would you like to update any of the contractor's information");
                    String option_6 = quest_in.nextLine();

                    // if the user inputs "yes"
                    if (option_6.equals("yes")) {
                        // Creating a new scanner object
                        Scanner scan_2 = new Scanner(System.in);

                        // Telling the user what they are able to change
                        System.out.println("You are able to change the cell number, work number, address or the email address ");
                        System.out.println("Please input the same information for the option you don't want to change");

                        // The telling the user what to input where and collecting them by using the new scanner and new variables
                        // the classes function are being called
                        System.out.println("The cell number: ");
                        String up_cell = scan_2.nextLine();
                        con_new.getCell_number(up_cell);
                        System.out.println("The work number: ");
                        String up_work = scan_2.nextLine();
                        con_new.getWork_number(up_work);
                        System.out.println("The new address: ");
                        String up_address = scan_2.nextLine();
                        con_new.getAddress(up_address);
                        System.out.println("The new email address: ");
                        String up_email = scan_2.nextLine();
                        con_new.getEmail(up_email);

                        // Displaying the changes to the user
                        System.out.println("The new details:");
                        System.out.println(con_new.toString());
                        System.out.println("Thank you for the updates.");

                        // Asking if the user would like to finalize
                        // if not they will go back to the menu
                        System.out.println("Do you need to do more changes or do you want to finalize the project.");
                        String option_5 = quest_in.nextLine();
                        if (option_5.equals("finalize")) {
                            break;
                        }
                        System.out.println("You will go back to the main menu.");

                    } else if (option_6.equals("no")) {
                        // if they input no they will go back to the menu
                        System.out.println("You will go back to the main menu.");
                    }

                    // This breaks the case
                    break;

                    // if they input "exit" the case and switch statement will break and to the if statement at the bottom to break the loop
                case "exit":
                    System.out.println("Thank you");
                    break;

                // if the input is not one of the case above this message will display and the program will go to the main
                default:
                    System.out.println("Incorrect input.");
                    break;

            }
            // This is used to break the while true loop
            if (option.equals("exit")){
                break;
            }

        }
    }
}