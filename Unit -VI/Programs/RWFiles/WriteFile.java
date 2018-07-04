import java.io.FileOutputStream;  
public class WriteFile {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("write.txt");    
             String s="This will be written in write.txt.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("file write completed");    
            }catch(Exception e){
            	System.out.println(e);
            }    
      }    
}  