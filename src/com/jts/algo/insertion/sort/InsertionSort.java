package com.jts.algo.insertion.sort;

public class InsertionSort {
	static int[] sortArray(int arr[]) {
		int n = arr.length;

		for (int j = 1; j < n; j++) {
			int key = arr[j];

			int i = j - 1;

			while ((i > -1) && (arr[i] > key)) {
				arr[i + 1] = arr[i];
				i--;
			}

			arr[i + 1] = key;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {4, 15, 3, 2, 1};
		
		arr = sortArray(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
