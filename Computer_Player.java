package finalproject5;

import java.util.Random;
/**
 * This class is a computer play thatll play
 * against the user.
 * the function in this class will help decide which to pick
 * amonth rock(1), paper(2), scissors(3)
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Computer_Player
{
    public int getInput() {
    Random random = new Random();
    int input = random.nextInt(3) + 1;
    return input;
}
}
