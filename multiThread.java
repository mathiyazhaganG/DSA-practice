// public class multiThread {
	
// 	public static void main(String[] args) {
// 		A obj1=new A();
// 		B obj2=new B();
// 			obj1.start();
// 			obj2.start();
// 	}
	
// }
// class A extends Thread{
	
// 	public void run(){
// 		show();
// 	}
// 	public static void show(){
// 		for(int i = 0; i <20;i++){
// 			System.out.println("naan thaan da ");
// 		}
		
// 	}
	
// }
// class B extends Thread{
// 	public void run(){
// 		show();
// 	}
// 	public static void show(){
// 		for(int i = 0; i <20;i++){
// 		System.out.println(" leo das ");
// 	}
// 	}
	
// }
public class multiThread {
	
	public static void main(String[] args) {
		A obj1=new A();
		B obj2=new B();
			Thread t1=new Thread(obj1);
			Thread t2=new Thread(obj2);
			
			t1.start();
			t2.start();
	}
	
}
class A implements Runnable{
	
	public void run(){
		show();
	}
	public static void show(){
		for(int i = 0; i <20;i++){
			System.out.println("naan thaan da ");
		}
		
	}
	
}
class B implements  Runnable{
	public void run(){
		show();
	}
	public static void show(){
		for(int i = 0; i <20;i++){
		System.out.println(" leo das ");
	}
	}
	
}

