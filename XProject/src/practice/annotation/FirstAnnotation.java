package practice.annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Created by jchen on 19/02/17.
 */

@Target({TYPE, METHOD, FIELD, CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface FirstAnnotation {
    String name();
    int id() default 0;
    Class gid();
}
