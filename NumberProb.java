public class NumberProb {
	// Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). 
	// Return the total number of such digits.
	public static void main(String[] args) {
		int n = 10120;
		System.out.println(evenlyDivides(n));
		System.out.println(reverseDigits(n));
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
	
}
