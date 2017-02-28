package chapter04;

/**
 * Created by jotaiwan on 28/02/2017.
 */
public class DogPage073 {
    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }

    // page74
    void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            System.out.println("Ruff!");
            numOfBarks--;
        }
    }
}
