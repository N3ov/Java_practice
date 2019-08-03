import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileIsPrime {

    public static void main(String args[])throws IOException {
        System.out.println("Insert a integer number");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());

        if (num == 0 || num == 1){
            System.out.print(num + " is not a prime number");

        }else{

            for (int i = 2; i <= (num / 2); i++) {

                if (num % i == 0){

                    System.out.print(num + " is not a prime number");
                    break;
                } else{

                System.out.print(num + " is a prime number");
                break;
                }
            }
        }
        return;
    }
}
