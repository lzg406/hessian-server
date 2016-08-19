//package com.vivo.hessian.common.utils;
//
//import java.util.Map;
//
//import org.apache.commons.beanutils.PropertyUtils;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//
//public class BeanUtils {
//
//	private final static Log log = LogFactory.getLog(BeanUtils.class);
//
//	/**
//	 * 将对象转换成MAP集合，只转换PUBLIC的
//	 *
//	 * @param obj
//	 * @return
//	 */
//	public static Map<?, ?> convertbeanToMap(Object obj) {
//		try {
//			return org.apache.commons.beanutils.BeanUtils.describe(obj);
//		} catch (Exception e) {
//			log.error(e);
//			throw new RuntimeException("将对象转换为map时发生异常", e);
//		}
//	}
//
//	/**
//	 * 复制对象
//	 * @param dest
//	 * @param orig
//	 */
//	public static void copyProperties(Object dest, Object orig) {
//		try {
//			PropertyUtils.copyProperties(dest, orig);
//		} catch (Exception e) {
//			log.error(e);
//			throw new RuntimeException("对象属性复制时出现异常!", e);
//		}
//	}
//
//	/**
//	 * 克隆对象
//	 * @param bean
//	 * @return
//	 */
//	public static Object cloneBean(Object bean) {
//		try {
//			return org.apache.commons.beanutils.BeanUtils.cloneBean(bean);
//		} catch (Exception cause) {
//			log.error(cause);
//			throw new RuntimeException("对象克隆时发生异常!", cause);
//		}
//	}
//}
