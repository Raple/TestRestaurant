/**
 * 
 */
package com.lyp.testRestaurantEntity.common;

/**
 *系统中所有实体类必须继承的接口，此为顶级接口，负责清理实体类中的字段数据。
 * @author lyp
 * @date 2016年8月24日下午5:02:46
 */
public interface ClearBean {
	/**
	 * 清空实体类的属性的值
	 */
	void clear();
}
