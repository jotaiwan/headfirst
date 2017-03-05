package chapter05;

/**
 * Created by jotaiwan on 5/03/2017.
 */
public class _Chapter05Runner {

    public static void main(String[] args) {
//        simpleDotComTester();       // page106
//        page110();
//        page117();
//        page118();
        page119();
//        page121();
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

    private static void page117() {
        long y = 42;
        // ERROR: incompatible type: possible lossy conversion from long to int
//        int x = y;

        int a = 4;
        long b = a; // it's ok because long is bigger than int, chop it down to int
        System.out.println("what's b: " + b);

        long c = 4002;
        // ERROR: long is bigger than short, need cast to long
//        short d = c;
        short d = (short) c;
        System.out.println("what's d: " + d);
    }

    private static void page118() {
        Output output = new Output();
        output.go();
    }

    private static void page119() {
        // class MultiFor
        for (int x = 0; x < 4; x++) {
            for (int y = 4; y > 2; y--) {
                System.out.println(x + " " + y);
            }
            if (x == 1) {
                x++;
            }
        }
    }

    private static void page121() {
        // MixFor5
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner > 1; inner--) {
//                x = x + 3;
//                x = x + 6;
//                x = x + 2;
//                x++;
//                x--;
                x = x + 0;
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}
