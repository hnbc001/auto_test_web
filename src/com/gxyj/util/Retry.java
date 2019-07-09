package com.gxyj.util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.gxyj.web.TestBase;

public class Retry extends TestBase implements IRetryAnalyzer {
	
	int max = Config.retryTime;
	int count = 0;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (count < max) {
			count = count + 1;
			System.out.println("测试用例" + result.getName() + "正在进行第" + count + "次重跑");
			locator.reget(com.gxyj.util.MyListener.url);
			return true;
		}else {
			return false;
		}
	}
}
