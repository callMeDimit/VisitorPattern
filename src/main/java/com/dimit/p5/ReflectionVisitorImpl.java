package com.dimit.p5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Dimit 2015年1月17日
 */
public class ReflectionVisitorImpl implements ReflectionVisitor {
	private Visitor v;

	public ReflectionVisitorImpl(Visitor v) {
		this.v = v;
	}

	@Override
	public void visit(Person p) {
		if (p == null) {
			throw new IllegalArgumentException("输入的数据源不能为空。");
		}
		Class<?> [] argClzs = new Class<?>[]{p.getClass()};
		Object [] argObjs = new Object[]{p};  
		try {
			Method m = v.getClass().getMethod(ReflectionVisitor.METHODNAME, argClzs);
			m.invoke(v, argObjs);
		} catch (NoSuchMethodException | SecurityException e) {
			return;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateVisitor(Visitor v) {
		this.v = v;
	}
}
