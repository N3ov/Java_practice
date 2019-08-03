import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rabbits {

    public static int rabbit(int months){

        // recursive
        if (months == 0) return -1;
        else if (months == 1 || months ==2) return 1;
        else{
            return rabbit( months - 1) + rabbit(months - 2);
        }
    }

    public static void main(String args[])throws IOException {

        System.out.println("How many months pass? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int months = Integer.parseInt(in.readLine());

        if (rabbit(months) == -1) System.out.print("No rabbits here");
        else if (rabbit(months) == 1) System.out.print("A pair of rabbits here");
        else System.out.print(rabbit(months) + " pairs of rabbits here");

    }
}
