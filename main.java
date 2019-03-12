package main;

import java.util.Arrays;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[5];
//		生成整型数组
		for (int i = 0; i < a.length; i++) {
			a[i]=cin.nextInt();
		}

		for (int j = 0; j < c.length; j++) {
		int sum=0;
		for (int i = j; i < a.length; i++) {//生成各个子数组
			sum=a[i]+sum;                   //（连续的一个和多个整数组成）
			b[i]=sum;                       //求出各个子数组的和
		}
		int max=b[0];                       //比较各个子数组的和的大小
		for (int i = j; i < b.length; i++) {
			if(max<b[i])max=b[i];
		}
		c[j]=max;
		}
		int max=c[0];
		for (int i = 0; i < c.length; i++) {//输出最大子数组的和
			if(max<c[i])max=c[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		System.out.println("最大子数组和为:"+max);
	}
}
