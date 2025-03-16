package Projects;

// A task scheduling system where tasks are executed in the order they were added
// This uses Queue(Based Linked List) Data Structure ensures First-in-first-Out execution

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskSheduler {
    public static void main(String[] args) {
        Queue<String> task = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String command;

        while(true){
            System.out.println("-'Enter' task to Add :\n- type to 'PROCESS' to execute tasks\n-'EXIT' to quit");
            command = scanner.nextLine();

            if(command.equalsIgnoreCase("EXIT")){
                break;
            } else if (command.equalsIgnoreCase("PROCESS")) {
                if(!task.isEmpty()){
                    System.out.println("Processing : "+task.poll());
                }else{
                    System.out.println("No tasks in Queue.");
                }
            } else{
                System.out.println(task.offer(command));
                System.out.println("Task added: "+command);
            }
        }
        scanner.close();
    }
}
