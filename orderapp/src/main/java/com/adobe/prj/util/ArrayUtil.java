package com.adobe.prj.util;

public class ArrayUtil {

	 public static int getSum(int[] elems) {
		 int total = 0;
		 for(int no : elems) {
			 total += no;
		 }
		 return total;
	 }

	 public static int getCount(int[]elems , int no) {
		 int count = 0;
		 for(int n : elems) {
			if( n == no) {
				count++;
			}
		 }
		 return count;
	 }
}
