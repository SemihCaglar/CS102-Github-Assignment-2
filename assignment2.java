import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class assignment2 {
    public static void main(String[] args) {
        int arrSize;
        
        // taking the array size from the user
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the array size: ");
        arrSize = in.nextInt();

        //creating the array with random integers
        int[] array = new int[arrSize];
        Random randn = new Random();
        for(int i = 0; i<arrSize; i++){
            int random = randn.nextInt(101);
            array[i] = random;
        }

    }
    
}