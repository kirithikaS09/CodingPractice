package javaprogram;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2016;
			/*if((year%4==0 && year%100 != 0) || year%400==0)
				System.out.println("leap");
			else
				System.out.print("Not leap");*/
		if(year%100==0) {
			if(year%400==0)
				System.out.print("leap");
			else
				System.out.print("not leap");
		}
		else if(year%4==0) 
			System.out.print("leap");
		else
			System.out.print("Not Leap");
	}

}
