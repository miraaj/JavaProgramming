class Non_Static{
	int Number = 0;

	Non_Static(){
		System.out.println(++Number);
	}
	public static void main(String[] args) {
		Non_Static s1 = new Non_Static();
		Non_Static s2 = new Non_Static();
		Non_Static s3 = new Non_Static();
		Non_Static s4 = new Non_Static();		

	}
}
