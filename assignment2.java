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
        System.out.println("Array: " + Arrays.toString(array));
        
        int choice;
        do{
            displayMenu();
            choice = readAChoice(in);
            switch(choice){
                case 1:
                    findMinOfArray(array);
                    break;
                case 2:
                    findMaxOfArray(array);
                    break;
                case 3:
                    findAverageAndDisplayDifferences(array);
                    break;
                case 4:
                    findSumOfOddAndEvenIndexes(array);
                    break;
            }
        }while(choice != 5);
    }
    
    // printing the menu
    public static void displayMenu()
    {    
        //the menu option names can be changed
        System.out.println("1- Find the array's minimum.");
        System.out.println("2- Find the array's maximum.");
        System.out.println("3- Find the average value of the array.");
        System.out.println("4- Find the sum of elements with odd and even numbered indexes.");
        System.out.println("5- Exit");
    }

    // reading choice from user
    public static int readAChoice(Scanner in)
    {
        System.out.print("Choice: ");
        return in.nextInt();
    }

    //finding the array's minimum
    public static void findMinOfArray(int[] array)
    {
        int min = array[0];
        for(int num : array){
            if(num < min)
                min = num;
        }
        System.out.println("Array's minimum: " + min);
    }

    //finding the array's maximum
    public static void findMaxOfArray(int[] array)
    {
        int max = array[0];
        for(int num : array){
            if(num > max)
                max = num;
        }
        System.out.println("Array's maximum: " + max);
    }
    
    //finding the average and display differences
    public static void findAverageAndDisplayDifferences(int[] array)
    {
        int sum = 0;
        for(int number : array)
        {
            sum += number;
        }
        double average = (double) sum / array.length;
        System.out.println("The average of the array is " + average);

        double[] arrayOfDifferences = new double[array.length];
        for(int i = 0; i < array.length; i++)
        {
            arrayOfDifferences[i] = array[i] - average;
        }
        System.out.print("Differences between elements of array and the average is [");
        for(int i = 0; i < arrayOfDifferences.length; i++)
        {
            System.out.printf("%.2f", arrayOfDifferences[i]);
            if(i < arrayOfDifferences.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void findSumOfOddAndEvenIndexes(int[] array)
    {
        int sumOfOddIndexes = 0;
        int sumOfEvenIndexes = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(i % 2 == 0)
            {
                sumOfEvenIndexes += array[i];
            }
            else
            {
                sumOfOddIndexes += array[i];
            }
        }
        System.out.println("Sum of odd indexes: " + sumOfOddIndexes);
        System.out.println("Sum of even indexes: " + sumOfEvenIndexes);
    }
}