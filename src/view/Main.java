package view;

import br.edu.fateczl.sort.Sort;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[1500];
		fillArray(array);
		
		long startTime = 0;
		long endTime = 0;
		
		startTime = System.nanoTime();
		Sort.bubbleSort(array);
		endTime = System.nanoTime();
		System.out.println("Bubble Sort Time: " + ((double)(endTime - startTime)/1000000) + " ms");
		fillArray(array);
		
		startTime = System.nanoTime();
		Sort.mergeSort(array);
		endTime = System.nanoTime();
		System.out.println("Merge Sort Time: " + ((double)(endTime - startTime)/1000000) + " ms");
		fillArray(array);
		
		startTime = System.nanoTime();
		Sort.quickSort(array);
		endTime = System.nanoTime();
		System.out.println("Quick Sort Time: " + ((double)(endTime - startTime)/1000000) + " ms");

	}
	
	public static void fillArray(int[] array) {
		int size = array.length;
		int value = size - 1;
		for(int i = 0; i < size; i++) {
			array[i] = value;
			value--;
		}
	}

}
