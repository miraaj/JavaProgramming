class A{
	int i,j;
	 void showij(){
	 	System.out.println("A parent class");
	 	System.out.println("i="+ i);
	 	System.out.println("j="+ j);
	 	System.out.println("------------------------");
	 }
}

class B extends A{
	int k;

	void showk(){
		System.out.println("K="+k);
	}

	void sum(){
		System.out.println("Sum of i,j,k = "+(i+j+k));
	}
}

class Simple_Inheritance{
	public static void main(String[] args) {
		A superobj = new A();
		B subobj = new B();

		//super class: has access to only its member variables and methods
		superobj.i = 10;
		superobj.j = 15;
		System.out.println("Super class");
		superobj.showij();
		System.out.println();

		//subclass: has access to both its and super class
		// public member vairables and methods

		subobj.i = 1;
		subobj.j = 2;
		subobj.k = 3;

		System.out.println("Contents of sub obj");
		subobj.showij();
		subobj.showk();
		subobj.sum();
	}
	
}