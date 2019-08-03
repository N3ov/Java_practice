public class AddTwoMatrix {

    public static void main(String argv[]){
        // init 2 x 3 arr
        int[][] arr_1 = {{1, 2, 3},
                         {4, 5, 6}};

        int[][] arr_2 = {{7, 8, 9},
                         {1, 5, 9}};

        // new reference & new object
        int rows = arr_1.length, columns = arr_1[0].length;
        int result[][] = new int[rows][columns];

        // arr_1 plus arr_2
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                result[i][j] = arr_1[i][j] + arr_2[i][j];
                System.out.print(result[i][j] + " ");
            }
        System.out.println();
        }
    return;
    }

}
