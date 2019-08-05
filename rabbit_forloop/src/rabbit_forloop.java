import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rabbit_forloop {

    public static void main(String args[])throws IOException {

        System.out.println("How many months pass? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int months = Integer.parseInt(in.readLine());

        if (months == 0 || months == 1 || months == 2 ) System.out.print("A pairs of rabbits");
        else{
            int arr[] = new int[months + 1];

            arr[0] = 1; // month 0
            arr[1] = 1; // month 1
            arr[2] = 1; // month 2
            arr[3] = 2;

            for (int i = 4; i <= months; i++) {
                arr[i] = arr[i - 1] + arr[i - 3];
                if (i == months) System.out.println(arr[i] + " pairs of rabbits");
            }
        }
        return;
    }

}
