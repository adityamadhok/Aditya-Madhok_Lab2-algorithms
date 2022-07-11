package com.services;
import java.util.Scanner;

public class Service {

	public void process(int[] array) {
		
		Scanner obj=new Scanner(System.in);
		int value;
		
			System.out.println("Enter the value of target");
			value=obj.nextInt();
			boolean transactionSuccessful=false;
			
			for(int j=0;j<array.length;j++) {
				if(value<=array[j]) {
					System.out.println("Target achieved after "+(j+1)+" transactions !");
					transactionSuccessful=true;
					break;				
				}
				value=value-array[j];
			}
			if (transactionSuccessful==false) {
			System.out.println("Given target is not achieved !");}
					
			}
		
		}
		
		
		
	


