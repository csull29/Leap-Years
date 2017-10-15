/*
 *LeapYearBoolApp.java
 *@author C Sullivan
 23/03/2017
 */
 import javax.swing.JOptionPane;
 public class LeapYearApp{
	 public static void main(String args[]){
		 int year;
		 String message;

		 LeapYear myLeap = new LeapYear();

		 year = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter year"));
		 myLeap.setYear(year);

		 myLeap.compute();

		 message = myLeap.getMessage();


		JOptionPane.showMessageDialog(null,message);

	 }
 }