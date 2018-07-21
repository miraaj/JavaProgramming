/*
	* Java program to demonstrate creation of custom exception
	* new custom exception named CustomException is created.
	* Extend Exception class to crete custom exception
*/
class CustomException extends Exception{
	private int detail;	
	CustomException(int name){
		detail = name;
	}
	public String toString(){
		return "CustomException["+detail+"]";
	}
}
class CreateException{
	static void compute(int number) throws CustomException{
		System.out.println("Called compute ("+number+")");
		if(number < 5){
			throw new CustomException(number);
		}
		System.out.println("Normal Exit");
	}
	public static void main(String args[]){
		try{
			compute(10);
			compute(20);
			compute(3);
		}catch(CustomException ce){
			System.out.println("Caught :="+ce);
		}
	}
}

