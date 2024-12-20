package finalproject5;

import java.util.Scanner;
/**
 * this is the player(you) class
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private String name;// Represents the Players name
    Scanner sc = new Scanner(System.in);
    // sc will help to take inputs from keyboard
    
public String getName() {
    return name;
    }
    
public void setName(String name) {
    this.name = name;
    }

public void askName() {
    System.out.println("Please enter your name");
    name = sc.next();
    }

    public int getInput() {
        System.out.println("Select  ROCK  PAPER SCISSOR");
        String input = sc.next();
        input = input.toUpperCase();
        char c = input.charAt(0);
        if (c == 'R') {
            return main_process.ROCK;
        } else if (c == 'P') {
            return main_process.PAPER;
        } else if (c == 'S') {
            return main_process.SCISSORS;
        } else {
            getInput(); 
            return 0; 
        }
}

public boolean playAgain() {
    sc=new Scanner(System.in);
    System.out.print("Do you want to play again? ");
    String userInput = sc.nextLine();
    userInput = userInput.toUpperCase();
    return userInput.charAt(0) == 'Y';
    }
}
