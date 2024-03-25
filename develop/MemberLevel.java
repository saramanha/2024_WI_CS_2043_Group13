package Team13;

public class MemberLevel {
	private int memberLevel = 1;
	private String levelDescription;
	private String levelPerks;

public MemberLevel (String levelDescriptionIn, String levelPerksIn) {
	levelDescription = levelDescriptionIn;
	levelPerks = levelPerksIn;
	memberLevel++;
}
public int getLevel() {
	return memberLevel;
}
public void updateDescription(String newDescription) {
	levelDescription = newDescription;
}
public void updatePerks(String newPerks) {
	levelPerks = newPerks;
}
public String toString() {
	return "The member level you have selected is " + memberLevel + "\nlevelDescription" + "\nlevelPerks";
}
}
