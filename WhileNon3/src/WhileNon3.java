public class WhileNon3 {

    public static void main(String args[]){

        for (int i = 1; i <= 100; i++){

            int non3 = i % 3;
            if (non3 != 0) System.out.print(i + " ");
        }
    return;
    }
}
