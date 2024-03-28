package Team13Project.develop;

public class TestingDriver {

	public static void main(String[] args) {

Member memberOne = new Member ("Adam", "Thorne", "506-476-9724", "24 Dineen Dr", "adam.thorne@unb.ca", "2024-02-22");
System.out.println(memberOne.toString());

Owner ownerOne = new Owner ("Ben", "MacGillivray", "506-Alberta", "Canmore", "ben@unb.ca");
System.out.println(ownerOne.toString());

Person employeeOne = new Member ("Khalid", "Hamid", "??????", "Fredericton", "khalid@unb.ca", "2024-02-23");

System.out.println(employeeOne.toString());

Member employeeTwo = new Member ("Shikkhar", "Pandey", "506-993-1212", "Fredericton", "Shikkhar@unb.ca", "2024-04-20");
System.out.println(employeeTwo.toString());

System.out.println(employeeTwo.getMemberID());
System.out.println(memberOne.getMemberID());

System.out.println(memberOne.createLog("2024-03-26", "run", "20 Minutes"));
System.out.println(ownerOne.createMeal("Chicken", "Pasta", "Gravy", "Ice Cream"));

Employee workerOne = new Employee ("Bill", "Gates", "506-444-4444", "Fredericton", "microsoft@microsoft.com");

System.out.println(workerOne.createBooking(1000, "private", "3:00PM"));

System.out.println(workerOne.payment(1000, "2024-03-28", 65, "Debit")); 

System.out.println(memberOne.renewDate());
System.out.println(workerOne.checkMemberLevel(memberOne));
System.out.println(workerOne.memberRenewDate(memberOne));
System.out.println(memberOne.updateRenew("2024-10-10"));
System.out.println(workerOne.updateMemRenewal(memberOne, "2025-10-10"));

//System.out.println(workerOne.updateSession(1000, "group", "4:00PM")); must create Sessions as own object not in a print line
	}

}
