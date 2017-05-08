package practice.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by jchen on 19/02/17.
 */
public class ParseAnnotation {
    public static void parseTypeAnnotation() throws ClassNotFoundException {
        Class clazz = Class.forName("practice.annotation.UserAnnotation");

        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            FirstAnnotation first = (FirstAnnotation)annotation;
            System.out.println("id= "+first.id()+"; name= "+first.name()+"; gid = "+first.gid());
        }
    }

    public static void parseMethodAnnotation(){
        Method[] methods = UserAnnotation.class.getDeclaredMethods();
        for (Method method : methods) {

            boolean hasAnnotation = method.isAnnotationPresent(FirstAnnotation.class);
            if (hasAnnotation) {

                FirstAnnotation annotation = method.getAnnotation(FirstAnnotation.class);
                System.out.println("method = " + method.getName()
                        + " ; id = " + annotation.id() + " ; description = "
                        + annotation.name() + "; gid= "+annotation.gid());
            }

            boolean hasAnnotation2 = method.isAnnotationPresent(SecondAnnotation.class);
            if (hasAnnotation2) {

                SecondAnnotation annotation = method.getAnnotation(SecondAnnotation.class);
                System.out.println("method = " + method.getName()
                        + " ; boolean = " + annotation.myBoolean() + " ; String = "
                        + annotation.myString());
            }

        }
    }

    public static void parseConstructAnnotation(){
        Constructor[] constructors = UserAnnotation.class.getConstructors();
        for (Constructor constructor : constructors) {

            boolean hasAnnotation = constructor.isAnnotationPresent(FirstAnnotation.class);
            if (hasAnnotation) {

                FirstAnnotation annotation =(FirstAnnotation) constructor.getAnnotation(FirstAnnotation.class);
                System.out.println("constructor = " + constructor.getName()
                        + " ; id = " + annotation.id() + " ; description = "
                        + annotation.name() + "; gid= "+annotation.gid());
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException {
        parseTypeAnnotation();
        System.out.println("...............");
        parseMethodAnnotation();
        System.out.println("...............");
        parseConstructAnnotation();
    }
}
