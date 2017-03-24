package com.janghoon.test;

import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        
        int[] vals= new int[n];
        int count = 0;
        int i,j;
        for(i=0 ; i<vals.length ; i++){
        	vals[i]=in.nextInt();
        	if(vals[i]<0){
        		count++;
        	}
        }
        
        for(i=0 ; i<=vals.length-1 ;i++ ){
        	int sum = vals[i]; //if(vals[i]<0){count++;}
    		
    	
        	
            for(j=i+1; j<vals.length;j++){
            	
                int sum1 = sum+vals[j];// sum+=vals[j];
                
                if(sum1 <0){
                    count++;
                    
                }
                
                sum =sum1; //생략 가능
            }
        }
        System.out.println(count);
        
        in.close();

	}

}
