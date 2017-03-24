package com.janghoon.test;

import java.util.Arrays;
import java.util.Scanner;


public class AnagramTest {
	
	static boolean isAnagram(String a, String b) {
        
		boolean check = false;
        // Complete the function by writing your code here.
//		Stack<Character> lists = new Stack<Character>();
		
		if(a !=null && b !=null){
			char[] arrayA= a.toLowerCase().toCharArray();
			char[] arrayB=b.toLowerCase().toCharArray();
			Arrays.sort(arrayA);
			Arrays.sort(arrayB);
			check=Arrays.equals(arrayA, arrayB);
		}
		
		
		return check;
//		String newA =arrayA.t
//		String newB =arrayB.toString();
//		System.out.println(newA);
//		System.out.println(newB);
//		System.out.println(arrayA.equals(arrayB));
//		System.out.println(newA.compareTo(newB));
		
//		if(arrayA.length==arrayB.length && newA.compareTo(newB)==0){
//			return true;
//		}else{
//			return false;
//		}
//	   int leng= a.length();
//	   
//	   for(int i=0 ;i<leng ;i++){
//		   lists.push(a.charAt(i));
//	   }
//	   for(int k=0;k<lists.size();k++){
//		   char ch=lists.peek();
//		   for(int j=0 ; j<leng ; j++){
//			   	if(ch==a.charAt(j)){
//			   		count++;
//			   	}
//				System.out.println(lists.pop());   
////				   if(a.charAt(i)==lists.pop()){
////					   arrayA.
////				   }
//			   }
//	   }
//	   
//		   
//	   
//	   
//       
//       return false; 
    }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

}
