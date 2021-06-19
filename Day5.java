import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        int i,result;
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (i=1;i<=10;i++)
        {
            result=n*i;
             System.out.println(n + " x " +  i  + " = " +result);
        }
    }
}
