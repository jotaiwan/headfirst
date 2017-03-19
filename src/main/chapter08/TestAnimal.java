package chapter08;

/**
 * Created by jotaiwan on 19/03/2017.
 */
public abstract class TestAnimal {
    private int age;
    private int weight;

    public TestAnimal(int a, int w) {
        setAge(a);
        setWeight(w);
    }

    public TestAnimal(int w) {
        this(3, w);
    }

    public TestAnimal() {
        this(3, 15);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int n) {
        if (n < 0) {
            age = 1;
        }
        else {
            age = n;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int n) {
        if (n < 0) {
            weight = 1;
        }
        else {
            weight = n;
        }
    }

    public abstract void speak();
}
