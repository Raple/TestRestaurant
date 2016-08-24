/**
 * 
 */
package com.lyp.testRestaurantEntity.req;

/**
 *
 * @author lyp
 * @date 2016年8月24日下午5:33:23
 */
public class SupplierOrderStatisticsReq {
	private int supplierId;
	private String begintime;
	private String endtime;
	private int  orderType;	//堂食：1  外卖：3
	
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getBegintime() {
		return begintime;
	}
	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}	
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}	
}
