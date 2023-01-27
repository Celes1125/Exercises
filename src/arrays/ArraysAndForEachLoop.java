package arrays;
public class ArraysAndForEachLoop {
    public static void main(String[] args) {
        String [] countries = new String [8]; // Other way to declare it: String [] countries = {"Argentina", "Italia", "España"}...
        countries [0]="Argentina";
        countries [1]="Italia";
        countries [2]="España";
        countries [3]="Alemania";
        countries [4]="Suiza";
        countries [5]="Francia";
        countries [6]="Austria";
        countries [7]="Eslovenia";

        // For loop:

        for (int i = 0; i < countries.length; i++) {
            System.out.println("Country " + (i+1) + " " + countries[i]);

        }
        // For each loop:

        for (String element:countries){
            System.out.println(element);
        }

    }
}
