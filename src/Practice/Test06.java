package Practice;

import java.util.Scanner;

// Reverse an array
public class Test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entwr the number of elements : ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Taking inputs
        System.out.println("Enter "+n+" numbers : ");
        for(int i=0;i<n;i++){
            numbers[i] = scanner.nextInt();
        }

        // Printing the array in reverse order
        System.out.println("Reversed array : ");
        for(int j=n-1;j>=0;j--){
            System.out.print(numbers[j]+" ");
        }

    }
}
