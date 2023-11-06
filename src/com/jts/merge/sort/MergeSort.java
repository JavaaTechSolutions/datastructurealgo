package com.jts.merge.sort;

public class MergeSort {
	void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int l1[] = new int[n1];
		int r1[] = new int[n2];

		for (int i = 0; i < n1; ++i) {
			l1[i] = arr[l + i];
		}

		for (int j = 0; j < n2; ++j) {
			r1[j] = arr[m + 1 + j];
		}

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (l1[i] <= r1[j]) {
				arr[k] = l1[i];
				i++;
			} else {
				arr[k] = r1[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = l1[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = r1[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int l, int r) {
		if (l < r) {

			int m = l + (r - l) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);

			merge(arr, l, m, r);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 9, 87, 54 };

		MergeSort ms = new MergeSort();
		ms.sort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
