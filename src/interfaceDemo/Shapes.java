package interfaceDemo;

interface Polygon{
	void areaCalculate(int l,int b);
}
class Rect implements Polygon{
	
	public void areaCalculate(int l,int b) {
		System.out.println("Area of Rectangle:- "+(l*b));
	}
}
public class Shapes {

	public static void main(String[] args) {
		Rect r=new Rect();
		int l=20,b=30;
		r.areaCalculate(l, b);
	}

}
