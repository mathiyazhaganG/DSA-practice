public class NumberProb {
	// Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). 
	// Return the total number of such digits.
	public static void main(String[] args) {
		int n = 10120;
		System.out.println(evenlyDivides(n));
		System.out.println(reverseDigits(n));
        System.out.println(isPalindrome(n));
        System.out.println(lcmAndGcd(12, 15)[0]+" "+lcmAndGcd(12, 15)[1]);
	}
	static int evenlyDivides(int n) {
        int count=0;
        int ognum=n;
        while(n>0){
            int digit = n%10;
            if(digit!=0 && ognum%digit==0){
                count++;
              
            }
              n=n/10;
        }
        return count;
        
        // code here
    }
	// You are given an integer n. 
	// Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.
	// note:by assingning the value to a int the leading zeroes are removed automatically.because int does not allow leading zeroes.
	// if you want to keep the leading zeroes then you can use string.
	static  int reverseDigits(int n) {
        int revnum=0;

        while(n>0){
            int digit=n%10;
            revnum=revnum*10+digit;
            n=n/10;
        }
        return revnum;
        // Code here
    }
    // You are given an integer n. Your task is to determine whether it is a palindrome.
    static boolean isPalindrome(int n) {
        // Code here
        int ognum=n;
        int revnum=0;
        while(n>0){
            int digit=n%10;
           revnum= revnum*10+digit;
           n=n/10;
            
        }
        
            return ognum==revnum;
    }
    // Given two integers a and b, find their LCM and GCD.
    
    static int[] lcmAndGcd(int a, int b) {
        // code here
        int gcd=computeGcd(a,b);
        int lcm= Math.abs((a*b)/gcd);
        return new int[]{lcm,gcd};
    }
        
       static int computeGcd(int a,int b){
        while(b>0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return Math.abs(a);
       }
    
}
	

