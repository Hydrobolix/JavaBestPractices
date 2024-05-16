package com.myapp.bestpractices;

/*****************************************************
 * Java best practices and exercises
 * https://www.geeksforgeeks.org/java-exercises
 * 
 * @author Tyrone Dixon
 *****************************************************/

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BestPracticesExercises {

	public static void main(String[] args) {
		System.out.println(addComplexNumbers("2+5i","3+2i"));


	}
	
	/**************************************************
	 * 1. Hello World Program
	 **************************************************
	 * Write Hello World Program in Java
	 * 
	 * @return (void)_: prints the String [Hello World!]
	 **************************************************/
	private static void helloWorld() {
		System.out.println("Hello World!");
	}
	
	/**************************************************
	 * 2. Add Two Numbers
	 **************************************************
	 * Write a Program in Java to Add two Numbers
	 * 
	 * @param (int)firstNumber: the first number to be
	 * 		  added
	 *         
	 * @param (int)secondNumber: the second number to 
	 * 		   be added
	 * 
	 * @return (int)_: the sum of the two numbers, 0 by
	 * 		   default
	 **************************************************/
	private static int addTwoNumbers() {
		int sum = 0;
		
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the first number:");
			sum += scan.nextInt();
			
			System.out.println("Enter the first number:");
			sum += scan.nextInt();
			
			scan.close();
		} catch(Exception e) {
			System.err.println(e);
		}
		
		return sum;
		
	}
	
	/**************************************************
	 * 3. Swap Two Numbers
	 **************************************************
	 * Write a Program to swamp two numbers
	 * 
	 * @param (int)firstInput: the first number to be
	 * 		  swapped
	 *         
	 * @param (int)secondInput: the second number to 
	 * 		   be swapped
	 * 
	 * @return (void)_: the two numbers swapped
	 **************************************************/
	private static void swapTwoNumbers(int firstInput, int secondInput) {
		int temp = firstInput;
		firstInput = secondInput;
		secondInput = temp;
	}
	
	/**************************************************
	 * 4. Integer and Binary Number Conversion
	 **************************************************
	 * Write a Program to convert Integer numbers and
	 * Binary numbers.
	 * 
	 **************************************************
	 * Integer number to Binary number
	 *
	 * @param (int)input: the Integer number to be 
	 * 		   converted to a Binary number
	 * 
	 * @return (void)_: the converted Binary number
	 **************************************************/
	static void decToBinary(int input) {
		int[] binaryNum = new int[1000];
		
		int i = 0;
		
		while (input > 0) {
			binaryNum[i] = input % 2;
			input /= 2;
			i++;
		}
		
		for (int j = i - 1; i >= 0; j--)
			System.out.print(binaryNum[j]);
	}
	
	/**************************************************
	 * 5. Factorial
	 **************************************************
	 * Write a Program to find factorial of a number in 
	 * Java
	 * 
	 * @param (int)input: the number entered for the 
	 * 		   factorial process
	 * 
	 * @return (int)_: the factorial of the given 
	 *  	   number
	 **************************************************/
	private static int factorial(int input) {
		int result = 1, i;
		for (i = 2; i <= input; i++)
			result *= i;
		
		return result;
	}
	
	/**************************************************
	 * 6. Add Complex Numbers
	 **************************************************
	 * Write a Program to add two complex numbers.
	 * 
	 * @param (String)firstComplexNumber: the first 
	 * 		  complex number to be added
	 *         
	 * @param (String)secondComplexNumber: the second 
	 * 		  complex number to be added
	 * 
	 * @return (void)_: the two complex numbers added
	 **************************************************/
	public static String addComplexNumbers(String firstComplexNumber, String secondComplexNumber) {
		int real = 0, iCoefficient = 0;
		
		if (firstComplexNumber.length() == 0 || secondComplexNumber.length() == 0)
			return "0+0i";
		
		if (firstComplexNumber.length() < 4 || secondComplexNumber.length() < 4)
			return "0+0i";
		
		iCoefficient = Integer.parseInt(firstComplexNumber.substring(2, 3)) + Integer.parseInt(secondComplexNumber.substring(2, 3));
		real = Integer.parseInt(firstComplexNumber.substring(0, 1)) + Integer.parseInt(secondComplexNumber.substring(0, 1));

		return "" + real + "+" + iCoefficient + "i";
	}
	
	/**************************************************
	 * 7. Calculate Simple Interest
	 **************************************************
	 * Write a Program to calculate simple interest in 
	 * Java [i=Prt]
	 * 
	 * @param (double)principal: the Principal Amount
	 *         
	 * @param (double)rate: the rate of interest per 
	 * 		  year in decimal
	 * 
	 * @param (double)time: the amount 
	 * 
	 * @return (double)_: the total interest amount
	 **************************************************/
	private static double interestCalc(double principal, double rate, double time) {
		return principal * rate * time;
	}
	
	/**************************************************
	 * 8. Pascal's Triangle
	 **************************************************
	 * Write a Program to print Pascal's Triangle in 
	 * Java
	 * 
	 * @param (int)numRows: the chosen number of lines
	 * 		  to be printed
	 * 
	 * @return (void)_: the printed Pascal's Triangle
	 **************************************************/
	private static void printPascal(int numRows) {
		if (numRows == 0) {
			System.out.println("Exiting program.");
		}
		for (int row = 1; row <= numRows; row++) {
			for (int cellCol = 0; cellCol <= numRows - row; cellCol++) {
				System.out.print(" ");
			}
			
			int cellValue = 1;
			
			for (int cell = 1; cell <= row; cell++) {
				System.out.print(cellValue + " ");
				
				cellValue = cellValue * (row - cell) / cell;
			}
			
			System.out.println();
		}
	}
	
	/**************************************************
	 * 9. Fibonacci Series Number
	 **************************************************
	 * Write a Program to find sum up to Fibonacci 
	 * Series Number
	 * 
	 * @param (int)seriesNumber: the chosen series 
	 * 		  number to be printed
	 * 
	 * @return (int)sum: the sum of the series
	 **************************************************/
	private static int fibonacciSeriesSum(int seriesNumber) {
		int sum = 2;
		
		int fib = 1;
		int prevFib = 1;
		int tempFib = 0;
		
		if (seriesNumber <= 0)
			return 0;
		if (seriesNumber < 2)
			return 1;
		if (seriesNumber == 2)
			return 2;
		
		for (int i = 2; i < seriesNumber - 1; i++) {
			tempFib = fib;
			fib += prevFib;
			prevFib = tempFib;
			
			sum += fib;
		}
		
		return sum;
	}
	
	/***
	 * Pattern Programs
	 */
	
	/**************************************************
	 * 10. Pyramid Number Pattern
	 **************************************************
	 * Write a Program to print Pyramid Number Pattern
	 * in Java
	 * 
	 * @param (int)input: the number of lines for the 
	 * pattern
	 * 
	 * @return (void)_: the printed Pyramid Number 
	 * 		   Pattern
	 **************************************************/
	private static void printPyramidPattern(int input) {
		for (int row = 1; row <= input; row++) {
			for (int colCell = 1; colCell <= input - row; colCell++) {
				System.out.print(" ");
			}
			for (int colCellStars = 1; colCellStars <= (row - 1) * 2 + 1; colCellStars++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	/**************************************************
	 * 11. Print Pattern
	 **************************************************
	 * Write a Program to print the displayed pattern
	 * 
	 * @param (int)input: The size of the pattern
	 * 
	 * @return (void)_: the printed pattern
	 **************************************************/
	private static void printPattern(int input) {
		if (input == 0)
			System.out.println("*");
		
		for (int row = 1; row <= input * 2; row++) {
			if (row == 1 || row == input * 2)
				for (int col = 1; col <= input * 2; col++)
					System.out.print("*");
			else {
				for (int col = 1; col <= input * 2; col++) {
					if (col == 1 || col == input * 2)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
	
	/**************************************************
	 * 12. Print Pattern
	 **************************************************
	 * Write a Program to print the displayed pattern
	 * 
	 * @param (int)input: the number of rows
	 * 
	 * @return (void)_: the printed pattern
	 **************************************************/
	private static void printPattern2(int input) {
		if (input == 0)
			System.out.println("0");
		
		for (int row = 1; row <= input; row++) {
			for (int col = 1; col <= 2 * (input - row); col++)
				System.out.print(" ");
			
			for (int col = row; col >= 1; col--)
				System.out.print(col + " ");
			
			for (int col = 2; col <= row; col++)
				System.out.print(col + " ");
			
			System.out.println();
		}
	}
	
	/**************************************************
	 * 13. Print Pattern 
	 **************************************************
	 * Write a Program to print the displayed pattern
	 * 
	 * @param (int)_: default
	 * 
	 * @return (void)_: the printed pattern
	 **************************************************/
	private static void printPattern3(int input) {
		if (input == 0)
			System.out.println("0");
		
		int row = 0, col = 0;
		for (row = 1; row <= input; row++) {
			for (col = 1; col <= input - row; col++)
				System.out.print(" ");
			for (col = 1; col <= 2 * row - 1; col++)
				System.out.print("*");
			
			System.out.println();
		}
		
		for (row = input - 1; row >= 1; row--) {
			for (col = 1; col <= input - row; col++)
				System.out.print(" ");
			for (col = 1; col <= 2 * row - 1; col++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	
	/***
	 * Array Programs
	 */
	
	/**************************************************
	 * 14. Compute Sum of Array Elements
	 **************************************************
	 * Write a Java Program to compute the sum of array
	 * elements
	 * 
	 * @param (int[])arr: the provided array 
	 * 
	 * @return (int)sum: the sum of the array
	 **************************************************/
	private static int sumArray(int[] arr) {
		int sum = 0;
		
		if (arr.length == 0 || arr == null)
			return sum;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	/**************************************************
	 * 15. Largest Element in Array
	 **************************************************
	 * Write a Java Program to find the largest element
	 * in array
	 * 
	 * @param (int[])arr: the provided array
	 * 
	 * @return (int)largestValue: the largest element
	 * 		    in the array
	 **************************************************/
	private static int largestInArray(int[] arr) {
		int largestValue = Integer.MIN_VALUE;
		
		if (arr.length == 0 || arr == null)
			return 0;
		
		for (int i = 0; i < arr.length; i++)
			largestValue = (arr[i] > largestValue)? arr[i] : largestValue;
	
		return largestValue;
	}
	
	/**************************************************
	 * 16. Transpose of Matrx
	 **************************************************
	 * Write Java program to find the transpose of 
	 * Matrix
	 * 
	 * @param (int[][]) 2d_array: the matrix to 
	 * 		   transpose 
	 * 
	 * @return (int[][]) 2d_array: the transposed 
	 * 		   matrix
	 **************************************************/
	private static int[][] transposeMatrix(int[][] matrix) {
		int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
		
		int row, col;
		for (row = 0; row < transposedMatrix.length; row++)
			for (col = 0; col < transposedMatrix[0].length; col++)
				transposedMatrix[row][col] = matrix[col][row];
		return transposedMatrix;
	}
	
	/**************************************************
	 * 17. Array Rotation
	 **************************************************
	 * Write a Program to rotate first number of 
	 * elements to the end of the array
	 * 
	 * @param (int[])arr: array provided for rotation
	 * 
	 * @param (int)elements: the number of elements to be
	 * 		  rotated to the end of the array
	 * 
	 * @return (int[]) rotatedArray: the rotated array
	 **************************************************/
	private static int[] rotateArray(int[] arr, int elements) {
		int[] rotatedArray = new int[arr.length];
		
		int elementsLeft = elements;
		
		for (int i = 0; i < arr.length; i++) {
			if (i < elements) {
				rotatedArray[arr.length - elementsLeft] = arr[i];
				elementsLeft--;
			}
			else
				rotatedArray[i - elements] = arr[i];
		}
		
		return rotatedArray;
	}
	
	/**************************************************
	 * 18. Remove Duplicate Elements
	 **************************************************
	 * Java Array program to remove duplicate elements
	 * from an array
	 * 
	 * @param (int[])arr: the provided array with 
	 * 		  duplicates
	 * 
	 * @return (int[])duplicatesRemovedArray: the array with duplicates 
	 * 		    removed
	 **************************************************/
	private static int[] removeArrayDuplicates(int[] arr) {
		int[] tempArray = new int[arr.length];
		int searcher = 0;
		
		if (arr.length == 0 || arr.length == 1) {
			return new int[0];
		}		
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1])
				tempArray[searcher++] = arr[i];
		}
		
		tempArray[searcher++] = arr[arr.length - 1];
		
		for (int i = 0; i < searcher; i++)
			arr[i] = tempArray[i];

		return tempArray;
	}
	
	/**************************************************
	 * 19. Remove All Occurrences of an Element
	 **************************************************
	 * Java Array program to remove all occurrences of
	 * and element in an array
	 * 
	 * @param (int[])_: default
	 * 
	 * @return (int[])_: default
	 **************************************************/
	private static int[] removeAllOccurrencesFromArray(int[] arr, int key) {
		int index = 0;
		
		for (int i = 0; i < arr.length; i++)
			if (arr[i] != key)
				arr[index++] = arr[i];
		
		return Arrays.copyOf(arr, index);
	}
	
	/***
	 * String Programs
	 */
	
	/**************************************************
	 * 20. Palindrome Check
	 **************************************************
	 * Returns whether a given word is a Palindrome or not
	 * 
	 * @param (String)input: the word entered by the user
	 * 
	 * @return (boolean)isPalindrome: determines whether a word 
	 *         is a palindrome or not
	 **************************************************/
	private static boolean checkPalindrome(String input) {
		boolean isPalindrome = false;
		
		if (input.length() == 0) {
			return isPalindrome;
		}
		
		if (input.length() == 1) {
			isPalindrome = true;
			return isPalindrome;
		}
		
		for (int i = 0; i < input.length()/2; i++) {
			if (input.charAt(i) == input.charAt(input.length() - i - 1))
				isPalindrome = true;
			else {
				return false;
			}
		}
		
		return isPalindrome;
	}	
		
	/**************************************************
	 * 21. Check Anagram
	 **************************************************
	 * Write a Program to check for an anagram between
	 * two Strings
	 * 
	 * @param (char[])_: first word provided for the 
	 * 		   anagram
	 * 
	 * @param (char[])_: second word provided for the
	 * 		   anagram
	 * 
	 * @return (boolean)_: returns whether the two 
	 * 		    words are anagrams
	 **************************************************/
	private static boolean areAnagram(char[] firstWord, char[] secondWord) {		
		if (firstWord.length != secondWord.length)
			return false;
		
		Arrays.sort(firstWord);
		Arrays.sort(secondWord);
		
		for (int i = 0; i < firstWord.length; i++)
			if (firstWord[i] != secondWord[i])
				return false;
				
		return true;
	}
	
	/**************************************************
	 * 22. Reverse a String
	 **************************************************
	 * Write a Program to reverse a String
	 * 
	 * @param (String)_: the provided String to be 
	 * reversed
	 * 
	 * @return (String)_: default
	 **************************************************/
	private static String reverseString(String str) {
		String reversed = "";
		
		char cur;
		
		for (int i = 0; i < str.length(); i++) {
			cur = str.charAt(i);
			reversed = cur + str;
		}
		
		return reversed;
	}
	
	/**************************************************
	 * 23. Remove Leading Zeros
	 **************************************************
	 * Write a Program to remove leading zeros from a 
	 * String
	 * 
	 * @param (String)str: provided String with leading
	 * zeros
	 * 
	 * @return (String)_: the new String with no 
	 * 		    leading zeros
	 **************************************************/
	private static String removeZero(String str) {
		int i = 0;
		
		while (i < str.length() && str.charAt(i) == '0')
			i++;
		
		StringBuffer sb = new StringBuffer(str);
		
		sb.replace(0, i, "");
		
		return sb.toString();
	}
	
	/***
	 * Searching Algorithm Programs
	 */
	
	/**************************************************
	 * 24. Linear Search
	 **************************************************
	 * Write a Program for Linear Search
	 * 
	 * @param (int[])arr: the array to be searched
	 * 
	 * @param (int)x: the target to be searched
	 * 
	 * @return (int)_: the indice of the searched
	 * 		   target
	 **************************************************/
	private static int linearSearch(int arr[], int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				return i;
		}
		
		return -1;
	}
	
	/**************************************************
	 * 25. Binary Search
	 **************************************************
	 * Write a Program for Binary Search
	 * 
	 * @param (int[])arr: the provided arry to be 
	 * 		   sorted
	 * 
	 * @param (int)l: the beginning index
	 * 
	 * @param (int)r: the ending index
	 * 
	 * @param (int)key: the target to be searched
	 * 
	 * @return (int)_: the element if it is present at
	 * 		    the middle of the array
	 **************************************************/
	private static int binarySearch(int arr[], int l, int r, int x) {
		while (l <= r) {
			int mid = (l + r) / 2;
			
			if (arr[mid] == x)
				return mid;
			else if (arr[mid] > x)
				r = mid - 1;
			else
				l = mid + 1;
		}
		
		return -1;
	}
	
	/**************************************************
	 * 26. Bubble Sort
	 **************************************************
	 * Write a Program for Bubble Sort
	 * 
	 * @param (int)arr: the provided array to be 
	 * 		  sorted
	 * 
	 * @return (void)_: the sorted array
	 **************************************************/
	private static void BubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int searcher = 0; searcher < arr.length - i - 1; searcher++)
				if (arr[searcher] > arr[searcher + 1]) {
					int temp = arr[searcher];
					arr[searcher] = arr[searcher] + 1;
					arr[searcher + 1] = temp;
				}
	}
	
	/**************************************************
	 * 27. Insertion Sort
	 **************************************************
	 * Write a Program for Insertion Sort
	 * 
	 * @param (int)arr: the provided array to be 
	 * 		  sorted
	 * 
	 * @return (void)_: the sorted array
	 **************************************************/
	private static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int searcher = i - 1;
			
			while (searcher >= 0 && arr[searcher] > key) {
				arr[searcher + 1] = arr[searcher];
				searcher = searcher - 1;
			}
			
			arr[searcher + 1] = key;
		}
	}
	
	/**************************************************
	 * 28. Selection Sort
	 **************************************************
	 * Write a Program for Selection Sort
	 * 
	 * @param (int[])arr: array provided to be sorted
	 * 
	 * @return (void)_: the sorted array
	 **************************************************/
	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min_idx = i;
			
			for (int searcher = i + 1; searcher < arr.length; searcher++)
				if (arr[searcher] < arr[min_idx])
					min_idx = searcher;
			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
	
	/**************************************************
	 * 29. Merge Sort
	 **************************************************
	 * Write a Program for Merge Sort
	 * 
	 * @param (int[])arr: the array to be sorted
	 * 
	 * @param (int)l: first array beginning index
	 * 
	 * @param (int)m: middle index for both arrays
	 * 
	 * @param (int)r: second array ending index
	 * 
	 * @return (void)_: the sorted array
	 **************************************************/
	private static void mergeSort(int[ ]arr, int l, int m, int r) {
		// requires sorting
		int L[] = new int[m - l + 1];
		int R[] = new int[r - m];
		
		for (int i = 0; i < m - l + 1; i++)
			L[i] = arr[l + i];
		for (int j = 0; j < r - m; j++)
			R[j] = arr[m + 1 + j];
		
		int i = 0, j = 0, k = l;
		
		while (i < m - l + 1 && j < r - m) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			
			k++;
		}
		
		while (i < m - l + 1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while (j < r - m) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	/**************************************************
	 * 30. QuickSort
	 **************************************************
	 * Write a Program for QuickSort
	 * 
	 * @param (int[])arr: array provided to be sorted
	 * 
	 * @param (int)low: the starting index
	 * 
	 * @param (int)high: the ending index
	 * 
	 * @return (void)_: the sorted array
	 **************************************************/
	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			/* 
			 * Takes a [last] element as a pivot, places the pivot,
			 * element at its correct position in [sorted] array, 
			 * and places all smaller (smaller than pivot) to left
			 * of pivot and all greater elements to right of pivot
			 */
			//int pi = partition(arr, low, high);
			
			//quickSort(arr, low, pi - 1);
			//quickSort(arr, pi + 1, high);
		}
	}
}
