package practice.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Created by jotaiwan on 2/05/2017.
 */

@Target({TYPE, METHOD, FIELD, CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface SecondAnnotation {
    boolean myBoolean();
    String myString();
}
