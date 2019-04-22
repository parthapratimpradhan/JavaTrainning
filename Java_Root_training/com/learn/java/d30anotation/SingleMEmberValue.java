package com.learn.java.d30anotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SingleMEmberValue {
	
	int value1() default 10;
	
	String value();

}
