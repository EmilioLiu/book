package cn.itcast.test.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.servlet.BaseServlet;

public class LoginServlet extends BaseServlet {

	public String login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 校验验证码
		 * 1. 获取表单中的验证码
		 * 2. 获取图片上的文字
		 */
		String verifyCode = request.getParameter("verifyCode");
		// VerifyCodeServlet会把真正的验证码保存到session中
		String vcode = (String) request.getSession().getAttribute("vCode");
		System.out.println(verifyCode.equalsIgnoreCase(vcode));
		
		return null;
	}
}
