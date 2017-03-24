package com.janghoon.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SubstringTest2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s= in.next();
        int n = in.nextInt();
        
        ArrayList<String> substrs= new ArrayList<>();
       
        for(int i=0 ;i<s.length()-n+1;i++){
            
           substrs.add(s.substring(i,i+n));
                
            
        }
        Descending descending = new Descending();
        Collections.sort(substrs,descending);
        
        
        System.out.println(substrs.get(0));
        System.out.println(substrs.get(substrs.size()-1));
        
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        int k = sc.nextInt();
//        String min = "";
//        String max = "";
//
//        for (int i = 0; i <= str.length() - k; i++) {
//            String substr = str.substring(i,  i + k);
//            if (substr.compareTo(min) < 0 || min.isEmpty()) {
//                min = substr;
//            }
//            if (substr.compareTo(max) > 0 || max.isEmpty()) {
//                max = substr;
//            }
//        }
//
//        System.out.println(min);
//        System.out.println(max);

	}

}
class Descending implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return arg0.compareTo(arg1);
	}
	
}
