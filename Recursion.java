import java.util.ArrayList;

public class Recursion {
    private static long[] fibocache ; 
	public static void main(String[] args) {
        int n = 70; // Example value for n
		print(10,1);
		System.out.println(sum(5));
        System.out.println(factorial(5));
        System.out.println(factorialNumbers(120));
        int arr[]={1,2,3,4,5};
        revarr(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(fibonacci(5));
        System.out.println(fiboformula(50));
        System.out.println(pali(0, 4, "madam"));
        fibocache = new long[n+1];
        System.out.println(fiboser(n));
	}
	static void print(int n,int i){
        if(i>n)return;
         System.out.print(i+" ");
         print(n,i+1);
    }
	
        
    // sum of cubes of first n natural numbers
    static int sum(int n){
        if(n==0) return 0;
        return (n*n*n)+sum(n-1);
    }
    // factorial of n
     static int factorial(int n){
        if(n==0) return 1;
        return n*factorial(n-1);
     }
    //  A number n is called a factorial number if it is the factorial of a positive integer. For example, the first few factorial numbers are 1, 2, 6, 24, 120,
// Given a number n, the task is to return the list/vector of the factorial numbers smaller than or equal to n.
   static ArrayList<Long> fact = new ArrayList<>();
    static ArrayList<Long> factorialNumbers(long n) {
        fact.clear(); 
        factorial(1, 1, n);
        return fact;
    }

    static void factorial(long i, long currentFact, long n) {
        if (currentFact > n) return;
        fact.add(currentFact);
        factorial(i + 1, currentFact * (i + 1), n);
    }
    // reverse an array using recursion
    static void revarr(int arr[],int start,int end){ 
        if(start>=end) return;
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        revarr(arr,start+1,end-1);
    }
    static int fibonacci(int N){
        
        // Base Condition.
        if(N <= 1){
            
            return N;
        }
        
        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fibonacci(N-1);
        int slast = fibonacci(N-2);
        
        return last + slast;
        
//    fibonacci formula:
    // F(n) = (phi^n - psi^n) / sqrt(5)
    // where phi = (1 + sqrt(5)) / 2 and psi = (1 - sqrt(5)) / 2
    // This formula is derived from the closed-form expression for Fibonacci numbers.
}
    static long  fiboformula(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;
        double fibo = (Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5);
        return (long) Math.round(fibo);
    }
    // fibonacci using memoization
  
    
    static long fiboser(int n){
        if(n<=1)return n;
        if(fibocache[n]!=0)return fibocache[n];
       fibocache[n]=fiboser(n-1)+fiboser(n-2);
         return fibocache[n];
    }
//  check for valid palindrome using recursion
        static boolean pali(int start,int end,String s){
            if(start>=end) return true;
            if (s.charAt(start)!=s.charAt(end)) return false;
            return pali(start+1,end-1,s);
        }
    }





