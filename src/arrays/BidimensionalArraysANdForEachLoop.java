package arrays;

public class BidimensionalArraysANdForEachLoop {
    public static void main(String[] args){
        int [][] matrix = {
                {10,15,20,22,23},
                {52,4,52,33,5},
                {47,59,87,41,25},
                {77,88,9,12,23},
                {55,61,63,2,78}
        };

        for (int[]row:matrix) {
            System.out.println();
            for (int z : row) {
                System.out.print(z + " ");
            }
            
        }
    }
}
