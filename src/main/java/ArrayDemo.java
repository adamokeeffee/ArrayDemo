
import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {


        int[] anArrays;

        anArrays = new int[10];

        anArrays[0] = 100;
        anArrays[1] = 200;
        anArrays[2] = 300;
        anArrays[3] = 400;
        anArrays[4] = 500;
        anArrays[5] = 600;
        anArrays[6] = 700;
        anArrays[7] = 800;
        anArrays[8] = 900;
        anArrays[9] = 1000;

        try
        {
            System.out.println("Please enter a new value for anArray[10]");
            Scanner scan1 = new Scanner(System.in);
            int num10 = scan1.nextInt();

            anArrays[10] = num10;
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("error " + a.getMessage());
        }



        System.out.println("Element at index 0:" + anArrays[0]);
        System.out.println("Element at index 1:" + anArrays[1]);
        System.out.println("Element at index 2:" + anArrays[2]);
        System.out.println("Element at index 3:" + anArrays[3]);
        System.out.println("Element at index 4:" + anArrays[4]);
        System.out.println("Element at index 5:" + anArrays[5]);
        System.out.println("Element at index 6:" + anArrays[6]);
        System.out.println("Element at index 7:" + anArrays[7]);
        System.out.println("Element at index 8:" + anArrays[8]);
        System.out.println("Element at index 9:" + anArrays[9]);

    }
}
