package com.adobe.prj.api;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.adobe.prj.util.ArrayUtil;

class ArrayUtilTest {

	@Test
	void testGetSum() {
		 int[] elems = {6,4,2};
		 int result = ArrayUtil.getSum(elems);
		 assertEquals(12, result);
		 
	}

	@Test
	void testGetCount() {
		 int[] elems = {6,4,2,4,7,4};
		 int result = ArrayUtil.getCount(elems, 4);
		 assertEquals(3, result);
	}

}
