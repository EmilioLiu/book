package cn.itcast.test;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.Session;

import org.junit.Test;

import cn.itcast.mail.Mail;
import cn.itcast.mail.MailUtils;

/**
 * 测试MailUtils,作用是发邮件
 *   底层依赖的是javamail：mail.jar、activation.jar
 * @author qdmmy6
 *
 */
public class MailUtilsTest {
	/**
	 * 发邮件
	 * @throws IOException 
	 * @throws MessagingException 
	 */
	@Test
	public void send() throws MessagingException, IOException {
		/*
		 * 1. 登录邮件服务器
		 *   MailUtils.createSession(服务器地址, 登录名, 密码);
		 * 2. 创建邮件对象
		 *   发件人
		 *   收件人
		 *   主题
		 *   正文
		 * 3. 发
		 *   需要第一步得到的session、和第二步的邮件对象
		 */
		Session session = MailUtils.createSession("smtp.163.com", "itcast_cxf", "itcastitcast");
		
		Mail mail = new Mail("itcast_cxf@163.com", "itcast_cxf@126.com", "测试邮件一封", "<a href='http://www.baidu.com'>百度</a>");
		
		MailUtils.send(session, mail);
	}
}
