package com.zipzipmart;

public class ZipZipMartMain {

	 public static void mergeSort(Sale[] sales, int left, int right) {
	        if (left < right) {
	            int mid = (left + right) / 2;

	            mergeSort(sales, left, mid);
	            mergeSort(sales, mid + 1, right);

	            merge(sales, left, mid, right);
	        }
	    }

	    public static void merge(Sale[] sales, int left, int mid, int right) {
	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	        Sale[] L = new Sale[n1];
	        Sale[] R = new Sale[n2];

	        for (int i = 0; i < n1; i++)
	            L[i] = sales[left + i];

	        for (int j = 0; j < n2; j++)
	            R[j] = sales[mid + 1 + j];

	        int i = 0, j = 0, k = left;

	        while (i < n1 && j < n2) {
	            if (L[i].amount <= R[j].amount) {
	                sales[k++] = L[i++];
	            } else {
	                sales[k++] = R[j++];
	            }
	        }

	        while (i < n1)
	            sales[k++] = L[i++];

	        while (j < n2)
	            sales[k++] = R[j++];
	    }

	    public static void display(Sale[] sales) {
	        for (Sale s : sales) {
	            System.out.print(s.amount + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {

	        Sale[] sales = {
	            new Sale(450),
	            new Sale(1200),
	            new Sale(300),
	            new Sale(900),
	            new Sale(600)
	        };

	        System.out.println("Before Sorting:");
	        display(sales);

	        mergeSort(sales, 0, sales.length - 1);

	        System.out.println("After Sorting:");
	        display(sales);
	    }
}
