import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taxi {

    public static void main(String args[]) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int basicDistance = 1500;
        int distance = Integer.parseInt(in.readLine());
        int baseCarFare = 70;
        int carFare_add = (int) ((Math.ceil((distance - basicDistance) / 500) +1) * 5);
        int totalCarFare = baseCarFare + carFare_add;

        if (distance < 0) System.out.print("Error");

        else if(distance < basicDistance) System.out.print("Car Fare: " + baseCarFare + " NTD");

        else System.out.print("Car Fare: " + totalCarFare + "NTD");

        return;
    }
}
