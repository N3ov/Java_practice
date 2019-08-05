import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C10To2 {

	public static void integerToBinary() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(in.readLine());
		
		String binary = Integer.toBinaryString(i);
		System.out.println(binary);

		String result = Integer.toString(i, 2);
		System.out.println(result);
		
	}

}
