package arrays;

public class StudentDriver {

	public static void main(String[] args) {
		
		StudentDB sdb1 = new StudentDB("Root", "Root");
		
		sdb1.login("Root","Root");
		sdb1.addStudent("Yumi", 22, 4, "B.tech", "B+", 'F', 5, 79);
		sdb1.addStudent("Rani", 23, 1, "B.tech", "O+", 'F', 25, 72);
		sdb1.addStudent("Kaju", 20, 2, "B.tech", "B-", 'M', 3245, 65);
		sdb1.addStudent("Moju", 19, 3, "B.tech", "AB+", 'M', 1235, 74);
		sdb1.addStudent("Moni", 22, 4, "B.tech", "O-", 'F', 135,84);
		sdb1.addStudent("Boni", 18, 1, "B.tech", "C+", 'F', 1435,94);
		sdb1.addStudent("Roni", 22, 4, "B.tech", "B+", 'M', 135,64);
		
		
//		System.out.println(sdb1.searchByName("Yumi"));
		
//		sdb1.sortByRoll();
		
//		sdb1.sortByName();
		
//		sdb1.removeByName("Roni");
//		sdb1.removeByRoll(25);
		
//		sdb1.sortByMarks();
		
//		System.out.println(sdb1.highestScorrer());;
//		System.out.println(sdb1.secScorrer());;
		
//		System.out.println(sdb1.secScorrer());
		
//		sdb1.failedCandidates();
		
//		sdb1.distinctionStudents();
		
//		sdb1.removeStudents();
		
//		System.out.println(sdb1.updateMarks(100, "yumi"));
//		sdb1.printDB();
		
		sdb1.mergeByMarks(StudentDB.getDb(), 0, sdb1.size);
		
	}
}
