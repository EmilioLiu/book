package cn.itcast.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import cn.itcast.commons.CommonUtils;

/**
 * 测试CommonUtils类
// *   CommonUtils类依赖的jar：commons-beanutils.jar、commons-logging.jar
 * @author qdmmy6
 *
 */
public class CommonUtilsTest {
	/**
	 * 测试uuid()
	 *   返回一个随机的32长的字符串
	 *  用途：
	 *  1. 用来做id，数据库表中的主键是不能重复的，它就是不重复的！
	 *  2. 激活码也是不能重复的！也可以用它
	 *  
	 */
	@Test
	public void testUuid() {
		String s = CommonUtils.uuid();
		System.out.println(s);
	}
	
	/**
	 * 作用：把一个map中的数据封装到javabean中
	 * 要求：
	 * 1. 要求map中的key名称与javabean中的属性名称相同
	 */
	@Test
	public void testToBean() {
		/*
		 * 1. 创建Map
		 */
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pid", "123");
		map.put("pname", "张三");
		map.put("age", "23");
		map.put("xxx", "XXX");
		
		// 通过map的数据来创建Person类型的JavaBean对象
		Person p = CommonUtils.toBean(map, Person.class);
		System.out.println(p);
	}
}
