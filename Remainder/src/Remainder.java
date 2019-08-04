import java.io.*;

public class Remainder {

    public static void main(String args[]) throws IOException  {
        System.out.println("Insert a integer number");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());

        switch (num % 3){

            case 0: System.out.println("Zero \n");
                    break;
            case 1: System.out.println("One \n");
                    break;
            default: System.out.println("Two \n");
                    break;
        }
        return;
    }
}
