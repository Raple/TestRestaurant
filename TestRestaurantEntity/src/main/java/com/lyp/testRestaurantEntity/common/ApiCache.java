/**
 * 
 */
package com.lyp.testRestaurantEntity.common;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *缓存时间
 * @author lyp
 * @date 2016年8月25日下午1:54:07
 */
public class ApiCache {
	@JsonProperty(value = "ServerTime")
	private Date serverTime;
	@JsonProperty(value = "ExpiresIn")
	private int expiresIn;
	public int getExpiresIn() {
		return expiresIn;
	}
	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}
	public Date getServerTime() {
		return serverTime;
	}
	public void setServerTime(Date serverTime) {
		this.serverTime = serverTime;
	}
}
