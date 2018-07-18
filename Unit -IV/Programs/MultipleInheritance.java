interface A{  
	void print();  
}  
interface B{  
	int show(int Number);  
}  
interface C{
	void sayHello();
}
class MultipleInheritance implements A,B,C{  
	public void print(){
		System.out.println("Hello");
	}  
	public int show( int number){
		return number*2;
	}  
	public void sayHello(){
		System.out.println("Hello C");
	}
	  
	public static void main(String args[]){  
		MultipleInheritance obj = new MultipleInheritance();  
		obj.print();  
		int received = obj.show(45);  
		System.out.println(received);
		obj.sayHello();
	 }  
}  