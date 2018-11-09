package com.sun.test.GenerticTest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

/**
 * 
 * @author sunxp
 * @Description TODO
 * @date 2018年9月29日
 * @time 下午3:58:25
 *
 */
public class test01 {

	@Test
	public void testGeneric() {
		Generic<Integer> integerGenertic = new Generic<Integer>(1234);
		Generic<Number> numberGenertic = new Generic<Number>(235);
		showKeyValue(numberGenertic);
		showKeyValue(integerGenertic);
	}

	public void showKeyValue(Generic<?> obj) {
		List<String> lStrings=new ArrayList<String>();
		//List<String>[] lists=new ArrayList<String>[10];
		System.out.println(obj.getKey());
		List<Integer> a=new ArrayList<Integer>();
		a.add(new Integer(1));
		Integer a1=a.get(0);
	}
	
	/*@Test
	public static void test(){
		List<?>[] lia=new ArrayList<?>[10];
		Object o=lia;
		Object[] objects=(Object[]) o;
		List<Integer> list=new ArrayList<Integer>();
		list.add(new Integer(12));
		objects[1]=list;
		String string=((List<String>) objects[1]).get(0);
		Integer integer=(Integer) lia[1].get(0);
		Integer integer2=((List<Integer>) objects[1]).get(0);
		System.out.println(string);
	}*/
	/*public static void main(String[] args){
	
	}
	*/
	public <T> void printMsg(T...arg){
		for (T t : arg) {
			System.out.println(t);
		}
	}
	
	@Test
	public void testPrintMsg(){
		printMsg("你好啊","不好","呜呜",123);
	}
	//测试这个函数是否可以转换包含非数字的字符串
	@Test
	public void testParseInt(){
		System.out.println(Integer.parseInt("1221"));
	}
	//测试set集合的toString方法
	@Test
	public void testSetToString(){
		Set<Long> idSet=new HashSet<Long>();
		idSet.add(1l);
		idSet.add(2l);
		idSet.add(3l);
		System.out.println(idSet.toString());
	}
	@Test
	public void testString(){
		String string="你好"+1;
		System.out.println(string);
	}
	
	@Test
	public void testDate(){
		//SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		//System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		Calendar start = Calendar.getInstance();
		start.setTime(new Date());
		System.out.println(start.get(Calendar.MONTH));
	}
}
