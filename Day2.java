import java.util.Scanner;

public class Day2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the roll number: ");
		 long rollno=sc.nextLong();
		System.out.println("Enter the name: ");
		String name=sc.next();
		sc.close();
		
		Student obj=new Student(rollno,name);
		Student s[]=new Student[3];
		s[0]=new Student(1,"mathi");
		s[1]=new Student(2,"mathi1");
		s[2]=new Student(3,"mathi2");
		for(Student st:s){
			System.out.println(st);
		}
		System.out.println(obj);
	}
		
	// 	int num[]={1,2,3,4};
		
	// 	for(int n:num){
	// 		System.out.println(n*2);
			
	// 	}
	// }
	 static class Student{
		private long  rollno;
		 private String name;
		 
		 public Student(long  rollno,String name){
			this.rollno=rollno;
			this.name=name;
		 }
		 @Override
		 public String toString(){
			return "The rollno is "+rollno+" The name is "+name;
		 }
		
	}}
	
