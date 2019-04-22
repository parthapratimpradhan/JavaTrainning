package com.learn.java.d30anotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface What{
	
	String  description() default "Testing";

}
