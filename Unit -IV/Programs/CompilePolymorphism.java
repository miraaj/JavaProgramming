//java program to demonstrate compile time (static) polymorphism
class StaticPolymorphism{
	void add(int a, int b){
		System.out.println("Result1 = "+ (a+b));
	}

	void add(int a, int b, int c){
		System.out.println("Result2 = "+ (a+b+c));
	}
}
class CompilePolymorphism{
	public static void main(String[] args) {
		StaticPolymorphism compile = new StaticPolymorphism();
		compile.add(3,4);
		compile.add(4,5,2);
	}
}