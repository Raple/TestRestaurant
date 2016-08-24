/**
 * 
 */
package com.lyp.testRestaurantEntity.domain;

import java.math.BigDecimal;

/**
 *
 * @author lyp
 * @date 2016年8月24日下午5:25:28
 */
public class SupplierOrderStatisticsEntity {
	private int SupplierId;
	private String SupplierName;
	private int SupplierCategoryId;
	private String CategoryName;
	private int SupplierDishId;
	private String SupplierDishName;
	private int Quantity;
	private BigDecimal SupplierPrice;
	private BigDecimal CustomerTotal;
	private BigDecimal CategoryTotal;
	private BigDecimal AllTotal;
	
	public int getSupplierId() {
		return SupplierId;
	}
	public void setSupplierId(int supplierId) {
		SupplierId = supplierId;
	}
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	
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
	public int getSupplierDishId() {
		return SupplierDishId;
	}
	public void setSupplierDishId(int supplierDishId) {
		SupplierDishId = supplierDishId;
	}
	public String getSupplierDishName() {
		return SupplierDishName;
	}
	public void setSupplierDishName(String supplierDishName) {
		SupplierDishName = supplierDishName;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public BigDecimal getSupplierPrice() {
		return SupplierPrice;
	}
	public void setSupplierPrice(BigDecimal supplierPrice) {
		SupplierPrice = supplierPrice;
	}
	public BigDecimal getCustomerTotal() {
		return CustomerTotal;
	}
	public void setCustomerTotal(BigDecimal customerTotal) {
		CustomerTotal = customerTotal;
	}
	public BigDecimal getCategoryTotal() {
		return CategoryTotal;
	}
	public void setCategoryTotal(BigDecimal categoryTotal) {
		CategoryTotal = categoryTotal;
	}
	public BigDecimal getAllTotal() {
		return AllTotal;
	}
	public void setAllTotal(BigDecimal allTotal) {
		AllTotal = allTotal;
	}
}
