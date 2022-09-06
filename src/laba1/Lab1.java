package laba1;

public class Lab1 {
    public static void main(String[] args) {
        
        int[] myArray = new int[20];
        int indexOfMin = myArray[0];
        int indexOfMax = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = ((int)(Math.random() * 30) -15);
            System.out.print(" " + myArray[i] + " ");

            if (myArray[i] < indexOfMin) {
                indexOfMin = myArray[i];
            }

            if (myArray[i] > indexOfMax) {
                indexOfMax = myArray[i];
            }
        }

        System.out.println(" ");
        print("Минимальное число в массиве: ", indexOfMin);
        print("Максимальное число в массиве: ", indexOfMax);
        print("Разница между максимальным и минимальным числами: ", indexOfMax - (-indexOfMin));

    }

    private static void print (String text, int number) {
        System.out.println(text + number);
    }
}
