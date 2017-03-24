package com.janghoon.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> vals = new ArrayList<>();
		for(int i=0; i<n ;i++){
			vals.add(in.nextInt());
		}
		
		//query ¼ýÀÚ
		int query = in.nextInt();
		
		for(int j=0 ; j<query ; j++){
			in.nextLine();
			String que = in.nextLine();
//			if(que=="Insert"){
//				int InIndex = in.nextInt();
//				int num= in.nextInt();
//				vals.add(InIndex, num);
//			}else if(que=="Delete"){
//				int DeIndex = in.nextInt();
//				vals.remove(DeIndex);
//			}
			switch(que){
			case "Insert":
				int InIndex = in.nextInt();
				int num= in.nextInt();
				vals.add(InIndex, num);
				break;
			case "Delete":
				int DeIndex = in.nextInt();
				vals.remove(DeIndex);
				break;
			}
		}
		for(int k=0 ; k<vals.size();k++){
			System.out.print(vals.get(k)+" ");
		}
		in.close();

	}

}
