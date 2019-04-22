package com.learn.java.d30anotation;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;


@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
	String str() default "My anno test";
	int val() default 10;
}
