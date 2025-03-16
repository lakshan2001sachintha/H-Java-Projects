package Projects;

import java.util.Scanner;
import java.util.Stack;

// Browser History using Stack Data Str.
// .Stack is used to store previosly visited pages
// .User Can visit new pages and go back to previous pages
public class BrowserHistory {
    public static void main(String[] args) {
        // Create a stack to store browsing history
        Stack<String> history = new Stack<>();
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Variable to store user input command
        String command;

        // Infinite loop to continuously accept user input
        while(true){
            // Prompt user for input
            System.out.println("Enter URL to vist or type 'BACK' to go back or 'EXIT' to quit ");
            // Read the user input
            command = scanner.nextLine();

            //Check if user wants to exit the program
            if(command.equalsIgnoreCase("EXIT")){
                break; //Exit the loop and terminate the program

                //Check if user wants to go back in History
            }else if(command.equalsIgnoreCase("BACK")){
                // If history is not empty , remove the last visited URL
                if(!history.isEmpty()){
                    history.pop();
                    if (history.isEmpty()) {
                        System.out.println("Back to: No previous page");
                    } else {
                        System.out.println("Back to: " + history.peek());
                    }

                }else{
                    System.out.println("No history avilable.");
                }
            }else{
                history.push(command);
                System.out.println("Visiting: " +command);
            }
        }
        scanner.close();
    }
}
