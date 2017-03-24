package com.janghoon.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
      	
      	Arrays.sort(s,0,n,Collections.reverseOrder(new Comparator<String>(){

			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				BigDecimal val1 = new BigDecimal(arg0);
				BigDecimal val2= new BigDecimal(arg1);
				
				return val1.compareTo(val2);
			}
      		
      	}));
      	
//      	for(int i=0 ;i <n ; i++){
//      		BigDecimal valI= new BigDecimal(s[i]);
//      		for(int j=0 ; j<n ; j++){
//                BigDecimal valJ= new BigDecimal(s[j]);
//                String a = s[i];
//                String b =s[j];
//                if(valI.intValue()>valJ.intValue()){
//                    
//                    
//                    s[i]=s[j];
//                    s[j]=a;
//                } else if(valI.abs()==valJ.abs()){
//                	s[i]=a;
//                	s[j]=b;
//                }
//      		}
//      	}
      	

      	for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

	}

   }
