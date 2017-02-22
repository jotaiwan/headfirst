package demo.practice.Polymorphism;

/**
 * Created by jchen on 19/02/17.
 */
public class Cube implements IShape {
    int radius = 10;
    public double area() {
        return (Math.PI * radius * radius);
    }
    public double volume() {
        return 0;
    }
}
