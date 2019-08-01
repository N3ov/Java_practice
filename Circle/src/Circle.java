import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {

	public static void main(String argv[]) throws NumberFormatException, IOException{
		System.out.print("Please input radius:");
//		Console console = System.console();
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		double radius = Double.parseDouble(console.readLine());
		
		System.out.printf("Area: ", Math.PI * Math.pow(radius,2));
		System.out.printf("Circumference: ", 2 * Math.PI * radius);

	}
	
}


