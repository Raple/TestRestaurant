/**
 * 
 */
package com.lyp.testRestaurantEntity.resp;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author lyp
 * @date 2016年8月24日下午5:43:30
 */
public class SupplierOrderStatisticsResp {
	private int SupplierId;
	private String SupplierName;
	private String beginTime;
	private String endTime;
	private BigDecimal AllTotal;   //总价
	private List<SupplierCategoryResp> SupplierCategory;
	
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
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public BigDecimal getAllTotal() {
		return AllTotal;
	}
	public void setAllTotal(BigDecimal allTotal) {
		AllTotal = allTotal;
	}
	public List<SupplierCategoryResp> getSupplierCategory() {
		return SupplierCategory;
	}
	public void setSupplierCategory(List<SupplierCategoryResp> supplierCategory) {
		SupplierCategory = supplierCategory;
	}	
}
