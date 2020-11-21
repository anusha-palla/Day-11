package com.src;
import java.util.Scanner;
public class FirstMain {
 Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstMain f=new FirstMain();
		f.updateNvalue();

	}
	public void print(int n)
	{
		for(int i=0;i<=n;i++)
		{
			System.out.println(i);
		}
	}
	public void updateNvalue()
	{
		System.out.println("Enter n value");
		int n=sc.nextInt();
		print(n);
	}

}
