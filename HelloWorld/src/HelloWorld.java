import java.io.*;

public class HelloWorld {
	/*
	// throw IOException
	public static void main(String argv[]) throws IOException{
		
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("What is your name:");
		String name = null;
		name = console.readLine();
		System.out.println("Hello " + name);
		
	}
	*/
	
	public static void main(String argv[]){
		// try catch finally
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("What is your name:");
		String name = null;
		try {
			name = console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello " + name);
		
	}
}
