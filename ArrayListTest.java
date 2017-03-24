package com.janghoon.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            int d = in.nextInt();
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int col = 0; col < d; col++) {
                numbers.add(in.nextInt());
            }
            list.add(numbers);
        }
        
         int a=in.nextInt();
         for(int i=0;i<a;i++){
            int b=in.nextInt();
            int c=in.nextInt();
        try{
            System.out.println(list.get(b-1).get(c-1));
        } catch(Exception e){
            System.out.println("ERROR!");
        }
    }

	}

}
