package com.huawei.exam;

import java.util.Scanner;

/**
 * 题目描述
 * 自守数是指一个数的平方的尾数等于该数自身的自然数。例如：25^2 = 625，76^2 = 5776，9376^2 = 87909376。
 * 请求出n以内的自守数的个数
 * 
 * 输入描述:
 * int型整数
 * 
 * 输出描述:
 * n以内自守数的数量。
 * 
 * 输入例子:
 * 2000
 *
 * 输出例子:
 * 8
 */

public class AutomorphicNumber {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入int型整数：");
		while(in.hasNext()){
			int N = in.nextInt();
			System.out.println(N+"以内的自守数的个数为：");
			System.out.println(getAutomorphicNumber(N));
		}
		
	}
	
	public static int getAutomorphicNumber(int N){
		
		int count = 0;
		for(int i=0;i<=N;i++){
			String s1 = String.valueOf(i);
			String s2 = String.valueOf(i*i);
			String last = s2.substring(s2.length()-s1.length());
			if(s1.equals(last)){
				System.out.println(i+"*"+i+"="+s2+"--->"+i);
				count++;
			}
		}
		
		return count;
	}
}
