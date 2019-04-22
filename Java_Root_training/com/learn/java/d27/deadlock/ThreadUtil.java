package com.learn.java.d27.deadlock;

public class ThreadUtil{ 
    // Util class to sleep a thread 
    public static void sleep(long millis) 
    { 
        try
        { 
            Thread.sleep(millis); 
        } 
        catch (InterruptedException e) 
        { 
            e.printStackTrace(); 
        } 
    } 
} 