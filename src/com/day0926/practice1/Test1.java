package com.day0926.practice1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123;
		int b =120;
		System.out.println(sum(a, b));
	}
	public static int sum(int num1, int num2){
		return reverse(num1)+reverse(num2);
	}
	public static int reverse(int num){
		int n=0,temp;
		while(num>0){
			temp=num%10;
			num/=10;
			n=n*10+temp;
		}
		return n;
	}
}
