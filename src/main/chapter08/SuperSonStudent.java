package chapter08;

/**
 * Created by jotaiwan on 19/03/2017.
 */
public class SuperSonStudent extends SuperStudent {
    private int score;

    SuperSonStudent() {//SonStudent方法
        super();
        score = 0;
    }

    SuperSonStudent(int weight, int height, int score) {  //SonStudent
        super(weight, height);
        this.score = score;
    }

    void showData() {
        super.showData();
        System.out.print("\tScore:" + this.score);
    }
}
