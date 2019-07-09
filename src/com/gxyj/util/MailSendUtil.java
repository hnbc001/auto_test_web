package com.gxyj.util;

import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;


public class MailSendUtil {

	private final static String host = "smtp.exmail.qq.com"; 
    private final static String formName = "chihongyuan@echinacoop.com";//你的邮箱
    private final static String password = "qazWSX111"; //授权码qazWSX111//j7HgU9dbDc4USKDc
    private final static String replayAddress = "chihongyuan@echinacoop.com"; //你的邮箱
    private final static String[] ccs = new String[]{"chihongyuan@echinacoop.com", "yanglong@echinacoop.com"};//chihongyuan@echinacoop.com//zhangpeiliang@echinacoop.com


    public static void sendHtmlMail(MailInfo info)throws Exception{
        info.setHost(host);
        info.setFormName(formName);
        info.setFormPassword(password);   //网易邮箱的授权码~不一定是密码
        info.setReplayAddress(replayAddress);

        Message message = getMessage(info);
        Address[] ccAdresses = new InternetAddress[ccs.length];
        for (int i = 0; i < ccs.length; i++) {
        	ccAdresses[i] = new InternetAddress(ccs[i]);
        }
        message.setRecipients(Message.RecipientType.CC, ccAdresses);
		MimeBodyPart document = new MimeBodyPart();
		DataHandler dhdoc = new DataHandler(new FileDataSource("./reports/report.html"));
		document.setDataHandler(dhdoc);
		document.setFileName(MimeUtility.decodeText(dhdoc.getName()));
        // MiniMultipart类是一个容器类，包含MimeBodyPart类型的对象	
        Multipart mainPart = new MimeMultipart();
        // 创建一个包含HTML内容的MimeBodyPart
        BodyPart html = new MimeBodyPart();
        // 设置HTML内容
        html.setContent(info.getContent(), "text/html; charset=utf-8");
        mainPart.addBodyPart(html);
        mainPart.addBodyPart(document);
        // 将MiniMultipart对象设置为邮件内容
        message.setContent(mainPart);
        Transport.send(message);
    }

    public static void sendTextMail(MailInfo info) throws Exception {

        info.setHost(host);
        info.setFormName(formName);
        info.setFormPassword(password);   //网易邮箱的授权码~不一定是密码
        info.setReplayAddress(replayAddress);
        Message message = getMessage(info);
        //消息发送的内容
        message.setText(info.getContent());

        Transport.send(message);
    }

    private static Message getMessage(MailInfo info) throws Exception{
        final Properties p = System.getProperties() ;
        p.setProperty("mail.smtp.host", info.getHost());
        p.setProperty("mail.smtp.auth", "true");
        p.setProperty("mail.smtp.user", info.getFormName());
        p.setProperty("mail.smtp.pass", info.getFormPassword());

        // 根据邮件会话属性和密码验证器构造一个发送邮件的session
        Session session = Session.getInstance(p, new Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(p.getProperty("mail.smtp.user"),p.getProperty("mail.smtp.pass"));
            }
        });
        session.setDebug(true);
        Message message = new MimeMessage(session);
        //消息发送的主题
        message.setSubject(info.getSubject());
        //接受消息的人
        message.setReplyTo(InternetAddress.parse(info.getReplayAddress()));
        //消息的发送者
        message.setFrom(new InternetAddress(p.getProperty("mail.smtp.user"),"tester"));
        // 创建邮件的接收者地址，并设置到邮件消息中
        message.setRecipient(Message.RecipientType.TO,new InternetAddress(info.getToAddress()));
        // 消息发送的时间
        message.setSentDate(new Date());
        return message ;
    }
}
