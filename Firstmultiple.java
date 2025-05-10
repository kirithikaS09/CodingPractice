package javaprogram;

public class Firstmultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstmul[]= {3,10,14,22,35};
		for(int var: firstmul) {
			if(var%7==0) {
				System.out.println(var); // firstmultiplication of 7 is printed 
				break; // came out of loop
			}
		}

	}

}
