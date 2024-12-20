package finalproject5;


/**
 * this gets the username
 * this tells who wons from processing wh wins in the main_process
 * this tells the score
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RockPaperScissor
{
    private Player player;
    private Computer_Player computer;
    private int playerScore;
    private int computerScore;
    private int numberOfGames;

    
public RockPaperScissor() {
    player = new Player();
    computer = new Computer_Player();
    playerScore = 0;
    computerScore = 0;
    numberOfGames = 0;
}
public static void main(String[] args) {
    RockPaperScissor rps = new RockPaperScissor();
    rps.getplayerName();// this get username
    rps.startGame();
}
    
public void startGame() {
    int playerinput = player.getInput();
    main_process.display(player.getName(), playerinput);
    // Get moves
    int computerinput = computer.getInput();
    main_process.display("computer", computerinput);
    // Compare moves and determine winner
    int compareResult=main_process.compareSelections(playerinput, computerinput);
    switch (compareResult) {
        case 0: // Tie
            System.out.println("Tie!");
            break;
        case 1: // player wins
            System.out.println(player.getName()+ " Beats " + "computer" +" You won!");
            playerScore++;
            break;
        case -1: // Computer wins
            System.out.println("Computer" +" Beats "+ player.getName()+" You Lost!");
            computerScore++;
            break;
        }
        numberOfGames++;
    if(playerScore==5) {
            System.out.println(player.getName()+" HAS WON THE GAME.............");
            new RockPaperScissor();
        }
    if(computerScore==5) {
        System.out.println("Computer "+" HAS WON THE GAME............");
        new RockPaperScissor();
       }
       // Ask the player to play again
    if (player.playAgain()) {
         System.out.println();
         startGame();
       } else {
           printStats();
        }
    }
//helps to get the users name
public void getplayerName() {
    player.askName();
}
//print the result
public void printStats() {
    System.out.println("Number of games played is "+numberOfGames);
    System.out.println(player.getName()+"'s score "+playerScore);
    System.out.println("Computers score "+computerScore);
}
}
