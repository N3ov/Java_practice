import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rabbits {

    public static int rabbit(int months){

        // recursive
        if (months == 0 || months == 1 || months == 2) return 1;
        else if (months == 2) return 2;
        else{
            return rabbit( months - 1) + rabbit(months - 3);
        }
    }

    public static void main(String args[])throws IOException {

        System.out.println("How many months pass? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int months = Integer.parseInt(in.readLine());

        if (rabbit(months) == 1) System.out.print("A rabbits here");
        else if (rabbit(months) == 2) System.out.print("A pair of rabbits here");
        else System.out.print(rabbit(months) + " pairs of rabbits here");

    }
}

/*
    rabbits regular
mon 0 1 2 3 4 5 6 7  8
------------------------
Big 0 0 1 1 1 2 3 4  6
Med 0 1 0 0 1 1 1 2  3
Sml 1 0 0 1 1 1 2 3  4
------------------------
Tot 1 1 1 2 3 4 6 9 13

1 1 1 ([0]+[2]) ([1]+[3])...etc

*/