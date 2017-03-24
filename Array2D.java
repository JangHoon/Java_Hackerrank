package com.janghoon.test;

import java.util.Scanner;

public class Array2D {  
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int temp=-63;
        int i;
        int j;
        for(i=0; i < 6; i++){
            for(j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
            
          }
            
        
        for(i=0;i<6;i++){
            for(j=0;j<6;j++){
            	if(j+2<6 && i+2<6){
            		int temp2 = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
            		temp = Math.max(temp, temp);
//            		if(temp2>temp){
//            			temp = temp2;
//            		}
                
            	}
            }
        }
//        for(int a=0 ; a<4 ;a++){
//        	for(int b=0 ; b<4 ; b++){
//        		
//        }
//      }
 
        System.out.println(temp);
        
        in.close();
	}

}
