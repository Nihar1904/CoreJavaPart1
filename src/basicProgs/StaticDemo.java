package basicProgs;

class Student {
	int rno;
	String name;
	static String courseName;
}

public class StaticDemo {
	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		
		Student.courseName="Java Full Stack";
		
		s1.name="A";
		s1.rno=1;
		s2.name="B";
		s2.rno=2;
		s3.name="C";
		s3.rno=3;
		
		System.out.println("Name:- "+s1.name+"\nRoll no:- "+s1.rno+"\nCourse name:- "+s1.courseName);
		System.out.println("Name:- "+s2.name+"\nRoll no:- "+s2.rno+"\nCourse name:- "+s2.courseName);
		System.out.println("Name:- "+s3.name+"\nRoll no:- "+s3.rno+"\nCourse name:- "+s3.courseName);
		
		s2.courseName="Python";
		s2.name="Z";
		
		System.out.println("\nAfter change..");
		System.out.println("Name:- "+s1.name+"\nRoll no:- "+s1.rno+"\nCourse name:- "+s1.courseName);
		System.out.println("Name:- "+s2.name+"\nRoll no:- "+s2.rno+"\nCourse name:- "+s2.courseName);
		System.out.println("Name:- "+s3.name+"\nRoll no:- "+s3.rno+"\nCourse name:- "+s3.courseName);
	}

}
