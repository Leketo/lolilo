package com.leketo.lolilo.entity.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks an annotation as being a meta-annotation for entity classes and attributes.
 *
 * <p>Meta-annotations are automatically processed by metadata loader and are available via
 * {@code MetaClass.getAnnotations()} or {@code MetaProperty.getAnnotations()}. They can be also added or overridden in
 * {@code metadata.xml}.
 *
 * <p>If a meta-annotation is defined on a class, it's propagated down to subclasses until it has the
 * {@code propagateToSubclasses} attribute set to false. See for example {@link SystemLevel} annotation.
 */
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MetaAnnotation {
}
