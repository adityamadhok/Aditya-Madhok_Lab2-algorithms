package com.driver;

import java.util.Scanner;

import com.operations.Operations;

public class Main {

	public static void main(String[] args) {

		boolean choice;
		char input = ' ';
		Operations obj = new Operations();
		Scanner sc = new Scanner(System.in);
		do {
			int size;
			choice = false;
			int Amount;
			System.out.println("-----------WELCOME-------------");
			System.out.println("Enter the size of currency denominations");

			size = sc.nextInt();
			int[] arrayOfCurr = new int[size];

			System.out.println("Enter the currency denominations value\n"
					+ "(note the value of a denomination has to be >=1 in every case to be logical here !)");
			for (int i = 0; i < size; i++) {
				arrayOfCurr[i] = sc.nextInt();
			}
			System.out.println("Enter the amount you want to pay: ");
			Amount = sc.nextInt();

			obj.mergeSort(arrayOfCurr);

			obj.calcDenom(arrayOfCurr, Amount);
			System.out.println("would you like another calculation(y/n)?");
			input = sc.next().charAt(0);
			if (input == 'y') {
				choice = true;
			}

		} while (choice);

	}

}
