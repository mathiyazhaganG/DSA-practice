
import java.util.Scanner;


 public class day21{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		int size = sc.nextInt();
		int n[] = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			n[i] = sc.nextInt();
			
		}
		sc.close();
		
		
		
		int oddcount=0;
		int evencount=0;
		
		
		for(int i=0;i<n.length;i++){
			
		if(n[i]%2==0)
		{
			evencount++;
		}
		else
		{
			oddcount++;
		}
			
		
	
	}
		
	System.out.println("Odd count: " + oddcount + ", Even count: " + evencount);
		
		
	}
 }