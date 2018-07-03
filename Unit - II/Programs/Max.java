class Max {
    public static void main(String[] args){
    	int ary[] ={901,44,55,66,4,2,78,90,987,0}; 
    	int result = ary[0];
    	for (int i = 1; i < ary.length; i++ ){
    		if(ary[i] > result){
    			result = ary[i];
    		}
    	}        

    	System.out.println("The max Number is:"+result);
    }
}