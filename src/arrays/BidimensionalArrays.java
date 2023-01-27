package arrays;

public class BidimensionalArrays {
    public static void main(String[] args){
        int [][] matrix = new int[4][5];

        matrix [0][0] = 15;
        matrix [0][1] = 25;
        matrix [0][2] = 31;
        matrix [0][3] = 22;
        matrix [0][4] = 55;

        matrix [1][0] = 10;
        matrix [1][1] = 21;
        matrix [1][2] = 14;
        matrix [1][3] = 8;
        matrix [1][4] = 9;

        matrix [2][0] = 32;
        matrix [2][1] = 33;
        matrix [2][2] = 54;
        matrix [2][3] = 55;
        matrix [2][4] = 1;

        matrix [3][0] = 88;
        matrix [3][1] = 84;
        matrix [3][2] = 96;
        matrix [3][3] = 51;
        matrix [3][4] = 22;

        //System.out.println(matrix[0][0]);

        for (int i = 0; i < 4; i++) {

            System.out.println("  ");
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j]);
            }
        }

    }
}

