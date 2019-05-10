package com.learn.java.lib.d40regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPrac {

	public static void main(String[] args) {
		
		// start and end charecter 
		
		//regexFind("String","[^cat]");
		
		
		// charecter class "[abcd]" - "abcd"
		
		
		// grey / gray  : "gr[ea]y"
		
		//String[] str = {"seperate", "separate", "separete"}; //"sep[ae]r[ae]te"
		
//		for(String s : str) {
//			regexFind(s,"sep[ae]r[ae]te");
//		}
		
		String[] str = {"<h1>", "<h2>", "<h6>", "<H3>", "<h7>", "<H3>"}; //"sep[ae]r[ae]te"
		
		for(String s : str) {
			//regexFind(s,"<[hH][1-6]>");
		}
		
		
		//[0-9a-fA-F]  or ⌈[A-Fa-f0-9]
		
		
		//[0-9A-Z_!.?]
		
		
		//[^0-9]
		
		//regexFind("some string without Iraq","q[^u]");
		
		
		//regexFind("some string without Qantas","[Qq][^u]");
		
		//date such as 03/19/76, 03-19-76, or even 03.19.76
		
		
		String[] strdate = {"03/19/76", "03-19-76", "03.19.76"};
		
		for(String s : strdate) {
			//regexFind(s,"03[-/.]19[-/.]76");
		}
		
		
		//Jeffrey|Geoffery|Jeffery|Geoffrey
		
		
		//String[] strname = {"Jeffrey", "Geoffery", "Jeffery", "Geoffrey"}; 
		
//		for(String s : strname) {
//			//regexFind(s,"(Je|Geo)ff(re|er)y");
//		}
//		
		// in js : //var patt1 = /W3S/i; or var patt = new RegExp("W3S ","i");
		//in java : Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		
		
		/**
		 * in js :
		 * var str = "The best things in life are free";
			var patt = new RegExp("E","i");
			var res = patt.exec(str);
			or
			var res = patt.test(str);

		 */
		
		
		String[] strname = {"color", "colour", "coloar"}; 
		
		for(String s : strname) {
			regexFind(s,"colou?r");
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void regexFind(String string, String regex) {
		Pattern p = Pattern.compile(regex);
		CharSequence chstr = string;
		Matcher m = p.matcher(chstr);
		System.out.println("Find in "+string+" : "+m.find());
	}

}
