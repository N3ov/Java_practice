import java.io.*;

public class HelloTwoString {
	
	public static void main(String[] args) {
		// Console console = System.console();
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String str1 = null, str2 = null;
		
		System.out.println("please input first String:");
		try {
			str1 = console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("please input second String:");
		try {
			str2 = console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Connect Two String:");
		System.out.println(str1 + str2);

	}
	
	
}
