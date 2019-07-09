/**
 * Author:ZhangPl
 * 
 * 检查点：搜索查询-特定地址商品
 */

package com.gxyj.web;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Web123_B2C_Zhangpl extends TestBase{

	@Test
	public void sendPlace(){

		String text=null;
		try {	
			locator.get("http://www.gxyj.com/searchproducts/pv.jhtml?storeFilter=%5B%5D&categoryFilter=%5B%5D&brandFilter=%5B%5D&skuFilter=%5B%5D&provinceFilter=460000_%E6%B5%B7%E5%8D%97&cityFilter=&priceRegionFilter=%7B%7D&sortFilter=0&dirFilter=1&promotionFilter=%5B%5D&resultSearchFilter=&query=%E6%B5%8B%E8%AF%95&searchType=PRODUCT&viewType=large&selectedSearch=%5B%7B%22searchName%22%3A%22%E7%9C%81%E5%8C%BA%22%2C%22searchValue%22%3A%22%E6%B5%B7%E5%8D%97%22%2C%22searchType%22%3A%22province%22%2C%22storeOrCategoryId%22%3A%22460000%22%2C%22propId%22%3A%22%22%2C%22enumId%22%3A%22%22%7D%5D&catId=&exQuery=&currentPage=1&mallId=00000000&propFilter=%5B%5D&authIdArr=&isLocalBuy=");
			text = locator.getText("搜索页_B2C", "提示信息");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("【fail】Web123_B2C:特定地址商品展示异常");
		}
	
		checkPoint.equals(text, "在您设置的筛选条件下搜不到东西哦，要不您去掉几个筛选条件试试？","【fail】Web123_B2C:特定地址商品展示异常");
		checkPoint.result("【pass】Web123_B2C:特定地址商品展示正常");
	}
}










