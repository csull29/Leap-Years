/*
 *LeapYearBool.java
 *@author C Sullivan
 23/03/17
 */

 public class LeapYearUsingBoolean{
	 //declare data members
	 private int year;
	 private boolean isLeap;

	 //constructor
	 public LeapYearUsingBoolean(){
		 year = 0;
		 isLeap = true;
	 }

	 //set method
	 public void setYear(int year){
		 this.year = year;
	 }

	 public void compute(){
		 if((year%4==0)&&(year%100!=0)){
			 isLeap = true;
		 }
		 else if(year%400==0){
			 isLeap = true;
		 }
		 else{
			 isLeap = false;
		 }
	 }

	 //get methods
	 public boolean getIsLeap(){
		 return isLeap;
	 }
 }