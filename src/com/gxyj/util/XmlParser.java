package com.gxyj.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class XmlParser {

	private Document document = null;
	
	public XmlParser(String path) {
		
		SAXReader saxReader = new SAXReader();
		try {
			document = saxReader.read(path);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getAttri(String xpath, String name) {
		if (document != null) {
			
			Element element = (Element)document.selectSingleNode(xpath);
			return element.attribute(name).getText();
		}else {
			System.out.println("xml文件解析异常");
			
			return null;
		}
	}
	
	public String getText(String xpath) {
		if (document != null) {
			
			Node node = document.selectSingleNode(xpath);
			if (node != null) {
				return node.getText();
			}
		}
		
		return null;
	}
	
	/*public static void main(String[] args) {
		
		XmlParser xmlParser = new XmlParser("./object.xml");
		String type = xmlParser.getAttri("//首页/登录按钮", "type");
		String value = xmlParser.getAttri("//首页/登录按钮", "value");
		
		By by = null;
		
		switch (type) {
		case "id":
			by = By.id(value);
			break;

		case "name":
			by = By.name(value);
			break;
			
		case "classname":
			by = By.className(value);
			break;
			
		case "xpath":
			by = By.xpath(value);
			break;
		
		default:
			System.out.println("不支持定位方式：" + type);
			break;
		}
		
		System.out.println(by.toString());
	}*/
}








