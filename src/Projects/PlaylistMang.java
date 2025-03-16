package Projects;

import java.util.LinkedList;
import java.util.Scanner;

// A simple music playlist manager that allows adding / removing and navigating songs.
// Concept : LinkedList is Used for effcient traversal.
public class PlaylistMang {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int currentIndex = -1;
        String command;

        while(true){
            System.out.println("Commands : ADD song,NEXT,PREV,EXIT");
            command = scanner.nextLine();

            if(command.equalsIgnoreCase("EXIT")){
                break;
            } else if(command.startsWith("ADD")){
                String song = command.substring(4);
                playlist.add(song);
                if(currentIndex == -1){
                    currentIndex = 0;
                }
                System.out.println("Added song: "+song);
            } else if(command.equalsIgnoreCase("NEXT")){
                if(currentIndex + 1 < playlist.size()){
                    currentIndex++;
                    System.out.println("Playing: "+playlist.get(currentIndex));
                }else {
                    System.out.println("End of the playlist.");
                }
            } else if(command.equalsIgnoreCase("PREV")){
                if(currentIndex > 0){
                    currentIndex --;
                    System.out.println("Playing: "+playlist.get(currentIndex));
                }else {
                    System.out.println("Start of playlist.");
                }
            }
        }
        scanner.close();
    }
}
