abstract class A{
	abstract void show();

	//concrete methods are also allowed in abstract class
	void showthis(){
		System.out.println("This is also shown");
	}
}
class B extends A {
	void show(){
		System.out.println("This is show-override");	
	}
	
}
class AbstractDemo{
	public static void main(String[] args) {
		B b = new B();
		b.show();
		b.showthis();			
	}
}