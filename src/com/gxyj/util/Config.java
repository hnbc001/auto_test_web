package com.gxyj.util;

public class Config {

	public static String browserType = null;
	public static boolean display = true;
	public static String browserPath = null;
	public static int objectWaitTime = 0;
	public static int retryTime = 0;
	public static String objectPaht = null;
	
	static {
		
		XmlParser xmlParser = new XmlParser("./config.xml");
		browserType = xmlParser.getText("/参数配置/浏览器类型");
		display = Boolean.parseBoolean(xmlParser.getText("/参数配置/显示"));
		browserPath = xmlParser.getText("/参数配置/浏览器驱动路径");
		objectWaitTime = Integer.parseInt(xmlParser.getText("/参数配置/查询元素等待时长"));
		retryTime = Integer.parseInt(xmlParser.getText("/参数配置/失败重跑次数"));
		objectPaht = xmlParser.getText("/参数配置/对象库文件路径");
	}
}
