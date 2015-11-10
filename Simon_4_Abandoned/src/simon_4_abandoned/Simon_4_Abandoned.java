
package simon_4_abandoned;

import java.util.Scanner;

public class Simon_4_Abandoned {
    
    static String username;
    static boolean dead;
    static String Input;

    public static void main(String[] args) {
    begin();
    }
    static void begin() {
        
        Scanner yes = new Scanner(System.in);
        System.out.println("Hello, Welcome to Abandoned. Can you please answer a few questions for me? Yes or No?");
        Input = yes.nextLine();
        if("yes".equalsIgnoreCase(Input)) {
            questions();
        }
        else if("No".equalsIgnoreCase(Input)) {
            System.out.println("Well, you will have a hard time playing this game then.");
            System.out.println("Please answer the questions.");
            questions();
        }
        else {
        System.out.println("Please input Yes or No.");
        begin();
        }
        
        

    }
    
    static void questions() {
        Scanner name = new Scanner(System.in);
        Scanner rooms = new Scanner(System.in);
        System.out.println("Awesome!");
        System.out.println("What's your name?");
        Input = name.nextLine();
        System.out.println("Welcome " + Input + ", are you scared of dark rooms?");
        Input = rooms.nextLine();
        if("Yes".equalsIgnoreCase(Input)) {
            System.out.println("Unfortunately, this game is based on entering and leaving dark rooms.");
            System.out.println("All in all, let's not give anything away, and just get started.");
            begingame();
        }
            else if("No".equalsIgnoreCase(Input)) {
                System.out.println("Good! You will enjoy this game!");
                begingame();
                    
                    }
            
        }
        
        
    static void begingame() {
        
    }
}
