package com.learn.java.lib.d40regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPrac {

	public static void main(String[] args) {
		
		// start and end charecter 
		
		regexFind("String","[^cat]");
		
		
		// charecter class "[abcd]" - "abcd"
		
		
		
		
		
		
		
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void regexFind(String string, String regex) {
		Pattern p = Pattern.compile(regex);
		CharSequence chstr = string;
		Matcher m = p.matcher(chstr);
		System.out.println("Find : "+m.find());
	}

}
