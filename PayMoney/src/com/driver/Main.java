package com.driver;
import java.util.Scanner;
import com.services.*;

public class Main {
	
	

	public static void main(String[] args) {
		
		boolean choice;
		int size;
		char input=' ';
		Scanner sc=new Scanner(System.in);
		
		do {
			
		choice=false;
		System.out.println("-----------------------------------");
		System.out.println("Enter the size of transaction array");
		size=sc.nextInt();
		int[] arrayOfValues=new int[size];
		System.out.println("Enter the values of array");
		
		for(int i=0;i<size;i++) {
			arrayOfValues[i]=sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that need to be achieved");
		int sizeOfTargets=sc.nextInt();
		Service company=new Service();
		
		for(int k=1;k<=sizeOfTargets;k++) {
		company.process(arrayOfValues);
		}
		
		System.out.println("would you like to continue(y/n)?");
		input=sc.next().charAt(0);
		
		if(input=='y') {
			choice=true;			
		}
		
		}while(choice);
		
	
	}

}
