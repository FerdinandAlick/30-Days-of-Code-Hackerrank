import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println( factorial(scan.nextInt()) );
    }
        
    public static int factorial( int n )
    {
        return (n == 1) ? 1 : n*factorial(n-1) ;
    }
}