package arrays;

import java.util.Iterator;


public class StudentDB {

	private String user;
	private String pass;
	
	private static Student [] db = new Student[10]; // non-primitive array
	
	private boolean checklogin;
	
	public int size;
	public StudentDB() {
		
	}
	public StudentDB(String user, String pass) {
		
		this.user = user;
		this.pass = pass;
		
		System.out.println("DB created");
	}
	
	public boolean login(String user,String pass)
	{
		if(user==this.user && pass==this.pass)
		{
			checklogin = true;
			System.out.println("Login Suceesful");
			return true;
		}
		
		System.out.println("Invalid Credentials!");
		return false;
	}
	
	/**
	 * assigns the reference of the newly created and (usually larger) array `temp` back to your original array variable `db`.
		Context: Why this is done
	•	When you add more students and your `db` array reaches capacity, you create a new array `temp` with a larger size (usually double the original).
	•	You then copy all existing `Student` objects from `db` to `temp`.
	•	Finally, you assign `db = temp;`.
	•	This means `db` now refers to the new, larger array instead of the old, smaller one.
	 */
	public boolean addStudent(String name, int age, int year, String degree, String blood, 
			char gender, int roll, int marks)
	{
		if (checklogin) {
			if (size<getDb().length*0.7) {	// we are creating a increasing array
				
				getDb()[size] = new Student(name, age, year, degree, blood, gender, roll, marks);
				
				size++;
//				System.out.println(name+"Student added!");
				return true;
			}
			else {
				Student [] temp = new Student[getDb().length*2]; 	// we r increasing the size of array
				
				for (int i = 0; i < size; i++) { // size bcoz jaha tak data fill hua hai waha tak hi jayega
					
					temp[i] = getDb()[i];
					
				}
				
				setDb(temp);
				
				getDb()[size] = new Student(name, age, year, degree, blood, gender, roll, marks);
				
				size++;
				System.out.println(name+"Student added in increased size array");
				return true;
			}
		}
		System.out.println("Please Login");
		return false;
	}
	
	public void printDB()
	{
		if (checklogin) {
			for (int i = 0; i < size; i++) {
				
				System.out.println(getDb()[i]);
			}
		}
		else {
			System.out.println("Please Login");
		}
	}
	
	public boolean searchByName(String name)
	{
		if (checklogin) {
			
			for (int i = 0; i < size; i++) {
				
				if (getDb()[i].name.equalsIgnoreCase(name)) {
					
					return true;
				}
			}
		}
		return false;
	}
	
	public Student searchByMarks(int marks)
	{
		int i=0;
		if (checklogin) {
			
			for (i = 0; i < size; i++) {
				
				if (getDb()[i].marks==marks) {
					
				
					break;
				}
			}
		}
		return getDb()[i];
	}

	public void sortByRoll()
	{
		if (checklogin) {
			
			for (int i = 0; i < size-1; i++) {
				
				for (int j = 0; j < size-1-i; j++) {
					
					if (getDb()[j].roll>getDb()[j+1].roll) {
						
						Student temp = getDb()[j];
						getDb()[j] = getDb()[j+1];
						getDb()[j+1] = temp;
					}
				}
				
			}
		}
		else {
			
			System.out.println("please Login");
		}
	}
	
	public void sortByName()
	{
		if (checklogin) {
			
			for (int i = 0; i < size-1; i++) {
				
				for (int j = 0; j < size-1-i; j++) {
					
					if (getDb()[j].name.compareTo(getDb()[j+1].name)>0) { // +ve means j name is big than j+1 name by checking alphabetically
						
						Student temp = getDb()[j]; // we are swapping the reference not the values
						getDb()[j] = getDb()[j+1];
						getDb()[j+1] = temp;
					}
					
				}
				
			}
		}
		else {
			
			System.out.println("Please login");
		}
	}
	
	public boolean removeByName(String name)
	{
		if (checklogin) {
			
			int i;
			for (i = 0; i < size; i++) {
				
				if (getDb()[i].name.equals(name)) {
					
					break ;
				}
			}
			if (i<size) {
				
				Student temp[] = new Student[getDb().length-1];
					
				for (int j = 0; j < size; j++) {
					
					if (j<i) {
						
						temp[j] = getDb()[j];
					}
					else if (j>i) {
						
						temp[j-1] = getDb()[j];
					}
				}
				size--;
				
				setDb(temp);
				System.out.println(name+" removed from DB");
				
				return true;
				
			}
			else {
				System.out.println("Student not found");
				
				return false;
			}
		}
		System.out.println("Please Login");
		
		return false;
	}
	
	public void sortByMarks()
	{
		if (checklogin) {
			
			for (int i = 0; i < size-1; i++) {
				
				for (int j = 0; j < size-1-i; j++) {
					
					if (getDb()[j].marks>getDb()[j+1].marks) {
						
						Student temp = getDb()[j];
						getDb()[j] = getDb()[j+1];
						getDb()[j+1] = temp;
						
					}
				}
				
			}
		}
		else {
			System.out.println("Please Login");
		}
	}
	
	public boolean removeByRoll(int roll)
	{
		if (checklogin) {
			
			int i;
			for (i = 0; i < size; i++) {
				
				if (getDb()[i].roll==roll) {
					
					break;
				}
				
			}
			if (i<size) {
				Student [] temp = new Student[getDb().length-1];
				
				for (int j = 0; j < size; j++) {
					
					if (j<i) {
					
						temp[j] = getDb()[j];
					}
					
					else if (j>i) {
					
						temp[j-1] = getDb()[j];
					}
					
				}
				size --;
				setDb(temp);
				System.out.println(roll+" removed from DB");
				
				return true;
			}
			else {
				
				System.out.println("Student not found");
				
				return false;
			}
		}
		System.out.println("Please Login");
		return false;
	}
	
	public Student updateMarks(int marks,String name)
	{
		int i =0;
		if (checklogin) {
				
				for (i = 0; i < size; i++) {
					
					if (getDb()[i].name.equalsIgnoreCase(name)) {
						
						getDb()[i].marks = marks;
						break;
					}
				}
			}
		return getDb()[i];
	}
	
	public /*String, Student*/ int highestScorrer()
	{
		int max=0, index=0;
		for (int i = 0; i < size; i++) {
			
			if (getDb()[i].marks>max) {
				
				max=getDb()[i].marks;
				index = i;
			}
		}
//		return db[index].name;
//		return db[index];
		return getDb()[index].marks;
	}
	public int lowestScorrer()
	{
		int min=Integer.MAX_VALUE, index=0;
		for (int i = 0; i < size; i++) {
			
			if (getDb()[i].marks<min) {
				
				min=getDb()[i].marks;
				index = i;
			}
		}
//		return db[index].name;
//		return db[index];
		return getDb()[index].marks;
	}
	
	public Student secScorrer()
	{
		int max = 0, index = 0;
		int secmax = max;
		
		for (int i = 0; i < size; i++) {
			
			if (getDb()[i].marks>max) {
				
				secmax = max;
				max = getDb()[i].marks;
//				index = i;
			}
			else if (getDb()[i].marks > secmax && getDb()[i].marks!=max) {
				
				secmax = getDb()[i].marks;
			}
		}
		return searchByMarks(secmax);
	}
	
	public void failedCandidates()
	{
		for (int i = 0; i < size; i++) {
			
			if (getDb()[i].marks<70) {
				
				System.out.println(getDb()[i]);
			}
		}
	}
	
	public void distinctionStudents()
	{
		for (int i = 0; i < size; i++) {
			
			if (getDb()[i].marks>75) {
				
				System.out.println(getDb()[i].name+" Passed with distinction");
			}
		}
	}
	
	public void removeStudents()
	{
		for (int i = 0; i < size; i++) {
			
			if (getDb()[i].marks<70) {
				
				removeByRoll(getDb()[i].roll);
			}
		}
	}
	
	public void retainAll() 
	{
		
	}
	
	public void insertStudent()
	{
		
	}
	
	public void position()
	{
		
	}
	
	public static void mergeByName()
	{
//		if (Start<end) {
//			int mid = (start+end)/2;
//		}
	}
	public void mergeByMarks(Student[]a,int start,int end)
	{
		if (start<end) {
			int mid = (start+end)/2;
			
			mergeByMarks(a, start, end);
			mergeByMarks(a, mid+1, end);
			mergeSort(a, start, mid, end);
		}
	}
	public void mergeSort(Student[]a, int start, int mid, int end)
	{
		Student ans[] = new Student[a.length];
		
		int i=start, j=mid+1, k=start;
		
		while (i<=mid && j<=mid+1) {
		
			if (a[i].marks > a[j].marks) {
				
				ans[k++] = a[j++];
			}
			else if (a[i].marks <= a[j].marks) {
				
				ans[k++] = a[j++];
			}
			while (i<=mid) {
				
				ans[k++] = a[i++];
			}
			while (i<=end) {
				
				ans[k++] = a[j++];
			}
			for (int k2 = 0; k2 < ans.length; k2++) {
				
				a[k2] = ans[k2];
			}
		}
	}
	public static Student [] getDb() {
		return db;
	}
	
	
	
	
	public void setDb(Student [] db) {
		this.db = db;
	}
	
	
}
