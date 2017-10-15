/*
 *LeapYear.java
 *@author C Sullivan
 23/03/2017
 */

 public class LeapYear{
	 //declare data members
	 private int year;
	 private String message;

	 //constructor
	 public LeapYear(){
		 year = 0;
		 message = " ";
	 }

	 //set method
	 public void setYear(int year){
		 this.year = year;
	 }

	 public void compute(){
		 if((year%4==0)&&(year%100!=0)){
			 message = "Is a leap year";
		 }
		 else if(year%400==0){
			 message = "Is a leap year";
		 }
		 else{
			 message = "Not a leap year";
		 }
	 }

	 //get methods
	 public String getMessage(){
		 return message;
	 }
 }