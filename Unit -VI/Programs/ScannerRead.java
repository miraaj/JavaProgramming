/*
	* Java program to read integer using scanner class
*/
import java.util.Scanner;
public class ScannerRead {
    public  static  void main(String [] args){
        int number;
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter number");
        number = scanner.nextInt();
        System.out.println(number);
    }
}
