package arrays;

public class Student {

	String name;
	int age;
	int year;
	String degree;
	final String college = "IIT";
	String blood;
	char gender;
	int roll;
	int marks;
	
	public Student() {
		
	}

	public Student(String name, int age, int year, String degree, String blood, char gender, int roll, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.year = year;
		this.degree = degree;
		this.blood = blood;
		this.gender = gender;
		this.roll = roll;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", year=" + year + ", degree=" + degree + ", college="
				+ college + ", blood=" + blood + ", gender=" + gender + ", roll=" + roll + ", marks=" + marks + "]";
	}
	
	public void displayStudent()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Year: "+year);
		System.out.println("Degree: "+degree);
		System.out.println("Blood Grp: "+blood);
		System.out.println("Gender: "+gender);
		System.out.println("Roll no: "+roll);
		
		System.out.println("------------------------");
	}
}






