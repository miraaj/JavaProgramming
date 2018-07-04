import java.io.*;
class ReadFile{
	public static void main(String[] args) throws IOException{
		int i;
		FileInputStream fin;
		try{
			fin = new FileInputStream("test_read.txt");
			while((i = fin.read())!= -1){
				System.out.print((char)i);
			}
			fin.close();
		}catch(FileNotFoundException e){
			System.out.println("File not found");
			return;
		}
	}
}