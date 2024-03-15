package Team13;

public class Owner extends Person {
	private static int gymID = 0023;
	
public Owner (String firstNameIn, String lastNameIn, String addressIn, String phoneNumberIn, String emailIn) {
	super(firstNameIn, lastNameIn, addressIn, phoneNumberIn, emailIn);
	gymID++;
 }
public String finances() {
	return "Needs other classes finished";
}
public MemberLevel createLevel(String description, String perks) {
	MemberLevel newMemberLevel = new MemberLevel(description, perks);
	return newMemberLevel;
}
public MemberLevel updateDescription(MemberLevel levelNumber, String newDescription) {
	if (levelNumber.getLevel() == levelNumber.getLevel()) {
	levelNumber.updateDescription(newDescription);
	}
	return levelNumber;
}
}
