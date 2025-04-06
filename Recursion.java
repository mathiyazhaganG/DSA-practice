public class Recursion {
	public static void main(String[] args) {
		print(10,1);
		System.out.println(sum(5));
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
}


