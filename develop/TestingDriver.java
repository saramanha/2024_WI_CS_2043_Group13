package Team13Project.develop;

public class TestingDriver {

	public static void main(String[] args) {

Member memberOne = new Member ("Adam", "Thorne", "506-476-9724", "24 Dineen Dr", "adam.thorne@unb.ca");
System.out.println(memberOne.toString());

Person ownerOne = new Owner ("Ben", "MacGillivray", "506-Alberta", "Canmore", "ben@unb.ca");
System.out.println(ownerOne.toString());

Person employeeOne = new Member ("Khalid", "Hamid", "??????", "Fredericton", "khalid@unb.ca");
System.out.println(employeeOne.toString());

Member employeeTwo = new Member ("Shikkhar", "Pandey", "506-993-1212", "Fredericton", "Shikkhar@unb.ca");
System.out.println(employeeTwo.toString());

System.out.println(employeeTwo.getMemberID());
System.out.println(memberOne.getMemberID());
	}

}
