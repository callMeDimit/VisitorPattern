package com.dimit.p4;
import java.lang.reflect.Method;

public abstract class ReflectionVisitor  {
	/** 具体的访问方法*/
	public static final String METHODNAME = "visit";
	/**
	 * 使用反射动态绑定到不同访问方法上
	 * @param person
	 */
	public void visit(Person person) {
		// 判断是否是null
		if (person == null) {
			throw new NullPointerException("Person不能为空啊!");
		}
		// 组装class数组，即调用动态方法的时候参数的类型
		Class<?>[] classes = new Class[] { person.getClass() };
		// 组装与class数组相对应的值
		Object[] objects = new Object[] { person };
		try {
			// 查找方法
			Method m = getClass().getMethod(METHODNAME, classes);
			// 调用该方法
			m.invoke(this, objects);
		} catch (NoSuchMethodException e) {
			// 若某种类型的visitor无需实现访问特定类型的(Person)则在捕获到没该类方法时直接从这里返回
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
