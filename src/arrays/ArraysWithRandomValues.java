package arrays;

public class ArraysWithRandomValues {
    public static void main(String[] args) {
        int [] numbersArray = new int[50];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i]=(int)Math.round(Math.random()*100);
        }
        for (int number : numbersArray ) {
            System.out.println(number);
        }
    }

}

