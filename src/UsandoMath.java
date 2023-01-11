import java.util.Scanner;

public class UsandoMath {
    public static void main(String[] args) {

        //returning square root from a double type number
        System.out.println("Give me a double number and I will tell you its square root");
        Scanner scanner1 = new Scanner(System.in);
        double number1 = scanner1.nextDouble();
        double squareRoot1 = Math.sqrt(number1);
        System.out.println("La raiz cuadrada de " + number1 + " es " + squareRoot1);

        //returning square root from a double type number as an integer, refunding
        System.out.println("");
        System.out.println("Give me a double number and I will tell you its square root, but this time I'm going to save it as an integer variable");
        Scanner scanner2 = new Scanner(System.in);
        double number2 = scanner2.nextDouble();
        int squareRoot2 = (int)Math.sqrt(number2);
        System.out.println("La raiz cuadrada de " + number2 + " es " + squareRoot2);

        //returning a rounded value from a double. Math.round could receive a double and return a long, and receive a float and return an integer.
        System.out.println("");
        System.out.println("Give me a double number and I will round it and return a long to you");
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("");
        double number3 = scanner3.nextDouble();
        long roundNumber = Math.round(number3);
        System.out.println(roundNumber);

        //Returns the value of the first argument raised to the power of the second argument.
        System.out.println("");
        System.out.println("Give me a double number");
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("");
        double number4 = scanner4.nextDouble();
        System.out.println("Give me another double number and I'll return you the first number raised to the power of the second");
        double number5 = scanner4.nextDouble();
        double raisedNumber = Math.pow(number4, number5);
        System.out.println(raisedNumber);*/

        //Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.


        double randomNumber = Math.random();
        double number7 = 0;
        do {
            System.out.println("");
            System.out.println("Guess the random number that I've just created");
            Scanner scanner5 = new Scanner(System.in);
            number7 = scanner5.nextDouble();
        }while (randomNumber != number7);


    }
}


