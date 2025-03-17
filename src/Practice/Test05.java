package Practice;

import java.util.Scanner;

// Find Max Number in Array
public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the amount of number : ");
        int n = scanner.nextInt();

        int[] num = new int[n];

        System.out.println("Enter Your "+n+" numbers : ");
        for(int i=0;i<n;i++){
            num[i] = scanner.nextInt();
        }
        // Assume first element is the max
        int max = num[0];

        // Loop to check for the maximum value
        for(int i=1;i<n;i++){
            if(num[i] > max){
                max = num[i]; // Update max if a larger number is found
            }
        }

        System.out.println("Maximum Number is : "+max);
    }
}
