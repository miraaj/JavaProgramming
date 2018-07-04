/*
	* BufferedReader to read character from the console
*/
import java.io.*;
class BuffredReadCharacter{
	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter character, 'q' to quit.");
		//read character and display
		do{
			c = (char)br.read();
			System.out.println(c);
		}while(c !='q');
	}
}