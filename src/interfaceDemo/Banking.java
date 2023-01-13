package interfaceDemo;

interface Account{
	void accType();
}
class Holder1 implements Account{
	String name="Abc Pqr";
	String at="Savings";
	@Override
	public void accType() {
		System.out.println("Name:- "+name);
		System.out.println("Account type:- "+at);
	}
}
class Holder2 implements Account{
	String name="Lmn Xyz";
	String at="Current";
	@Override
	public void accType() {
		System.out.println("Name:- "+name);
		System.out.println("Account type:- "+at);
	}
}
public class Banking {

	public static void main(String[] args) {
		Holder1 h1=new Holder1();
		Holder2 h2=new Holder2();
		h1.accType();
		h2.accType();
	}
}