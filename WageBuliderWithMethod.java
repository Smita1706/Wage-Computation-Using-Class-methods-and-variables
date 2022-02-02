package com.bridgelabz.WageBuilder;

public class WageBuliderWithMethod {
	public static int IS_PART_TIME = 1;
	public static int IS_FULL_TIME = 2;
	public static int WAGE_PER_HOUR = 20;
	public static int NO_OF_DAYS = 20;
	public static int MAX_HOURS_IN_MONTH = 100;

	static int WorkingHour = 0;
	static int TotalWorkingHour = 0;
	static int TotalSalary = 0;
	static int Salary = 0;
	static int i = 0;

	public void WageCompute() {

		while(i < NO_OF_DAYS &&  TotalWorkingHour <= MAX_HOURS_IN_MONTH) {
			double empCheck = Math.floor(Math.random() * 10) % 3;
			int Check = (int)empCheck;
			switch(Check) {

			case 1:
				WorkingHour = 8;
				break;
			case 2 :
				WorkingHour = 4;
				break;
			default : 
				WorkingHour = 0;
				break;
			}
			i++;
			Salary = WAGE_PER_HOUR *  WorkingHour;
			TotalWorkingHour +=  WorkingHour;
			TotalSalary += Salary;
			System.out.println("salary is  : " + Salary);
		}
		System.out.println("total working hours are  : " + TotalWorkingHour);
		System.out.println("total salary is  : " + TotalSalary);

	}
	public static void main(String[] args) {

		WageBuliderWithMethod  w = new WageBuliderWithMethod ();
		w.WageCompute();

	}
}
