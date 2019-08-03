public class MultiplyMatrix {

    public static void main(String args[]){
        // init 2*3 arr_1
        // init 3*2 arr_2
        int[][] arr_1 = {{1, 2, 3},
                         {4, 5, 6}};

        int[][] arr_2 = {{7, 8},
                         {4, 5},
                         {1, 5 }};

        // arr_1: 2 x 3
        // arr_2: 3 x 2
        int arr_1_rows = arr_1.length, arr_1_columns = arr_1[0].length;
        int arr_2_rows = arr_2.length, arr_2_columns = arr_2[0].length;
        int result[][] = new int[arr_1_rows][arr_2_columns];

        // arr_1 element wise product with arr_2
        for (int i = 0; i < arr_1_rows; i++){
            for (int j = 0; j < arr_2_columns; j++){
                for (int k = 0; k < arr_1_columns; k++){

                    result[i][j] += arr_1[i][k] * arr_2[k][j];
                }
            }
        }

        // print 2D array result[][]
        System.out.println("2D Array:");
        for (int i = 0; i < arr_1_rows; i++){
            for (int j = 0; j < arr_2_columns; j++){

                System.out.print(result[i][j] + " ");
            }
        }
        return ;
    }

}

