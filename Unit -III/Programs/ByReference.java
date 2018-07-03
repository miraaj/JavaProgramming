class Tests{
	int a, b;

	Tests(int i, int j){
		a = i;
		b = j;

	}

	void meth(Tests obj){
		obj.a *= 2;
		obj.b /=2;
	}
}
class ByReference{

	public static void main(String[] args) {
		int a = 5, b = 10;
		Tests test = new Tests(a, b);

		System.out.println("a and b are: "+test.a+" "+test.b);
		test.meth(test);

		System.out.println("After calling meth method");
		System.out.println("a and b are: "+test.a+" "+test.b);

	}
}
