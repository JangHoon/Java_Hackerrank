package com.janghoon.test;

import java.util.Scanner;

public class HashsetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
        	s.nextLine();
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        int count=0;
        for(int j=0 ; j<t ; j++){
        	
        	for(int k=j+1; k<t ; k++){
        		if(pair_left[m].equals(pair_left[m-1]) && pair_left[m].equals(pair_left[m+1])){
        			pair_left[j]="0";
        			pair_right[j]="0";
        			
            		

                }
        		count++;
        		System.out.println(count);	
        }
           	
           
            
        }
        
        
        
        

	}

}
