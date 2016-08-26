/**
 * 
 */
package com.lyp.testRestaurantEntity.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lyp.testRestaurantCore.util.StatusUtil;

/**
 *
 * @author lyp
 * @date 2016年8月25日上午11:59:04
 */
public class ApiMessage<T> {
	public ApiMessage()
    {
        this.statusCode = 200;
        this.message="操作成功";
    }

	/**
     * 成功返回响应体
     * @param code  接收参数code
     */
    public ApiMessage(Integer code){
    	this.statusCode=code;
    	this.message=StatusUtil.GetInstance().GetMessage(String.valueOf(this.statusCode));    	
    }
    /**
     * 成功返回响应体
     * @param code  接收参数code
     */
    public ApiMessage(Integer code, String message){
    	this.statusCode=code;
    	this.message=message;
    }
    
    
	@JsonProperty(value="StatusCode")	
	private int statusCode;
	@JsonProperty(value = "Message")
	private String message;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
