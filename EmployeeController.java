package mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EmployeeController extends JFrame{
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
   }
}
