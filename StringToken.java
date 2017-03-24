package com.janghoon.test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner cin=new Scanner(System.in);
//		String[] a=cin.nextLine().trim().split("[ !,?\\._'@]+",0);
//		if(a.length==1&&a[0].equals("")){
//			System.out.println(0);
//		}else{
//			System.out.println(a.length);
//			for(String s:a)System.out.println(s);
//		}
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		
		StringTokenizer token = new StringTokenizer(str,"[ !,?\\._'@]+");
		System.out.println(token.countTokens());
		int numToken=token.countTokens();
		
		while(token.hasMoreElements()) {
            System.out.println(token.nextToken());
        }
		
//		for(int i=0 ; i < numToken ; i++){
//			String data=token.nextToken();
//			System.out.println(data);
//		}
		
		in.close();
		
	}

}
