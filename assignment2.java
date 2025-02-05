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
        
        int choice;
        do{
            displayMenu();
            choice = readAChoice();
            switch(choice){
                case 1:
                    System.out.println("Array's minimum: "+findMinOfArray(array));
                    break;
                case 2:
                    System.out.println("Array's maximum: "+findMaxOfArray(array));
                    break;
                case 3:
                //will added method
                    break;
                case 4:
                //will added method
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
        System.out.println("3- Find the avarage value of the array.");
        System.out.println("4- Find the sum of elements with odd- and even-numbered indexes.");
        System.out.println("5- Exit");
    }

    // reading choice from user
    public static int readAChoice()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choice: ");
        return sc.nextInt();
    }

    //finding the array's minimum
    public static int findMinOfArray(int[] array)
    {
        int min=array[0];
        for(int num:array){
            if(num<min)
                min=num;
            
        }
        return min;
    }

    //finding the array's maximum
    public static int findMaxOfArray(int[] array)
    {
        int max=array[0];
        for(int num:array){
            if(num>max)
                max=num;
        }
        return max;
    }
}