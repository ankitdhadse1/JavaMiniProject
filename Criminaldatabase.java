package criminalinvestigationdatabase;

public class Criminaldatabase{
   
	public static void main(String[] args) {
	  Officer off1 = new Officer();
		offl.bonuses();
		stul.getsalary();
		Sysyem.out.println(off1.toString());
		System.out.print("CriminalDataBaseInvestigation");
	  
		
	    //ask no of new officers to add
	    Scanner in = new Scanner(System.in);
        System.out.print("enter no of new candidates");
        int numOfOfficers= in.nextInt();
		Officer[] officers = new Officer[numOfOfficers];
		
	    //create n new candidates
		for( int n = 0; n < numOfOfficers; n++) {
			officers[n] = new Officer();
			officers[n].bonuses();
			officers[n].getsalary();
			System.out.println(officers[n].toString());
		
		}
		System.out.println("Criminaldatabase");
	}
}

