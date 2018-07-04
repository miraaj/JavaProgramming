//java program to demonstrate PrintWriter
import java.io.*;
public class PrintWriterDemo {
    public static void main(String []args){
    	PrintWriter pw = new PrintWriter(System.out, true);
    	pw.println("This is text");
    	int i = 7;
    	pw.println(i);
    }
}
