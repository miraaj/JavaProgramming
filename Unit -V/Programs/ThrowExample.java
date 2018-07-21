class ThrowExample {
	static void demoproc(){
		try{
			throw new NullPointerException("Throw Demo");
		}catch(NullPointerException npe){
			System.out.println("Caught inside catch");
			throw npe;//rethrowing excecption
		}
	}
	public static void main(String[] args) {
		try{
			demoproc();
		}catch(NullPointerException ex){
			System.out.println("Recaught: "+ex);
		}
	}
}