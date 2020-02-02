package stanfield_p1;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		//Declaring variables
		int num;
		int num1;
		int num2;
		int num3;
		
		Scanner in = new Scanner(System.in);
		//accepting input one at a time
		System.out.print("Enter a number: ");
		num = in.nextInt();
		
		System.out.print("Enter a number: ");
		num1 = in.nextInt();
		
		System.out.print("Enter a number: ");
		num2 = in.nextInt();
		
		System.out.print("Enter a number: ");
		num3 = in.nextInt();
		
		System.out.printf("Before encryption: %d%d%d%d", num,num1,num2,num3);
		
		in.close();

		Encrypter.encrypt(args);	
	}

}
