package com.janghoon.test;

import java.util.Scanner;

public class SubstringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        if(0<=start && start<end && end<=S.length()){
        	String subString=S.substring(start,end);
            System.out.println(subString);
        }
        
        
        in.close();
	}

}
