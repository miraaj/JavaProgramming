class Promote{
	public static void main(String[] args) {
		//Demonstration of automatic type promotion in expression
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = 0.1234;
		double result = (f*b) + (i/c) - (d*s);
		System.out.println((f*b) +"+"+ (i/c) +"-"+ (d*s));
		System.out.println(result);
		
	}
}