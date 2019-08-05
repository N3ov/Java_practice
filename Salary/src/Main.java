import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Insert hours: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(in.readLine());
		
		System.out.println("Insert fee: ");
		BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
		Double j = Double.parseDouble(in2.readLine());
		
		Salary n = new Salary(i, j);
		n.print();

	}

}
