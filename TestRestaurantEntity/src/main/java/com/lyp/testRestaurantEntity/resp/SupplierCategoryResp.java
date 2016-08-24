/**
 * 
 */
package com.lyp.testRestaurantEntity.resp;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author lyp
 * @date 2016年8月24日下午5:44:18
 */
public class SupplierCategoryResp {
	private int SupplierCategoryId;
	private String CategoryName; 		
	private BigDecimal CategoryTotal;   //本类小计
	private String CategoryPercentage;   //分类占总数的百分比
	private List<SupplierDishPrintResp> SupplierDish;
	
	public int getSupplierCategoryId() {
		return SupplierCategoryId;
	}
	public void setSupplierCategoryId(int supplierCategoryId) {
		SupplierCategoryId = supplierCategoryId;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public BigDecimal getCategoryTotal() {
		return CategoryTotal;
	}
	public void setCategoryTotal(BigDecimal categoryTotal) {
		CategoryTotal = categoryTotal;
	}
	public String getCategoryPercentage() {
		return CategoryPercentage;
	}
	public void setCategoryPercentage(String categoryPercentage) {
		CategoryPercentage = categoryPercentage;
	}
	public List<SupplierDishPrintResp> getSupplierDish() {
		return SupplierDish;
	}
	public void setSupplierDish(List<SupplierDishPrintResp> supplierDish) {
		SupplierDish = supplierDish;
	}	
}
