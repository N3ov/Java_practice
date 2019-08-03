import java.io.*;

public class Remainder {

    public void main(String args[])  {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());

        int remainder = num % 3;

        switch (remainder){

            case 0: System.out.println("Zero \n");
                    break;
            case 1: System.out.println("One \n");
                    break;
            case 2: System.out.println("Two \n");
                    break;
        }
        return;
    }
}
