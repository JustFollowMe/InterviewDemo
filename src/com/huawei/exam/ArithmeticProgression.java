package com.huawei.exam;

import java.util.Scanner;

/**
 *  题目描述
 *  功能:等差数列 2，5，8，11，14。。。。
 *  输入:正整数N >0
 *  输出:求等差数列前N项和
 *  返回:转换成功返回 0 ,非法输入与异常返回-1
 *  
 *  输入描述:
 *  输入一个正整数。
 *  输出描述:
 *  输出一个相加后的整数。
 *  输入例子:
 *  2
 *  输出例子:
 *  7
 */

public class ArithmeticProgression {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入正整数：");
		while(in.hasNext()){
			int N = in.nextInt();
			if(N<0){
				System.out.println("非法输入！");
				return;
			}else{
				int a1 = 2;
				int a2 = 5;
				int d = a2 -a1;
				int Sn = N*a1+(N*(N-1)/2)*d;
				System.out.println("前"+N+"项和为："+Sn);
				System.out.println("累加法："+getSum(N));
			}
			
		}
		
	}
	
	public static int getSum(int N){
		int sum = 0;
		int a = 2;
		for(int i=1; i<=N; i++){
			sum = sum +a;
			a = a + 3;
		}
		return sum;
	}

}
