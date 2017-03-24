package com.janghoon.test;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer newstr = new StringBuffer(A);
        newstr.reverse();
        String newOne =newstr.toString();
        if(newOne.compareTo(A)==0){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
        
        sc.close();
       
          

	}

}
