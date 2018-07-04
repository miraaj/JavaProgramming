/*
	* BufferedReader to read string from the console
*/
import java.io.*;
class BRReadLine{
	public static void main(String[] args) throws IOException {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Line of text");
		str = br.readLine();
		System.out.println(str);		

	}
}