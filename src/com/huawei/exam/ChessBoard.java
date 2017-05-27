package com.huawei.exam;

import java.util.Scanner;

/**
 * 
 * 题目描述
	请编写一个函数（允许增加子函数），计算n x m的棋盘格子（n为横向的格子数，m为竖向的格子数）沿着各自边缘线从左上角走到右下角，
	总共有多少种走法，要求不能走回头路，即：只能往右和往下走，不能往左和往上走。
	
	输入描述:
	输入两个正整数
	输出描述:
	返回结果
	输入例子:
	2
	2
	输出例子:
	6
 * 
 * 
 *
 */
public class ChessBoard {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入两个正整数：");
		while(in.hasNext()){
			int m = in.nextInt();
			int n = in.nextInt();
			System.out.println(m+"*"+n+"棋盘从左上点到右下点的走法种类数：");
			System.out.println(count(m,n));
		}
	}

	public static int count(int m,int n){
		
		if(m==0||n==0){
			return 1;
		}
		return count(m,n-1)+count(m-1,n);
	}
}
