package com.huawei.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 	题目描述
 * 	首先输入要输入的整数个数n，然后输入n个整数。输出为n个整数中负数的个数，和所有正整数的平均值，结果保留一位小数。

	输入描述:
	首先输入一个正整数n，
	然后输入n个整数。
	
	输出描述:
	输出负数的个数，和所有正整数的平均值。
	
	输入例子:
	5
	1
	2
	3
	4
	5
	
	输出例子:
	0 3
 * 
 * 
 * 
 *
 */
public class CountNegativeNumberAveragePositiveNumber {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入整数的个数");
		while(in.hasNext()){
			
			int N = in.nextInt();
			List list = new ArrayList();
			for(int i=0;i<N;i++){
				list.add(in.nextInt());
			}
			System.out.println("负数的个数：");
			System.out.println(getNegativeNumberCount(list));
			System.out.println("所有整数的平均值：");
			System.out.println(getPositiveNumberAverage(list));
			
		}
	}
	
	public static int getNegativeNumberCount(List list){
		
		int count = 0;
		for(int i=0;i<list.size();i++){
			if(Integer.valueOf(list.get(i).toString())<0){
				count++;
			}
		}
		return count;
	}
	
	public static String getPositiveNumberAverage(List list){
		
		double avg = 0;
		int count = 0 ;
		for(int i=0;i<list.size();i++){
			int x = Integer.valueOf(list.get(i).toString());
			if(x>0){
				count ++;
				avg +=x;
			}
		}
		return String.format("%.1f",avg/count);
	}
}
