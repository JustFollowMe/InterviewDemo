package com.huawei.exam;

import java.util.Scanner;

/**
 * 题目描述
 * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 * 
 * 输入描述:
 * 输入两个正整数A和B。
 * 
 * 输出描述:
 * 输出A和B的最小公倍数。
 * 
 * 输入例子:
 * 5
 * 7
 * 
 * 输出例子:
 * 35
 * 
 * 分析： 最小公倍数  = 两数之积/两数最大公约数
 *       最大公约数 使用辗转相除法
 *        
 */
public class LeastCommonMultiple {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("输入例子：");
		while(in.hasNext()){
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println("输出例子：");
			System.out.println("最小公倍数："+getLeastCommonMultiple(a,b));
			System.out.println("最大公约数："+getGreatestCommonDivisor(a,b));
		}
		
	}
	
	public static int getLeastCommonMultiple(int x ,int y){
		
		int lcm = 0;
		
		lcm = (x * y)/getGreatestCommonDivisor(x, y);
		
		return lcm;
	}
	
	public static int getGreatestCommonDivisor(int x,int y){
		int temp;
		if(x>y){
			while( x % y != 0 ){
				temp = x%y;
				x = y;
				y = temp;
			}
			return y;
		}else{
			while( y % x != 0 ){
				temp = y%x;
				y = x;
				x = temp;
			}
			return x;
		}
	}

}
