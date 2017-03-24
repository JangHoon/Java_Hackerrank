package com.janghoon.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String name = null;
//		String s=null;
		int phone=0;
	      HashMap<String,Integer> contacts = new HashMap<>();
	      int n=in.nextInt();
	      in.nextLine();
	      for(int i=0;i<n;i++)
	      {
	         name=in.nextLine();
	         phone=in.nextInt();
	         in.nextLine();
	         contacts.put(name, phone);
	          
	          
	      }
	      ArrayList<String> names = new ArrayList<>();
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         names.add(s);
	        	         
	         
	      }
	      
	    
	      for(int i=0 ; i<contacts.size();i++){
	   
	    	  if(contacts.containsKey(names.get(i))){
	    		  System.out.println(names.get(i)+"="+contacts.get(names.get(i)));
	    	  }else{
	    		  System.out.println("Not found");
	    	  }
	      
	      }
	      in.close();

	}

}
