package fibonacci;

import java.util.Scanner;

public class main2 {
	

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter the n");
	        int n = input.nextInt();       
	        printFibonacciSeries(n);	        
	        System.out.print("Enter the position to find the Fibonacci number: ");
	        int position = input.nextInt();	        
	        long result = calculateFibonacci(position);
	        System.out.println("The Fibonacci number at position " + position + " is: " + result);
	       }
	    
	    public static void printFibonacciSeries(int n) {
	        long first = 0, second = 1;	        
	        for (int i = 0; i < n; i++) {
	            System.out.print(first + " ");	            
	            long next = first + second;
	            first = second;
	            second = next;
	        }
	        
	        System.out.println();
	    }
	        public static long calculateFibonacci(int position) {
	        if (position <= 1) {
	            return position;
	        }
	        
	        long first = 0, second = 1, result = 0;	        
	        for (int i = 2; i <= position; i++) {
	            result = first + second;
	            first = second;
	            second = result;
	        }
	         return result;
	    }
	}
