package com.operations;

import java.util.Scanner;

public class Operations {

	public void calcDenom(int[] array, int targetValue) {

		int len = array.length;
		int[] indexArray = new int[len];
		for (int i = len - 1; i > -1; i--) {

			if (targetValue / array[i] > 0) {
				indexArray[i] = targetValue / array[i];
				targetValue = targetValue - (indexArray[i] * array[i]);

			}

		}

		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int j = len - 1; j > -1; j--) {

			if (indexArray[j] != 0) {
				System.out.println(array[j] + " x " + indexArray[j]);

			}

		}
		/* Please note this logic check only works on an assumption that the customer will always have
		 exact change with them as stated in the problem statement"Assume that the denominations are 
		 in such a way that any amount can be paid. . ." .If presented with a situation which is
		 is otherwise it will start giving absurd results*/
		if (targetValue > 0) {
			System.out.println("you do not have exact change !");

		}
	}

	public void mergeSort(int[] array) {
		int len = array.length;
		if (len <= 1)
			return;

		int mid = len / 2;
		int[] lArray = new int[mid];
		int[] rArray = new int[len - mid];

		int i = 0;
		int j = 0;
		for (; i < len; i++) {
			if (i < mid) {
				lArray[i] = array[i];
			} else {
				rArray[j] = array[i];
				j++;
			}
		}
		mergeSort(lArray);
		mergeSort(rArray);
		merge(lArray, rArray, array);

	}

	public void merge(int[] lArray, int[] rArray, int[] array) {

		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0;
		while (l < leftSize && r < rightSize) {
			if (lArray[l] < rArray[r]) {
				array[i] = lArray[l];
				i++;
				l++;
			} else {
				array[i] = rArray[r];
				i++;
				r++;
			}
		}
		while (l < leftSize) {
			array[i] = lArray[l];
			i++;
			l++;
		}
		while (r < rightSize) {
			array[i] = rArray[r];
			i++;
			r++;
		}

	}

}
