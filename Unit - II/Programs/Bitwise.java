class Bitwise{
	public static void main(String[] args) {
		int numberA = 42; //00101010
		int numberB = 15; //00001111
		//AND operation result needs to be 10
		int andOperation = numberA & numberB;
		System.out.println("And Operation: "+ andOperation);
		//XOR result needs to be 37
		int Xor_operation  = numberA ^ numberB;
		System.out.println("Xor Operation: "+ Xor_operation);
		//OR result needs to be 47
		int Or_operation = numberA | numberB;
		System.out.println("Or Operation: "+ Or_operation);
	}
}