package javaprogram;

public class Perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3,sum=0,i=1;
		while(i<n) {
			if(n%i==0)
				sum=sum+i;
		i++;
		}
		if(n==sum)
			System.out.print("perfect");
		else
			System.out.print("Not perfect");

	}

}
