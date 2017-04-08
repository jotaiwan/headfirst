package chapter10;

/**
 * Created by jotaiwan on 1/04/2017.
 */
public class Duck277 {
    private int size;
    private static int dockCount;

    public static void main(String[] args) {
        // page277: Error:(10, 46) java: non-static variable size cannot be referenced from a static context
//        System.out.println("Size of ducik" + size);

//        page278: Error:(13, 46) java: non-static method getSize() cannot be referenced from a static context
//        System.out.println("Size of ducik" + getSize());


    }

    public Duck277() {
        dockCount++;
        System.out.println("dockCount is now " + dockCount);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
