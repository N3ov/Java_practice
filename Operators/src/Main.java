import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[])throws IOException {

        System.out.println("Insert a integer number:");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int firstNum = Integer.parseInt(in.readLine());

        System.out.println("Insert an operator: ");
        BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
        String operate = in2.readLine();

        System.out.println("Insert a integer number: ");
        BufferedReader in3 = new BufferedReader(new InputStreamReader(System.in));
        int secondNum = Integer.parseInt(in3.readLine());

        Operators oper = new Operators(firstNum, operate, secondNum);

        oper.Operators();


    }



}
