import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws IOException {
        System.out.println("Insert a Sentences");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String sent = in.readLine();

        CharOfString sentence = new CharOfString(sent);

        sentence.CharOfString();


    }
}

