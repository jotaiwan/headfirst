package practice.polymorphism;

/**
 * Created by jchen on 19/02/17.
 */
public class Circle implements IShape{
    int x = 10;
    public double area( ) {

        return (6 * x * x);
    }

    public double volume() {
        return (x * x * x);
    }
}
