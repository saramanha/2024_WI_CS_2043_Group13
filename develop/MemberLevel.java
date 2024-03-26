package Team13Project.develop;

public class MemberLevel {
	private static int levelHolder = 1;
	private int memberLevel;
	private String levelDescription;
	private String levelPerks;

public MemberLevel (String levelDescriptionIn, String levelPerksIn) {
	this.memberLevel = levelHolder;
	levelDescription = levelDescriptionIn;
	levelPerks = levelPerksIn;
	levelHolder++;
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
