package cn.itcast.goods.user.web.servlet;

import cn.itcast.goods.user.service.UserService;
import cn.itcast.servlet.BaseServlet;

/**
 * 用户模块WEB层
 * @author qdmmy6
 *
 */
public class UserServlet extends BaseServlet {
	private UserService userService = new UserService();
}
