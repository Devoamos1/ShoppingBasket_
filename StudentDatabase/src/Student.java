import java.util.Scanner;

public class Student {

	
	private String firstname;
	private String lastname;
	private int gradeYear;
	private String courses = "";
	private String StudentID;
	private int tuitionBalance = 0;
	
	//Attributes of all objects
	
	private static int costOfCourse = 600;
	private static int id = 1000;

	
	
	public Student (){
		
		Scanner StudentInput = new Scanner(System.in); //Take input from console
		
		System.out.print("Enter student firstname: ");//Prompt
		this.firstname = StudentInput.nextLine();
		
		System.out.print("Enter students lastname: ");
		this.lastname = StudentInput.nextLine();
		
		System.out.print("Enter graduation year \n 1.Primary school \n 2.Secondary school\n 3.College \n 4.University");
		this.gradeYear = StudentInput.nextInt();
//		if (StudentInput.nextInt() = 1 ) {
		
		setStudentID();
		
		System.out.println(firstname + " "+ lastname + " "+ gradeYear + " "+ StudentID);
		
//		}
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	//Generate ID
	private void setStudentID() {//Created a method to fulfil a requirement
		
		id++;
		StudentID = gradeYear + "" + id;

	}


	public String getStudentID() {
		return StudentID;
	}

	
	//Constructor: prompt user to add name and year
	
	
	
	//Enroll onto course

	public void Enroll(){

		do {
			System.out.print("Enter course to enroll (Q) to quit");
			Scanner courseinput = new Scanner (System.in);
			String course  = courseinput.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;//Add course to courses
				tuitionBalance = tuitionBalance + costOfCourse;

			}else {
				break;
			}	
		}while (1 !=0); {
			System.out.print("Enrolled onto " + courses ); 
		    System.out.print ("Your fee is " + tuitionBalance);
		}
	}
	
	
	
	//View balance
	
	//Pay tuition 
	
	//Show status
	
}