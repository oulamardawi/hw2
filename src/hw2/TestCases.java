package hw2;


import org.junit.Test;

import junit.framework.Assert;
import pkg.newclass;

public class  TestCases {

	@SuppressWarnings("deprecation")
	@Test
	public	void test() {
		// Arrange
		int a = 10;
		int b = 20;
		newclass calc = new newclass();
		// Act
		int result = calc.add(a, b);
		// Assert
		Assert.assertTrue(result > 0);
	}

}
