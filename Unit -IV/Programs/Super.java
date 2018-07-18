/*
	This program demonstrates the use of super keyword for
	1. Accessing the super class constructor
	2. Accessing the super class member hidden by sub class
*/
class Parent{
	int i;

	Parent(){
		System.out.println("This is super class");
	}

}
class Child extends Parent{
	int i;

	Child(int a, int b){
		super(); //call to Parent class constructor
		super.i = a;
		i = b;
	}

	void show(){
		System.out.println("Parent i="+super.i);
		System.out.println("Parent i="+i);
	}

}
class Super{
	public static void main(String[] args) {
		Child child = new Child(4,6);
		child.show();
	}
}