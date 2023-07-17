package Perfectsquare;

import java.util.Scanner;

public class Sqr_num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String n = sqvalue(a); 
		System.out.println(n);
	}
	public static String sqvalue(int a)
	{
		int i;
		for ( i=1;i*i<=a;i++);
		if(i*i==a)
		{
			return "true";
		}
		else
		{
			return "false";
		}
	}

}
