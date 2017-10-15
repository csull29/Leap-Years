/*
 *LeapYearBoolApp.java
 *@author C Sullivan
 23/03/17
 */
 import javax.swing.JOptionPane;
 public class LeapYearUsingBooleanApp{
	 public static void main(String args[]){
		 int year;
		 boolean isLeap;

		 LeapYearUsingBoolean myLeap = new LeapYearUsingBoolean();

		 year = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter year"));
		 myLeap.setYear(year);

		 myLeap.compute();

		 isLeap = myLeap.getIsLeap();

		 if(isLeap==true){
			 JOptionPane.showMessageDialog(null,"That is a Leap year");
		 }
		 else{
			 JOptionPane.showMessageDialog(null,"That is not a leap year");
		 }
	 }
 }