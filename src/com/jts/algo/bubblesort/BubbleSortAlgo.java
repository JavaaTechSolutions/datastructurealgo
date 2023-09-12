package com.jts.algo.bubblesort;

public class BubbleSortAlgo {

	static void bubbleSort(int arr[]) {
		int length = arr.length;

		for (int i = 0; i < length - 1; i++) {

			boolean isSwapped = false;

			for (int j = 0; j < length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];

					arr[j + 1] = tmp;

					isSwapped = true;
				}
			}

			if (!isSwapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 10, 5, 6, 90, 50, 40, 30 };

		bubbleSort(arr);

		System.out.println("Soretd array");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}
}
