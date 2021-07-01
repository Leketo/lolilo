package com.leketo.lolilo.entity.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that annotated entity/field is low-level and should not be available for end-user in various entity/field lists. <br>
 * For field indicates that attribute should not be available for dynamic filters in UI.
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@MetaAnnotation
public @interface SystemLevel {

    boolean value() default true;

    /**
     * Set to false if you don't want this annotation to be set on subclasses.
     */
    boolean propagateToSubclasses() default true;
}
