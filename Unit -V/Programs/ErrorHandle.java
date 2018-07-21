class ErrorHandle{
	public static void main(String[] args) {
		try{
			int number = 5;
			float result = number / 0;
			System.out.println("Result = "+result);			
		}catch(ArithmeticException ae){
			System.out.println(ae.toString());
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
	}
}

