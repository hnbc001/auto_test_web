package com.gxyj.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IExecutionListener;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.xml.XmlSuite;
import com.gxyj.web.TestBase;

public class MyListener implements ISuiteListener, IExecutionListener, ITestListener, IReporter {

	public static String content;
	public static String url;
	Date start = null;
	Date end = null;

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("正在为所有案例添加失败重跑机制");
		List<ITestNGMethod> methods = suite.getAllMethods();
		for (ITestNGMethod method : methods) {
			method.setRetryAnalyzer(new Retry());
		}
		
		System.out.println("测试套件开始执行");
		
		start = new Date();
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("测试套件执行结束");
	}
	
	@Override
	public void onExecutionStart() {
		// TODO Auto-generated method stub
		System.out.println("TestNG开始执行");
	}

	@Override
	public void onExecutionFinish() {
		// TODO Auto-generated method stub
		System.out.println("TestNG执行结束");
		end = new Date();
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("MyListener.onTestStart()");
		System.out.println(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("MyListener.onTestSuccess()");
	}
	

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("MyListener.onTestFailure()");
		
		File file = ((TakesScreenshot)TestBase.webDriver).getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String fileName = result.getName() + "_" + simpleDateFormat.format(date) + ".png";
		
		try {
			FileUtils.copyFile(file, new File("./screenshots/" + fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("MyListener.onTestSkipped()");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("MyListener.onTestFailedButWithinSuccessPercentage()");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("MyListener.onStart()");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("MyListener.onFinish()");
		Iterator<ITestResult> failedTests = context.getFailedTests().getAllResults().iterator();
		while (failedTests.hasNext()) {
			ITestResult result = failedTests.next();
			if (context.getFailedTests().getResults(result.getMethod()).size()>1) {
				failedTests.remove();
			} else {
				if (context.getPassedTests().getResults(result.getMethod()).size()>0) {
					failedTests.remove();
				}
			}
		}
	}	
	
	
	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
		int total = suites.get(0).getAllMethods().size();
	    int pass = 0;
	    int passSum = 0;
		int skip = 0;
		int fail = 0;
		int failSum = 0;
		Map<String, ISuiteResult> map = suites.get(0).getResults();
		for (String key : map.keySet()) {
			ISuiteResult result = map.get(key);
			pass = result.getTestContext().getPassedTests().size();
			//skip 跳过用例数空余时间查看testng源码解决，目前默认为0
			//skip = result.getTestContext().getSkippedTests().size();
			passSum = passSum + pass;
			fail = result.getTestContext().getFailedTests().size();
			failSum = failSum + fail;
		}
		DecimalFormat df = new DecimalFormat("0.00");
		String passS = df.format((float) pass/(pass+skip+fail)*100);
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss");
		StringBuffer sb = new StringBuffer();
		sb.append("<html><head><meta charset=\"utf-8\"></meta>");
		sb.append("<title>自动化测试报告</title></head>");
		sb.append("<body><h1>" + xmlSuites.get(0).getName() + "</h1>");
		sb.append("<p>测试开始时间：" + format.format(start) + "</p>");
		sb.append("<p>测试结束时间：" + format.format(end) + "</p>");
		sb.append("<p>测试用例总数：" + total + "</p>");
		sb.append("<p>成功用例数：" + passSum + "</p>");
		sb.append("<p>失败用例数：" + failSum + "</p>");
		sb.append("<p>跳过用例数：" + skip + "</p>");
		sb.append("<p>案例通过率：" + passS + "%" + "</p>");
		sb.append("<h2>测试日志：</h2>");
		List<String> list = Reporter.getOutput();
		for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j).equals(list.get(i))) {
                    list.remove(j);
                }
            }
        }
		for (String log : list) {
			sb.append("<tr style=\"background-color: #f5f5f5; font-size: 14px;\">");
			sb.append("<td>");
			sb.append("<p>"+log+"</p>");
			sb.append("</td>");
			sb.append("</tr>");
		}
		sb.append("</tbody>");
		sb.append("</table>");
		
		content = sb.toString();
		System.out.println(content);
		
		OutputStreamWriter writer = null;
		OutputStreamWriter writerindex = null;
		try {
			OutputStream out = new FileOutputStream("./reports/report"+format.format(start)+".html");
			OutputStream outIndex = new FileOutputStream("./reports/index.html");	
			writer = new OutputStreamWriter(out, "UTF-8");
			writerindex = new OutputStreamWriter(outIndex, "UTF-8");
			writer.write(sb.toString());
			writerindex.write(sb.toString());
			writerindex.flush();
			writer.flush();
		} catch (Exception e){
			e.printStackTrace();
		}finally{
			if(writer!=null){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(writerindex!=null){
				try {
					writerindex.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(com.gxyj.util.LTestReport.flag){
				String mail = "chihongyuan@echinacoop.com";
		        String title = "自动化测试报告-附件推荐使用firefox或chrome打开";
		        MailInfo info = new MailInfo();
		        info.setToAddress(mail);
		        info.setSubject(title);
		        info.setContent(content);
		        //MailSendUtil.sendTextMail(info);
		        try {
					MailSendUtil.sendHtmlMail(info);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		/*//int total = suites.get(0).getAllMethods().size();
		int pass = 0;
		int passSum = 0;
		int skip = 0;
		int fail = 0;
		int failSum = 0;
		Map<String, ISuiteResult> map = suites.get(0).getResults();
		for (String key : map.keySet()) {
			ISuiteResult result = map.get(key);
			pass = result.getTestContext().getPassedTests().size();
			passSum = passSum + pass;
			//skip 跳过用例数空余时间查看testng源码解决，目前默认为0
			//skip = result.getTestContext().getSkippedTests().size();
			fail = result.getTestContext().getFailedTests().size();
			failSum = failSum + fail;
		}
		DecimalFormat df = new DecimalFormat("0.00");
		String passS = df.format((float) pass/(pass+skip+fail)*100);
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		StringBuffer sb = new StringBuffer();
		sb.append("<head>");
		sb.append("<meta charset=\"utf-8\">");
		sb.append("<title>");	
		sb.append("供销e家测试部");
		sb.append("</title>");		
		sb.append("</head>");	
		sb.append("<body>");		
		sb.append("<h2 style=\"margin-bottom: 5px;\">");	
		sb.append("自动化测试报告");
		sb.append("</h2>");
		sb.append("<span style=color:red;>");	
		sb.append("测试时间：");
		sb.append(sdf1.format(start));	
		sb.append("</span>");
		sb.append("<div id=\"main\" style=\"height:330px\">");
		sb.append("</div>");
		sb.append("<script src=\"http://echarts.baidu.com/build/dist/echarts.js\">");
		sb.append("</script>");
		sb.append("<script type=\"text/javascript\">");		
		sb.append("require.config({");
		sb.append("paths: {");
		sb.append("echarts: 'http://echarts.baidu.com/build/dist'");
		sb.append("}");
		sb.append("});");
		sb.append("require(['echarts', 'echarts/chart/gauge', 'echarts/chart/pie'],");
		sb.append("function(ec) {");
		sb.append("var myChart = ec.init(document.getElementById('main'));");
		sb.append("var option = {");
		sb.append("color: ['rgba(55, 200, 100, 1)', 'rgba(255, 200, 0, 1)', 'rgba(255, 69, 0, 1)'],");
		sb.append("title: {");
		sb.append("text: '用例占比统计',");
		sb.append("subtext: '      悬浮查看详情',");
		sb.append("x: '650'");
		sb.append("},");
		sb.append("tooltip: {");
		sb.append("trigger: 'item',");
		sb.append("formatter: \"{b} : {c} ({d}%)\"");
		sb.append("},");
		sb.append("legend: {");
		sb.append("orient: 'vertical',");
		sb.append("x: '1100',");
		sb.append("data: ['成功', '跳过', '失败']");
		sb.append("},");
		sb.append("toolbox: {");
		sb.append("show: true,");
		sb.append("feature: {");
		sb.append("saveAsImage: {");
		sb.append("show: true");
		sb.append("}");
		sb.append("},");
		sb.append("showTitle: false");
		sb.append("},");
		sb.append("calculable: true,");
		sb.append("series: [{");
		sb.append("name: '测试通过率',");
		sb.append("type: 'gauge',");
		sb.append("title: {");
		sb.append("show: 'fasle',");
		sb.append("textStyle: {");
		sb.append("fontWeight: 'bolder',");
		sb.append("color: '#FF0000',");
		sb.append("fontSize: '18'");
		sb.append("}");
		sb.append("},");
		sb.append("detail: {");
		sb.append("formatter: '{value}%'");
		sb.append("},");
		sb.append("center: ['20%', '55%'],");
		sb.append("radius: ['0', '85%'],");
		sb.append("data: [{");
		sb.append("value: 0,");
		sb.append("name: '测试通过率'");
		sb.append("}]");
		sb.append("},");
		sb.append("{");
		sb.append("name: '用例统计',");
		sb.append("type: 'pie',");
		sb.append("radius: ['40%', '70%'],");
		sb.append("center: ['70%', '48%'],");
		sb.append("itemStyle: {");
		sb.append("normal: {");
		sb.append("label: {");
		sb.append("show: false");
		sb.append("},");
		sb.append("labelLine: {");
		sb.append("show: false");
		sb.append("}");
		sb.append("},");
		sb.append("emphasis: {");	
		sb.append("label: {");
		sb.append("show: true,");
		sb.append("position: 'center',");	
		sb.append("textStyle: {");
		sb.append("fontSize: '30',");
		sb.append("fontWeight: 'bold'");	
		sb.append("}");
		sb.append("}");
		sb.append("}");	
		sb.append("},");
		sb.append("data: [{");
		sb.append("value: 0,");	
		sb.append("name: '成功'");
		sb.append("},");
		sb.append("{");	
		sb.append("value: 0,");
		sb.append("name: '跳过'");
		sb.append("},");	
		sb.append("{");
		sb.append("value: 0,");
		sb.append("name: '失败'");	
		sb.append("}]");
		sb.append("}]");
		sb.append("};");	
		sb.append("option.series[0].data[0].value = ");
		sb.append(passS);
		sb.append(";");
		sb.append("option.series[1].data[0].value = ");
		sb.append(pass);
		sb.append(";");
		sb.append("option.series[1].data[1].value = ");
		sb.append(skip);
		sb.append(";");
		sb.append("option.series[1].data[2].value = ");
		sb.append(fail);
		sb.append(";");
		sb.append("myChart.setOption(option);");
		sb.append("});");				
		sb.append("</script>");
		sb.append("<table width=\"100%\" cellpadding=\"5\" cellspacing=\"1\">");
		sb.append("<tbody>");
		sb.append("<tr style=\"background-color: #eaf0f7;\">");
		sb.append("<td width=\"90%\">");
		sb.append("<font style=\"font-weight:bold\" size=\"3\" color=\"red\" weight='bold'>测试日志信息</font></td></tr>");
		List<String> list = Reporter.getOutput();
		for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j).equals(list.get(i))) {
                    list.remove(j);
                }
            }
        }
		for (String log : list) {
			sb.append("<tr style=\"background-color: #f5f5f5; font-size: 14px;\">");
			sb.append("<td>");
			sb.append("<p>"+log+"</p>");
			sb.append("</td>");
			sb.append("</tr>");
		}
		sb.append("</tbody>");
		sb.append("</table>");
		
		String content = sb.toString();
		System.out.println(content);
		
		OutputStreamWriter writer = null;
		OutputStreamWriter writerindex = null;
		try {
			OutputStream out = new FileOutputStream("./reports/report"+format.format(start)+".html");
			OutputStream outIndex = new FileOutputStream("./reports/index.html");	
			writer = new OutputStreamWriter(out, "UTF-8");
			writerindex = new OutputStreamWriter(outIndex, "UTF-8");
			writer.write(sb.toString());
			writerindex.write(sb.toString());
			writerindex.flush();
			writer.flush();
		} catch (Exception e){
			e.printStackTrace();
		}finally{
			if(writer!=null){
				try {
					writer.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			if(writerindex!=null){
				try {
					writerindex.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			String mail = "chihongyuan@echinacoop.com"; 
	        String title = "自动化测试报告";
	        MailInfo info = new MailInfo();  
	        info.setToAddress(mail);
	        info.setSubject(title);
	        info.setContent(content);
	        //MailSendUtil.sendTextMail(info);
	        try {
				MailSendUtil.sendHtmlMail(info);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}
}
