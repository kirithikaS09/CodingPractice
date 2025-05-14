package package2;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter salary:");
		int salary=s.nextInt();
		System.out.print("Enter age:");
		int age=s.nextInt();
		if(salary>=20000 || age<25) {
			System.out.print("Enter loan:");
			int loan=s.nextInt();
			if(loan<=50000)
				System.out.println("Eligible for loan");
			else
				System.out.println("maximum loan amount is 50000");	
		}
		else
			System.out.println("You are not eligible for loan ");
		s.close();

	}

}
