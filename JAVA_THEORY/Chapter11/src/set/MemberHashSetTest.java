package set;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberpark = new Member(300, "Park");
		Member memberpark2 = new Member(300, "Park2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberpark);
		manager.addMember(memberpark2);
		
		manager.showAllMember();
		
//		manager.removeMember(100);
//		manager.showAllMember();
		

	}

}
