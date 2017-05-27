package com.huawei.exam;

import java.util.Scanner;

/**
 * 题目描述
 *   有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？
 *   答案是5瓶，方法如下：
 *   先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
 *   然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
 *   如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 * 	 
 * 输入描述:
 * 	      输入文件最多包含10组测试数据，每个数据占一行，仅包含一个正整数n（1<=n<=100），表示小张手上的空汽水瓶数。
 * 	  n=0表示输入结束，你的程序不应当处理这一行。
 * 
 * 输出描述:
 *	     对于每组测试数据，输出一行，表示最多可以喝的汽水瓶数。如果一瓶也喝不到，输出0。
 * 输入例子:
 *	3
 *	10
 *	81
 *	0
 * 输出例子:
 *	1
 *	5
 *	40
 *	0
 * 
 */
public class SteamWaterBottle {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n ;
		System.out.println("输入例子：");
		while(in.hasNext()){
			n = in.nextInt();
			if(n==0){
				return;
			}else{
				System.out.println("输出例子：");
				System.out.println("方法一："+sum(n)); 
				System.out.println("方法二："+sum2(n));
			}
		}
	}
	
	public static int sum(int n){
		
		int m = 0; //表示用空瓶换到的 饮料瓶数
		if(n<2){
			return 0;
		}else if(n==2){
			return 1;
		}else{
			m = n/3; 
			return m+sum(n-3*m+m); //递归调用 累加用空瓶换取的饮料数
		}
		
	}
	
	public static int sum2(int n){
		
		return n/2;
	}

}
