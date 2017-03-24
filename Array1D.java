package com.janghoon.test;

import java.util.Scanner;

public class Array1D {
	public static int K;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[][] lists= new int[n][];
		
		for(int i=0 ; i<n ; i++){
			int d= in.nextInt();
			K = in.nextInt();
			lists[i]=new int[d];
			for(int j=0 ; j<d;j++ ){
					
				lists[i][j]=in.nextInt();
				
				
			}
			System.out.println(lists[i].length);
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<lists[i].length;){
				
				if(lists[i][j]!=1){
					j=j+1;
					
				}else{
					j=j-1+K;
				}
				
				if(j>lists[i].length-1){
					System.out.println("YES");
				}else{
					System.out.println("No");
				}
			}
			
		}
		

	}

}
