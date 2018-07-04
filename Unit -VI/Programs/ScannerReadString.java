import java.util.Scanner;
public class ScannerReadString {
    public static void main(String []args){
        String str;
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter String");
        str = scanner.nextLine();
        System.out.println("Entered String");
        System.out.println(str);
    }
}
