/**
 * Author:Liuteng
 * 检查点：我的商城页
 */
package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web310_B2C_Liuteng extends TestBase{

	@Test
	public void newShippingAddress(){

		String test = null;
		try {
			locator.get("http://www.gxyj.com/member/member.jhtml?menuType=1_1&mallId=00000000");
			locator.wait(3);
			locator.clickAndHold("我的商城页_B2C", "账户设置");
			locator.clickByXml("我的商城页_B2C", "地址管理");
			System.out.println(locator.getText("我的商城页_B2C", "收货人"));
			locator.clickByXml("我的商城页_B2C", "新建收货地址");
			locator.sendKeys("我的商城页_B2C", "新增收货人", "tester");
			locator.sendKeys("我的商城页_B2C", "新增地址别名", "自动化测试");
			locator.selectByTest("我的商城页_B2C", "新增地区省", "北京");
			locator.selectByTest("我的商城页_B2C", "新增地区区", "通州区");
			locator.sendKeys("我的商城页_B2C", "新增详细地址", "供销E家测试地址");
			//locator.sendKeys("我的商城页_B2C", "新增邮政编码", "000000");
			locator.sendKeys("我的商城页_B2C", "新增手机号", "15300085608");
			//locator.sendKeys("我的商城页_B2C", "新增固定电话", "010-13800138");
			locator.clickByXml("我的商城页_B2C", "保存收货人信息");
			test = locator.getText("我的商城页_B2C", "收货人");
			if(locator.elementIsExit("我的商城页_B2C", "操作删除二")){
				locator.clickByXml("我的商城页_B2C", "操作删除二");
				locator.acceptAlert();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web310_B2C:我的收货信息页新增收货地址异常");
		}
		checkPoint.equals(test, "tester", "【fail】Web310_B2C:我的收货信息页新增收货地址异常");
		checkPoint.result("【pass】Web310_B2C:我的收货信息页新增收货地址正常");
	}
}










