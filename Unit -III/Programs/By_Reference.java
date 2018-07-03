class By_Reference{
 int data=50;

 void change(By_Reference op){
 op.data=op.data+100;//changes will be in the local variable only
 }
   
  
 public static void main(String args[]){
   By_Reference op=new By_Reference();
   System.out.println("before change "+op.data);
   op.change(op);//passing object
   System.out.println("after change "+op.data);

 }
}