package Calender;
import java.util.Scanner;

public class SelectDate {
	public static void main(String[] args) {
		int month, day, year; //initialize the variables for the date input
		Scanner scan = new Scanner(System.in);
		//get the user input
		System.out.println("Enter a date using \"MM DD YYYY\" format: ");
		month = scan.nextInt();
		day = scan.nextInt();
		year = scan.nextInt();
		scan.close();
		//call the date checking function
		SelectDate dateCheck = new SelectDate();
		boolean valid = dateCheck.dateChecker(month, day, year);
		
	}
	
	public boolean dateChecker(int month, int day, int year) {
		boolean valid;
		System.out.println("You Entered: " + month + " " + day + " " + year);
		if(0 >= month || month > 12 || 0 >= day || day > 31 || year < 1000) {
			valid = false;
			System.out.println("Invlaid input");
		}else {
			valid = true;
			System.out.println("Valid input");
		}
		return valid;
	}
}
