package bedict;
class Name{
	String name;
	Name(String n){
		name = n;
	}

	void show(){
		System.out.println(name);
	}
}
class Packages{
	public static void main(String[] args) {
		Name [] names = new Name[3];
		names[0] = new Name("OS");
		names[1] = new Name("Java");
		names[2] = new Name("Python");

		for( int i = 0; i < names.length; i++){
			names[i].show();
		}
	}
}