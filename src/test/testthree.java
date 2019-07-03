package test;

public class testthree {

	public static void main(String[] args) {
		int num=0,num1=1,num2=2;
		int t;
		System.out.println(num);
		System.out.println(num1);
	System.out.println("yes");
		for (int i = 0; i <=5; i++) {
			t=num+num1+num2;
			System.out.println(t);
			num=num1;
			num1=t;
			
			
			
		}
		
		System.out.println("End of program");
	}

	
}
