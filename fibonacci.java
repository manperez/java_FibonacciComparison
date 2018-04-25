package manuel.javatest;

public class Fibonacci {
	
	/**
	 * Iterative implementation for nth fibonacci number
	 * Time complexity - O(n)
	 * Space complexity - O(1)
	 */
	public int fibonacciIterative(int n) {
		if(n <= 1) {
			return n;
		}
		int fib = 1;
		int prevFib = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= prevFib;
			prevFib = temp;
		}
		return fib;
	}
	
	/**
	 * Recursive implementation for nth fibonacci number
	 * Time complexity - O(2^n)
	 * Space complexity - O(2^n)
	 */
	public int fibonacciRecursive(int n) {
		if(n <= 1) {
			return n;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}
	
	public static void main(String args[]) {
		Fibonacci fib = new Fibonacci();
		
		System.out.println("Iterative version:");
		System.out.println(fib.fibonacciIterative(10));
		System.out.println(fib.fibonacciIterative(100));
		
		System.out.println("Recursive version:");
		System.out.println(fib.fibonacciRecursive(10));
		System.out.println(fib.fibonacciRecursive(100));
	}
}