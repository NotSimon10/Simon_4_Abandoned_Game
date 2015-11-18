package simon_4_abandoned;

import java.util.Scanner;

public class Simon_4_Abandoned {
    
    static String Input;
    static boolean dead;
    static String username;
    static int wanttoplay = 2;

    public static void main(String[] args) {
    
        while(wanttoplay > 1) {
            begin();
            }
        
        if (wanttoplay > 1) {
            begin();
            
        }
        else { while (wanttoplay < 1) {
        gameover();
        
        }
        }
        }
         
    
   
    
    static void begin() {
        
        Scanner yes = new Scanner(System.in);
        System.out.println("Hello, Welcome to Abandoned. Can you please answer a few questions for me? Yes or No?");
        Input = yes.nextLine();
        if("yes".equalsIgnoreCase(Input)) {
            System.out.println("Awesome!");
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
        System.out.println("What's your name?");
        username = name.nextLine();
        System.out.println("Welcome " + username + ", are you scared of dark rooms?");
        Input = rooms.nextLine();
        if("Yes".equalsIgnoreCase(Input)) {
            System.out.println("Unfortunately, this game is based on entering and leaving dark rooms.");
            System.out.println("All in all, let's not give anything away, and just get started.");
            ready();
          
        }
            else if("No".equalsIgnoreCase(Input)) {
                System.out.println("Good! You will enjoy this game!");
                ready();
                    
        }
            else {
                System.out.println("Please type Yes or No.");
                questions();
            }
            
        }
        
        
    static void begingame() {
        
        System.out.println("");
        System.out.println("You are trapped in a abandoned hospital. All you can remember is the outbreak.");
        System.out.println("You don't know what the outbreak was of. You just remember your name, " + username + ".");
        System.out.println("When you leave the bed, you see a dim light that flickers into the room at the pace of less than a second.");
        System.out.println("Although, the light remains in the room long enough for you to see a trail of blood.");
        System.out.println("You walk to the door and see two hallways, one with a flickering light that you think you can see a body at the end of,");
        System.out.println("and a dark hallway with no light at all.");
        System.out.println("You turn around and see a window with a ledge you can shimmey on.");
        System.out.println("What path do you choose? Dark, Flicker or Window?");
        choice();
    }
        
    static void choice() {
    
        Scanner choice = new Scanner(System.in);
        Input = choice.nextLine();
        if("dark".equalsIgnoreCase(Input)) {
            dark();
        }
        else if("flicker".equalsIgnoreCase(Input)) {
            flicker();
        }
        else if("window".equalsIgnoreCase(Input)) {
            window();
        }
        else {
            System.out.println("Please input Dark, Flicker, or Window.");
            choice();
        }
    }

    static void ready() {
        Scanner ready = new Scanner(System.in);
        System.out.println("Ready to begin?");
        Input = ready.nextLine();
        if("yes".equalsIgnoreCase(Input)) {
            begingame();
        }
        else if("no".equalsIgnoreCase(Input)){
            System.out.println("Too Bad, Here we go!");
            begingame();
        }
        else {
            System.out.println("Please input Yes or No.");
        }
    }
    
    static void dark() {
        
        System.out.println("");
        System.out.println("You walk into the dark hallway. You see nothing, nor do you hear anything.");
        System.out.println("As you walk along, you hear a faint noise. You casually stop as you hear your heart beat rise.");
        System.out.println("When you continue walking you see glass beneath your feet. You assume that was causing the noise.");
        System.out.println("After walking for a few minutes, glass slides through your shoe, and slides deep into your heel.");
        System.out.println("You release a loud scream, and automatically cover your mouth with your hand.");
        System.out.println("Your adrenaline rises at an incredible race, and the lights turn on. You aren't sure if you should");
        System.out.println("be releived or even more worried. When you lift your head from looking at the ground, you see a note");
        System.out.println("on the floor.");
        System.out.println("Do you open the note, or do you leave it?");
        notechoice();
    }
    
    static void notechoice() {
        Scanner note = new Scanner(System.in);
        Input = note.nextLine();    
        if("open note".equalsIgnoreCase(Input)) {
            opennote();
            
        }
        else if("leave it".equalsIgnoreCase(Input)) {
            leavenote();
        }
        else {
            System.out.println("Please input Open Note, or Leave It.");
            notechoice();
        }
    }

    static void flicker() {
            System.out.println("You walk into the hallway with a light flickering on and off every two or so seconds.");
    
}
    static void window() {
            System.out.println("You grab the window ledge and lift yourself onto the the seams of the wall. There are no lights around you.");

}

    static void opennote() {
        
            System.out.println("");
            System.out.println("You reach down and grab the note. It says \"Your mom is dead. She's in the room 508.\"");
            System.out.println("Your heart drops once again. You can no longer see straight. Then, everything is black.");
            System.out.println("You wake up with the note in your hand. Laying on the floor with blood on the ground.");
            System.out.println("Your back is sore and you can't make up the fact you landed on glass. There are three glass");
            System.out.println("pieces in your back. You reach back and pull them out. Screaming as you do so. Then you remember");
            System.out.println("that your mom is supposedly dead. Yet... Maybe someones messing with you?");
            System.out.println("Should you get your mom or leave her?");
            System.out.println("Type, Get Mom or Leave Mom.");
            momchoice();
        
    }

    static void leavenote() {
        
    }

    static void momchoice() {
            Scanner mom = new Scanner(System.in);
            Input = mom.nextLine();
        
        if(Input.contains("o")) {
                getmom();
                
            }
            else if(Input.contains("l")) {
                leavemom();
                
            }
            else {
              System.out.println("Please input Get Mom, or Leave Mom.");
              momchoice();
            }


    }
    static void leavemom() {
    
    
    }
    static void getmom() {
        
        System.out.println("");
        System.out.println("You know you are on floor six because the room in front of you says 611.");
        System.out.println("You must look around for a way down.. After walking around, you find an");
        System.out.println("elevator and a set of stairs?");
        System.out.println("Where do you go, Elevator or Stairs?");
        downchoice();
        
    }
    
    static void downchoice() {
        Scanner down = new Scanner(System.in);
        Input = down.nextLine();
        if("elevator".equalsIgnoreCase(Input)) {
            elevatordeath();
        }
        else if("stairs".equalsIgnoreCase(Input)) {
            stairs();
        }
        else {
            System.out.println("Please input, Elevator or Stairs.");
            downchoice();
        }
    
    }
    
    static void elevatordeath() {
        
        System.out.println("");
        System.out.println("The elevator is shaky as you go down, and all of a sudden...");
        System.out.println("It goes silent. The elevator is no longer connected. As you fall");
        System.out.println("to your death, you pray that your mom is okay.");
        System.out.println("In Pace Requiescat, " + username + ".");
        System.out.println("");
        System.out.println("Do you want to go to the last checkpoint?");
        checkpointelevator();
    }
    
    static void checkpointelevator() {
    Scanner choose = new Scanner(System.in);
    Input = choose.nextLine();
    if("yes".equalsIgnoreCase(Input)) {
        System.out.println("Okay let's go back!");
        opennote();
        
    }
    else if("no".equalsIgnoreCase(Input)) {
        System.out.println("Okay. Thanks for playing.");
        
    }else{
        System.out.println("Please input Yes or No.");
    }
    
        
    }
    
    static void stairs() {
        System.out.println("");
        System.out.println("You walk down the dusty set of stairs and see the room 511.");
        System.out.println("You must walk across the hall to your right to reach room 508.");
        System.out.println("Before you arrive, you hear a scream, you run to the room and your mom \nis on the floor with blood on the ground.");
        System.out.println("The window is open, and the hall is empty behind you.");
        System.out.println("Window or Hall?");
        deadmom();
    }
    
    static void deadmom() {
      Scanner mom = new Scanner(System.in);
        Input = mom.nextLine();
        if("Hall".equalsIgnoreCase(Input)) {
            momhall();
        }
        else if("Window".equalsIgnoreCase(Input)) {
            momwindow();
        }
        else{
            System.out.println("Please input Window or Hall.");
            deadmom();
        }
    }
    
    static void momhall() {
        System.out.println("You leave the hall and hear a shuffle from the room. You turn around");
        System.out.println("and the killer climbs in the window. That's the last thing you remember.");
        System.out.println("");
        System.out.println("Game Over " + username + ".");
        wanttoplay();
    }
    
    static void momwindow() {
        System.out.println("");
        
    
    }
    
    static void wanttoplay() {
        System.out.println("Do you want to play again?");
        Scanner play = new Scanner(System.in);
        Input = play.nextLine();
        if("yes".equalsIgnoreCase(Input)) {
            wanttoplay = 2;
        }
        else if("no".equalsIgnoreCase(Input)) {
            wanttoplay = -1;
        } else {
            System.out.println("Please input Yes or No.");
        }
    }
    
    static void gameover() {
        
    }
}