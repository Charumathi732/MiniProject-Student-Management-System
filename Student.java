package studentdatabaseapp;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 600; 
	private static int id = 1000;
	
	//constructor: prompt user to enter students name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student first name:");
		this.firstName = in.nextLine();
		
		System.out.println("Enter Student last name:");
		this.lastName = in.nextLine();
		
		System.out.println("1-  Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level:");
		this.gradeYear = in.nextLine();
		
		setStudentID();
}
	
	//Generate an ID
	private void setStudentID() {
		//Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	//Enroll in courses
	public void enroll() {
		//Get inside a loop, user hits 0
		do {
		System.out.println("Enter course to enroll(Q to quit):");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals("Q")){
			courses = courses +  "\n"+ course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else {
			System.out.println("BREAK!");
			break;
			}
	} while (1 != 0);
		
		
	}
       //view balance
	public void viewBalance() {
		System.out.println("Your balance is:$" + tuitionBalance);
	}
	//Pay Tuition 
	public void payTuition()
	{
		System.out.println("Enter your payment:$");
		Scanner in = new Scanner(System.in);
	 	int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("ThanYou for your payment of $" + payment);
		viewBalance();
	}
		//Show status
public String toString()
{
	return "Name:" + firstName + " " + lastName +
			"\nGrade Level: " + gradeYear +
			"\nStudent ID: " + studentID +
			"\nCourses Enrolled:" + courses +
			"\nBalance: $" + tuitionBalance;
}
}


