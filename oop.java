
import java.util.Scanner;
public class oop {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		signal obj= new signal();
		System.out.print("Enter the number of times you want to loop: ");
        int iter = sc.nextInt();

        System.out.print("Enter the number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the color: ");
        String color = sc.next();
		sc.close();
		
		obj.loop(iter);
		
		obj.setvalue(num1,color);
		obj.getvalue();
		System.out.println("The name is "+signal.name);
		
		
		
	}
}
 class signal {
	private int num;
	 private String color;
	 static String name="mathi";
	 public  void  setvalue( int num,String color){
		this.num=num;
		this.color=color;
	 }
	public void getvalue(){
		System.out.println("The number is "+num+" The color is "+color);
		
	}
	
	
	
	
	public void loop(){
		for(int i=0;i<10;i++){
			
			System.out.println(i);
			
		}
	}
	
	public void loop(int n){
		for(int i=0;i<n;i++){
			
			System.out.println(i);
			
		}
	}
 
	
 }
 
 class signal2 extends signal{
	public void loop(){
		for(int i=0;i<10;i+=3){
			
			System.out.println(i);
			
		}
	}
 }