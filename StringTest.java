package com.janghoon.test;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
	
		String[] array= {str1,str2};
		
		int sum= str1.length()+str2.length();
		System.out.println(sum);
		Arrays.sort(array);
		if(array[0]==str1){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
		String firstcap=array[0].substring(0,1).toUpperCase()+array[0].substring(1);
		array[0]=firstcap;
		for(int i=0 ; i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		in.close();
		

	}

}
