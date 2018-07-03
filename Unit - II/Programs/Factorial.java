class Factorial {
    public static void main(String[] args){
        int i,fact = 5;
        int result = 1;
        for(i = 1; i <= fact; i++){
        	result *=i;
        }
    	System.out.println("Factorial of "+fact+" is "+result);
    }
}