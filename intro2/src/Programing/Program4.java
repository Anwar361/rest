package Programing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Program4 {
	int i=10, j=20;
		 
	    // Function to print all the permutations of str
	    static void printPermutn(String str, String ans)
	    {
	    	if (str.length() == 0) {
	            System.out.print(ans + " ");
	            return;
	        }
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            String ros = str.substring(0, i) +
	                        str.substring(i + 1);
	            printPermutn(ros, ans + ch);
	        }
	    }
	    
	    @SuppressWarnings("null")
		public static void sum(Program4 obj)
	    {
	    	obj.i=50;
	    	obj.j=60;
	    	int [] a = {2,3,4,5,6,7,8};
	    	String s1=Arrays.toString(a);
	    	Arrays.parallelSort(a);
    		System.out.println(Arrays.toString(a));
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	    	Program4 obj = new Program4();
	    	sum(obj);
	    	int a=obj.i+obj.j;	    			
	    	System.out.println(a);
	        String s = "abc";
	        printPermutn(s, "");
	       // sum();
	    }
	}
