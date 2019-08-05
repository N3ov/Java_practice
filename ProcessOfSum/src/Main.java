import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[])throws IOException {
        System.out.println("How many layers?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int layers = Integer.parseInt(in.readLine());

        ProcessOfSum sum = new ProcessOfSum(layers);
        sum.ProcessOfSum();

    }

}
