package criminalinvestigationdatabase;

import java.util.Scanner;

public class Officer{
    private String firstName;
    private String lastName;
    private int joinyear;
    private String encounters = null;
    private String officerID;
    private int salary=0;
    private static int bonus=600;
	private static int id=2000;
	
    //constructor to initialize name and joinyear
	
    public Officer(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter officer's first name:");
        this.firstName = in.nextLine();
        
        System.out.print("enter officer's last name:");
        this.lastName = in.nextLine();
        
        System.out.print("1) 1 years\n2)2 years\n3)3 years\n4)4 years \nENTER YEAR");
        this.joinyear = in.nextInt();
		
		setofficerID();
		
		
		
    }
    //generate id
    
	private void setofficerID(){
		//join year + ID
		id++;
		this.officerID = joinyear +""+ id;
	}
	
    //bonus
    
	public void bonuses() {
		do {
			System.out.print("Enter bonus amount for encounters, Q to exit");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				encounters = encounters + "\n  " + encounters;
				salary = salary + bonus;
			}
			else{
				break;
			}
		} while(1 != 0 );
		
		//System.out.println("Total encounters "+ encounters);
	}
	
    //view salary
    public void viewsalary() {
		System.out.println("Your salary  is: RS "+ salary);
	}
	
    //get salary
    public void getsalary() {
		viewsalary();
		System.out.print("Enter your salary: Rs");
		Scanner in = new Scanner(Scanner.in);
		int donate = in.nextInt();
		salary = salary - donate;
		System.out.println("Thank you for your donation of Rs" + donate);
		viewsalary();
	}
    //show status
	public String toString() {
		System.out.print("CriminalDataBaseInvestigation");
		return "Name: " + firstName + " " + lastName + 
				"\nJoinyear: " +  joinyear + 
				"\nOfficer ID: " + officerID + 
				"\nencounters: " + encounters + 
				"\nBalanceSalary: $" + Salary;
		
	}
	
	
}
