//java program to demonstrate run time polymorphism
class A{
	void show(){
		System.out.println("This is A");
	}
}
class B extends A{
	void show(){
		System.out.println("This is B");
	}
}
class C extends A{
	void show(){
		System.out.println("This is C");
	}
}
class DynamicMethodDispatch{
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		A r;//obtain a reference of type A
		r = a; //refer to b object
		r.show(); //call A classs show() method
		r = b;
		r.show();
		r = c;
		r.show();
	}
}