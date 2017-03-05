package practice.annotation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jchen on 19/02/17.
 */
@FirstAnnotation(name="type", gid=Long.class)
public class UserAnnotation {

    @FirstAnnotation(name="param", id=1, gid=Long.class)
    private int age;

    @FirstAnnotation(name="construct", id=2, gid=Long.class)
    public UserAnnotation() {

    };

    @FirstAnnotation(name="public method", id=3, gid=Long.class)
    public void getPublicMethod() {
        Map m = new HashMap();
    }

    @FirstAnnotation(name="protected method", id=4, gid=Long.class)
    public void getProtectedMethod(){
        Map m = new HashMap(0);
    }

    @FirstAnnotation(name="private method", id=5, gid=Long.class)
    private void getPrivateMethod(){
        Map m = new HashMap(0);
    }

    public void b(Integer a){
    }
}
