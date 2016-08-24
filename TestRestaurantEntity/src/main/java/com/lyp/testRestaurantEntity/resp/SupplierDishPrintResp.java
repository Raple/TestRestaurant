/**
 * 
 */
package com.lyp.testRestaurantEntity.resp;

import java.math.BigDecimal;

/**
 *
 * @author lyp
 * @date 2016年8月24日下午5:44:49
 */
public class SupplierDishPrintResp {
	private int SupplierDishId;
	private String SupplierDishName;
	private int Quantity;    //数量
	private BigDecimal SupplierPrice; //单价
	private BigDecimal CustomerTotal; //数量*单价
	
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
}
