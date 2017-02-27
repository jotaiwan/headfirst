package chapter02;

/**
 * Created by jotaiwan on 27/02/2017.
 */
public class _Chapter02Runner {
    public static void main(String[] args) {
        dogTestDrive();
        gameLauncher();
    }

    private static void dogTestDrive() {
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }

    private static void gameLauncher() {
        GuessGame game = new GuessGame();
        game.startGame();
    }

    private static void movieTestDrive() {
        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
}
