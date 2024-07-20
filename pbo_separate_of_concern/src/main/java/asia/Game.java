package asia;

/**
 *
 * @author Bagus Nur Kusuma 23201014
 */
public abstract class Game {
    protected int secretNumber;
    protected int guessLimit;
    
    public Game(int guessLimit) {
        this.guessLimit = guessLimit;
    }
    
    public abstract void play();
    public abstract String checkGuess(int guess, String input);
}