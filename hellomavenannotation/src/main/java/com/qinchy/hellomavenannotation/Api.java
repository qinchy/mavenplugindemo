package com.qinchy.hellomavenannotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Api {
    String author() default "qinchy";

    String desc() default "";
}
