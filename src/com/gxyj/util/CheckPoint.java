package com.gxyj.util;

import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.Assertion;
import org.testng.asserts.IAssert;

public class CheckPoint extends Assertion {

	int flag = 0;
	
	@Override
	public void onBeforeAssert(IAssert a) {
		System.out.println("开始对测试案例进行断言");
	}
	
	public void equals(int actual, int expected, String message) {
		
		if (actual == expected) {
			System.out.println("pass");
		} else {
			Reporter.log(message);
			flag++;
		}
	}
	
	public void equals(float actual, float expected, String message) {
		
		if (actual == expected) {
			System.out.println("pass");
		} else {
			Reporter.log(message);
			flag++;
		}
	}
	
	public void equals(double actual, double expected, String message) {
		
		if (actual == expected) {
			System.out.println("pass");
		} else {
			Reporter.log(message);
			flag++;
		}
	}
	
	
	public void equals(String actual, String excepted, String message) {
		
		if (actual.equals(excepted)) {
			System.out.println("pass");
		} else {
			Reporter.log(message);
			flag++;
		}
	}
	
	public void equals(List<String> actual, List<String> excepted, String message) {
		
		if (actual.size() == excepted.size()) {
			
			System.out.println("pass");
		}else {
			flag++;
		}
		
		for (String string : actual) {
			if (excepted.contains(string)) {
				System.out.println("pass");
			}else {
				flag++;
			}
		}
	}
	
	public void equals(Boolean actual, Boolean excepted, String message) {
		
		if (actual == excepted) {
			System.out.println("pass");
		} else {
			Reporter.log(message);
			flag++;
		}
	}
	
	public void isFalse(String message) {
		
		Assert.assertEquals(true, false, message);
	}
	
	public void result(String message) {
		
		Assert.assertEquals(flag, 0);
		Reporter.log(message);
	}
}
