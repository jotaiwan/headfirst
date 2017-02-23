package demo.practice.annotation;

// http://blog.sina.com.cn/s/blog_93dc666c0101gzn5.html

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

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
