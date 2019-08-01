import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddTwoInt {

	public static void main(String[] args) {
//		Console console = System.console();
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String str1 = null, str2 = null;
		
		System.out.println("please input first Number:");
		try {
			str1 = console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("please input second Number:");
		try {
			str2 = console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Connect Two Number:");
		System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
		
	}	
	
}
