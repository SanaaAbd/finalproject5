
/**
 * This is the main process of the rock paper scissor
 * this will process the user and computer picks
 * this will figure out who wins
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main_process
{
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static void display(String who, int s) {
        switch (s) {
            case main_process.ROCK:
                System.out.print(who + " selected ROCK   ");
                break;
            case main_process.PAPER:
                System.out.print(who + " selected PAPER   ");
                break;
            case main_process.SCISSORS:
                 System.out.print(who + " selected SCISSORS   ");
                break;
            default:
                break;
         }
        }
    /// this deciedes who wins
    public static int compareSelections(int userSelection, int computerSelection) {
    if(userSelection==computerSelection){
            return 0;
        }
     switch (userSelection) {
            case ROCK:
        return (computerSelection == SCISSORS ? 1 : -1);

        case PAPER:
        return (computerSelection == ROCK ? 1 : -1);

        case SCISSORS:
        return (computerSelection == PAPER ? 1 : -1);
        }
    return 0;
    }
}
