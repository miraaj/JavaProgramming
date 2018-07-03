class Ternary{
	public static void main(String[] args) {
		int num = 5;
		int numb = 0;

		if (num <= 5){
			numb = 10;
		}else{
			numb = 20;
		}

		System.out.println(numb);
		//same with ternary operator
		int numc = num <= 5? 10: 20;
		System.out.println("Ternary: "+numc);
		
	}
}