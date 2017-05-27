package com.huawei.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * 题目描述
 * 输入整型数组和排序标识，对其元素按照升序或降序进行排序
 *
 * 输入描述:
 * 1、输入需要输入的整型数个数
 * 
 * 输出描述:
 * 输出排好序的数字
 *
 * 输入例子:
 * 8
 * 1 2 4 9 3 55 64 25
 * 0
 *
 * 输出例子:
 * 1 2 3 4 9 25 55 64
 *
 */
public class IntergerArraySort {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("输入需要排序的整型数个数：");
		while(in.hasNext()){
			int count = in.nextInt();
			List numList = new ArrayList<>();
			for(int i=0;i<count;i++){
				numList.add(in.nextInt());
			}
			//排序类型 0 升序  1降序
			int type;
			type = in.nextInt();
			
			System.out.println("排序结果：");
			Collections.sort(numList);
			if(type == 0){
				System.out.println("升序输出");
				for(int i = 0;i<numList.size();i++){
					System.out.print(numList.get(i) +" ");
				}
			}
			if(type == 1){
				System.out.println("降序输出");
				for(int i = numList.size()-1;i>=0;i--){
					System.out.print(numList.get(i) +" ");
				}
			}
		}
	}

}
