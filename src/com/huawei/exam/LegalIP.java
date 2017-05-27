package com.huawei.exam;

import java.util.Scanner;


/**
 * 
 * 题目描述
	现在IPV4下用一个32位无符号整数来表示，一般用点分方式来显示，点将IP地址分成4个部分，每个部分为8位，表示成一个无符号整数（因此不需要用正号出现），
	如10.137.17.1，是我们非常熟悉的IP地址，一个IP地址串中没有空格出现（因为要表示成一个32数字）。现在需要你用程序来判断IP是否合法。
	
	输入描述:
	输入一个ip地址
	
	输出描述:
	返回判断的结果YES or NO
	
	输入例子:
	10.138.15.1
	
	输出例子:
	YES
	
	思路：排除掉所有非法情况之后剩下的就是合法IP了
 * 
 */

public class LegalIP {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个IP地址：");
		while(in.hasNext()){
			String ipStr = in.nextLine();
			if(isLegal(ipStr)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		
	}
	
	public static boolean isLegal(String ipStr){
			
		String[] array = ipStr.split("\\.");
		if(array.length!=4){
			return false;
		}else{
			for(int i=0;i<array.length;i++){
				if(Integer.valueOf(array[i])>=0&&Integer.valueOf(array[i])<=255){
					continue;
				}else{
					return false;
				}
			}
		}
 		
		return true;
	}

}
