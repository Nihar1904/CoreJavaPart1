package basicProgs;

public class ThisEx {

	String name;
	/*
	 * public ThisEx(String name) { super(); this.name = name;
	 * System.out.println("Name is:- "+this.name); }
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		ThisEx t=new ThisEx();
		t.setName("ABC");
		System.out.println("Object t "+t.getName());

	}
}
