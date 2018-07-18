//inheritance using interface
interface A{  
	void callA();  
}  
interface B extends A{  
	void callB();  
}  
class InheritanceInterface implements B{  
	public void callA(){
		System.out.println("Hello A");
	}  
	public void callB(){
		System.out.println("Welcome B");
	}  
	  
	public static void main(String args[]){  
		InheritanceInterface obj = new InheritanceInterface();  
		obj.callB();  
		obj.callA();  
	 }  
}  