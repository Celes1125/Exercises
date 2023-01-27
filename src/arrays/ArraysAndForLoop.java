public class ArraysAndForLoop {
    public static void main(String[] args) {
        int [] myArray = new int[5];
        myArray[0]=50;
        myArray[1]=60;
        myArray[2]=70;
        myArray[3]=80;
        myArray[4]=90;

        System.out.println(myArray[0]);
        for (int i = 0; i < 5; i++) {
            System.out.println(myArray[i]);
        }

        int [] myArray2 = {50,60,70,80,90};
        for (int i = 0; i < 5; i++) {
            System.out.println(myArray[i]);
        }

        int [] myArray3 = {5,6,7,8,9, 10, 11, 12, 13, 15, 19};
        System.out.println(myArray3.length);
        for (int i = 0; i < myArray3.length; i++) {
            System.out.println("The index " + i + " contains " + myArray3[i]);

        }

    }



}
