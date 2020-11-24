package icompass;

public class ICompass {

	static int x;
	int y;
	ICompass(){
		System.out.println("constructor");
	}
	static {
		System.out.println("static block");
	}
	{
		System.out.println("non static block");
	}
	public static void main(String[] args) {
		int a=10;
		ICompass com = new ICompass();
		System.out.println(x-2);
		System.out.println(com.y);
	}
	
	
}

/*class ICompass2 {
	int x=10;
	public void assign(int x) {
		x=x;
		System.out.println(this.x);
	}
	public static void main(String[] args) {
		new ICompass2().assign(100);

	}
}*/

class parent {
	/*public static void m1() {
		System.out.println("parent");
	}*/
	public void m2() {
		System.out.println("parent m2");
	}
}

class child extends parent {

	/*public static void m1() {
		System.out.println("child");
	}*/
	public void m2() {
		System.out.println("child m2");
	}
	public static void main(String[] args) {
		parent p = new child();
		p.m2();
	}
}
