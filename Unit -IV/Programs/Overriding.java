//java program to demonstrate method overrirding
class A{
	void show(){
		System.out.println("This is super class");
	}
}
class B extends A{
	void show(){
		super.show();
		System.out.println("This is child class");
	}
}
class Overriding{
	public static void main(String[] args) {
		B b = new B();
		b.show();
	}
}