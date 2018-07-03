class Hello_Recursion{
	public static void main(String[] args) {
		print(1);
	}
	static void print(int time){
		if(time <= 1){
			System.out.println("Hello: "+time);

		}else{
			System.out.println("Hello: "+time);
			time = time -1;
			print(time);

		}

	}
}