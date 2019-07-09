/**
 * @author chihongyuan
 * 验证首页轮播图功能
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web004_B2C_Chihy extends TestBase {

	@Test
	public void sowingMap() {
		
		boolean flag = false;
		try {
			flag = locator.elementIsExit("首页_B2C", "轮播图");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web004_B2C:首页轮播图展示失败");
		}
		
		checkPoint.equals(flag, true, "【fail】Web004_B2C:首页轮播图展示失败");
		checkPoint.result("【pass】Web004_B2C:首页轮播图展示成功");
		
	} 
}
