package mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
   1. Handle the submit action
        a. The submit action should send the data submitted in the UI to the Employee model to build the employee.
   2. The employee data should be converted to a string and sent back to the GUI
       a. The GUI will then display it.
 */

public class EmployeeController extends JFrame{
    GUI view;
    Employee employee;

//    JTextField firstNameBox;
//    JTextField lastNameBox;
//    JTextField socialBox;
//    JTextField workPhoneBox;
//    JTextField homePhoneBox;
//    JTextField emailBox;
//    JTextField streetAddressBox;
//    JTextField aptNumberBox;
//    JTextField cityBox;
//    JTextField stateBox;
//    JTextField zipBox;
//
//    JLabel firstNameLabel;
//    JLabel lastNameLabel;
//    JLabel socialLabel;
//    JLabel workPhoneLabel;
//    JLabel homePhoneLabel;
//    JLabel emailLabel;
//    JLabel addressLabel;

    //JButton submitButton;


   public Employee handleSubmitAction(
           String firstNameBox,
           String lastNameBox,
           String socialBox,
           String workPhoneBox,
           String homePhoneBox,
           String emailBox,
           String streetAddressBox,
           String aptNumberBox,
           String cityBox,
           String stateBox,
           String zipBox
   ){
       //check for null/empty string

               Employee employee = new Employee(firstNameBox, lastNameBox);

               employee.setFirstName(firstNameBox);
               employee.setLastName(lastNameBox);
               employee.setSocialNumber(socialBox);
               employee.setWorkPhone(workPhoneBox);
               employee.setHomePhone(homePhoneBox);
               employee.setEmail(emailBox);
               employee.setStreetAddress(streetAddressBox);
               employee.setAptNumber(aptNumberBox);
               employee.setCity(cityBox);
               employee.setState(stateBox);
               employee.setZip(zipBox);

                return employee;
//               ("Your first name is: "+ employee.getFirstName());
//               ("Your last name is: "+ employee.getLastName()
//                       ("Your social is: "+ employee.getSocialNumber());
//               ("Your work phone is: "+ employee.getWorkPhone());
//               ("Your home phone is: "+ employee.getHomePhone(
//                       ("Your email is: "+ employee.getEmail());
//                       ("Your address is: "+ employee.getStreetAddress() + ' ' + employee.getAptNumber() + ' ' + employee.getCity() + ", " + employee.getState() + ' ' + employee.getZip());
   }
}