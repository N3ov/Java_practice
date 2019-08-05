import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RabbitMath {

    public static void main(String atgs[])throws IOException {
        System.out.println("How many months pass? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int months = Integer.parseInt(in.readLine());

        if (months == 0 || months == 1 || months ==2) System.out.print("A pair of rabbit");
        else{
            int month0 = 1;
            int month1 = 1;
            int month2 = 1;
            int temp = 0;

            for ( int i = 3; i <= months; i++){
                temp = month0 + month2;
                month0 = month2;
                month2 = temp;
            }
            System.out.print(temp + " pairs of rabbits");
        }

    }
}
