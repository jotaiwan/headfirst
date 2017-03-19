package chapter08;

/**
 * Created by jotaiwan on 19/03/2017.
 */
public class SuperStudent {


    private int weight,height;
    SuperStudent(){
        weight = 0; height=0;
    }
    SuperStudent(int weight,int height){
        this.weight = weight;
        this.height = height;
    }
    void showData(){
        System.out.printf("Height:%s \tWeight %s",this.weight, this.height);
    }

}
