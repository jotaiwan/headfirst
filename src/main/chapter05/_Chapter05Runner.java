package chapter05;

/**
 * Created by jotaiwan on 5/03/2017.
 */
public class _Chapter05Runner {

    public static void main(String[] args) {
        simpleDotComTester();       // page106
        page110();
    }

    private static void simpleDotComTester() {
        // final code for simpleDotComTester
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourSelf(userGuess);
        userGuess = "1";
        result = dot.checkYourSelf(userGuess);
    }

    private static void page110() {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom dot = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        dot.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserINput("Enter a number");
            String result = dot.checkYourSelf(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                // program stop when return "kill"
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
