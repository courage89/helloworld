package com.dhf.git.helloworld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println("This is the first commit...");
        
        System.out.println("This is the second commit...");
        
        System.out.println("This is the third commit...");
        
        int value = 100; System.out.println("Modify after first commit in branch1..., value:" + value);
        
        String value2 = "abc"; System.out.println("This is the hot fix 1 in branch2..., value:" + value2);
    }
}
