package interfaceDemo;

interface Exam{
	void perCal();
}
class Student{
	String name;
	int s1,s2,s3,s4,s5;
	public Student(String name, int s1, int s2, int s3, int s4, int s5) {
		this.name = name;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
	}
	void display() {
		System.out.println("Name:- "+name);
		System.out.println("Subject 1 marks:- "+s1);
		System.out.println("Subject 2 marks:- "+s2);
		System.out.println("Subject 3 marks:- "+s3);
		System.out.println("Subject 4 marks:- "+s4);
		System.out.println("Subject 5 marks:- "+s5);
	}
	
}
class Result extends Student implements Exam{
	
	double per;
	public Result(String name, int s1, int s2, int s3, int s4, int s5) {
		super(name, s1, s2, s3, s4, s5);
	}
	
	@Override
	public void perCal() {
		int tot=s1+s2+s3+s4+s5;
		per=(double)tot*100/500;
	}
	void display() {
		super.display();
		System.out.println("Percentage:- "+per);
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		Result r= new Result("Abc", 67, 72, 71, 69, 75);
		r.perCal();
		r.display();
	}

}
