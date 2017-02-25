package chapter01;

/**
 * Created by jotaiwan on 25/02/2017.
 */
public class Chapter01 {
    public static void main(String[] args) {
        page009();
        page010();
        page011();
        page012();
        page013();
        page014();
        page016();
        page020();
        page021();
        page023();
        page024();
    }

    private static void page009() {
        System.out.println("I Rule!");
        System.out.println("The World");
    }

    private static void page010() {
        // do something
        int x = 3;
        String name = "Dirk";
        x = x * 17;
        System.out.println("x is " + x);
        double d = Math.random();

        // do something again and again
        while (x > 12) {
            x = x -1;
        }

        for (int i = 0; i < 10; i ++) {
            System.out.println("i is now " + i);
        }

        // do something under this condition
        System.out.println("x is " + x + " now");
        if (x == 10) {
            System.out.println("x must be 10");
        } else {
            System.out.println("x isn't 10");
        }
        if ((x < 3) && (name.equals("Dirk"))) {
            System.out.println("Gently");
        }
        System.out.println("this line runs no matter what");
     }

     private static void page011() {
         int x = 4;
         while (x > 3) {
             // loop code will run because x is greater than 3
             x = x - 1;
         }
         int z = 27;
         while (z == 17) {
             // loop code will not run because z is not equal to 17
         }
     }

    private static void page012() {
        // while loop
        int x = 1;
        System.out.println("Before the loop");
        while (x < 4) {
            System.out.println("In the loop");
            System.out.println("Value of x is " + x);
            x++;
        }
        System.out.println("This is after the loop");
    }

    private static void page013() {
        // conditional branching
        // Test 1
        int x = 3;
        if (x == 3) {
            System.out.println("x must be 3");
        }
        System.out.println("this line runs no matter what");

        // Test 2
        int y = 2;
        if (y == 3) {
            System.out.println("y must be 3");
        } else {
            System.out.println("y is NOT 3");
        }
    }

    private static void page014() {
        int beerNum = 99;
        String word = " bottles";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = " bottle";
            }
            System.out.println(beerNum + word + " of beer on the wall");
            System.out.println(beerNum + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around");
            beerNum --;

            if (beerNum > 0) {
                System.out.println(beerNum + word + " of beer on the wall");
            } else {
                System.out.println("No more bottle of beer on the wall");
            }
        }
    }

    private static void page016() {
        // Phrase-O-Matic or PhraseOMatic
        String[] wordListOne = {"24/7", "multi-Tier", "30,00 foot", "B-to-B", "win-win", "front-end",
                "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed",
                "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged",
                "aligned", "targeted", "sared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + ", " + wordListTwo[rand2] + ", " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }

    private static void page020() {
        int x = 3;
        while (x > 0) {

            if (x == 2) {
                System.out.print("b c");
            }
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }

    private static void page021() {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }

    private static void page023() {
        int x = 0;
        int y = 0;
        while (x < 5) {
            if (y < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }

    private static void page024() {
        int x = 0;

        while (x < 3) {
            System.out.print("a");

            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");

            if (x > 1) {
                System.out.print(" oyster");
                x = x + 1;
            }
            if (x == 1) {
                System.out.print("noys");
            }
            if (x < 1) {
                System.out.print("oise");
            }
            System.out.println("");
            x = x + 1;
        }
    }
}
