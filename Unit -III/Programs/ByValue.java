class Test{
	void meth(int i, int j){
		i *= 2;
		j /= 2;
	}
}
class ByValue{
	public static void main(String[] args) {
		int a = 5, b = 10;
		Test test = new Test();
		System.out.println("a and b are: "+a+" "+b);
		test.meth(a, b); 
		System.out.println("a and b after calling meth method are: "+a+" "+b);

	}
}
