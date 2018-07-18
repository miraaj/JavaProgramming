// @Source: https://www.tutorialspoint.com/java/java_interfaces.htm

public class Animals implements Animal {
   public void eat() {
      System.out.println("Mammal eats");
   }
   public void travel() {
      System.out.println("Mammal travels");
   } 

   public static void main(String args[]) {
      Animals m = new Animals();
      m.eat();
      m.travel();
   }
} 