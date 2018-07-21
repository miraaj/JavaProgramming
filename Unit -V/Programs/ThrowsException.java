class ThrowsException{  
  static void throwOne() throws IllegalAccessException{
    System.out.println("Inside throwOne");
    throw new IllegalAccessException("Sorry Illegal Access");
  } 
  public static void main(String args[]){  
   try{
    throwOne();
   }catch(IllegalAccessException ie){
    System.out.println("Caught:="+ie);
   }
  }  
} 
