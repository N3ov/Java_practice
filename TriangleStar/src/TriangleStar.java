import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleStar {

    public static void main(String args[]) throws IOException {

        System.out.println("How many layers you wanna? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int layers = Integer.parseInt(in.readLine());
        /* Can't work
        String emptyTimes = " ";
        String starTimes = "*";
        System.out.print(emptyTimes.repeat(1))
        */

        for (int i = 0; i <= layers; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= layers - i +1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        return;
    }

}
