class Employee{  
 float salary=40000;  
}  
class SimpleInheritance extends Employee{  
 int bonus=10000;  
 public static void main(String args[]){  
   SimpleInheritance p=new SimpleInheritance();  
   System.out.println("SimpleInheritance salary is:"+p.salary);  
   System.out.println("Bonus of SimpleInheritance is:"+p.bonus);  
 }  
} 