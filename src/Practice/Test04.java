package Practice;

import java.util.Scanner;
// SUM of N numbers
public class Test04 {
    public static void main(String[] args) {
        // Taking input for the size of array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Numbers : ");
        int n = scanner.nextInt();

        // Creating an array of size n
        int[] numbers = new int[n];

        // Input elements
        System.out.println("Enter "+n+" numbers : ");
        for(int i=0;i<n;i++){
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        // Loop through array to calculate sum
        for(int i=0;i<n;i++){
            sum+=numbers[i];
        }

        System.out.println("Sum of Numbers: "+sum);

    }
}
