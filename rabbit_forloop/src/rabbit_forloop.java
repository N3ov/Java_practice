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
            int arr[] = new int[months];

            arr[0] = 1; // small
            arr[1] = 1; // medium
            arr[2] = 1; // large

            for (int i = 2; i < months; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
                if (i == (months - 1)) System.out.println(arr[i] + " pairs of rabbits");
            }    }
    }

}
