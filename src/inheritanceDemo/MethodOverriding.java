package inheritanceDemo;

class Emp{
	String ename="Nihar";
	int eno;
	Emp(int eno){
		this.eno=eno;
	}
	void disp() {
		System.out.println("Employee class."+eno);
	}
}
class Dept extends Emp{
	String ename="Abc";
	Dept(){
		super(19);
	}
	void disp() {
		super.disp();
		System.out.println("Department class."+super.ename);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Dept d=new Dept();
		d.disp();
//		Emp e= new Emp();
//		e.disp();
	}

}
