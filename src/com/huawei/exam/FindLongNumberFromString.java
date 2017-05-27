package com.huawei.exam;

import java.util.Scanner;

/**
 * 题目描述
	样例输出
	输出123058789，函数返回值9
	输出54761，函数返回值5
	 
	接口说明
	函数原型：
	   unsignedint Continumax(char** pOutputstr,  char* intputstr)
	输入参数：
	   char* intputstr  输入字符串；
	输出参数：
	   char** pOutputstr: 连续最长的数字串，如果连续最长的数字串的长度为0，应该返回空字符串；如果输入字符串是空，也应该返回空字符串；  
	返回值：
	  连续最长的数字串的长度
	 
	输入描述:
	输入一个字符串。
	输出描述:
	输出字符串中最长的数字字符串和它的长度。如果有相同长度的串，则要一块儿输出，但是长度还是一串的长度
	输入例子:
	abcd12345ed125ss123058789
	输出例子:
	123058789,9
	将不是数字的字符全部变成‘a’，再将字符串用a来分割称数组，长度最大的数组的长度即为所求的长度，再输出对应数组元素即可 
 *
 */
public class FindLongNumberFromString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		while(in.hasNext()){
			String str = in.nextLine();
			System.out.println("连续最长数字串为：");
			System.out.print(getLongestNumber(str)+", "+getLongestNumber(str).length());;
		}
		
	}
	
	public static String getLongestNumber(String str){
		
		char[] c = str.toCharArray();
		String s = "";
		for(int i=0;i<c.length;i++){
			if(c[i]>='0'&&c[i]<='9'){
				s+=c[i];
			}else{
				s+="x";
			}
		}
		String[] array = s.split("x");
		int maxLength=0;
		for(int i=0;i<array.length;i++){
			maxLength = array[i].length()>maxLength?array[i].length():maxLength;
		}
		
		for(int i=0;i<array.length;i++){
			if(array[i].length()==maxLength){
				return array[i];
			}
		}
		return "";
	}
	
}
