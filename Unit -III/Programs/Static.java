class Static{
	static int Number = 0;

	Static(){
		System.out.println(++Number);
	}
	public static void main(String[] args) {
		Static s1 = new Static();
		Static s2 = new Static();
		Static s3 = new Static();
		Static s4 = new Static();		

	}
}
