/**
 * 
 */
package com.lyp.testRestaurantEntity.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author lyp
 * @date 2016年8月25日上午11:56:29
 */
public class ApiResponse {
	public ApiResponse()
    {
        this.message = new ApiMessage();
        this.cache = new ApiCache();
    }
	@JsonProperty(value = "Message")
	private ApiMessage message;
	@JsonProperty(value = "ResultTotalCount")
	private int resultTotalCount;
	@JsonProperty(value = "Cache")
	private ApiCache cache;

	public ApiMessage getMessage() {
		return message;
	}

	public void setMessage(ApiMessage message) {
		this.message = message;
	}

	public int getResultTotalCount() {
		return resultTotalCount;
	}

	public void setResultTotalCount(int resultTotalCount) {
		this.resultTotalCount = resultTotalCount;
	}

	public ApiCache getCache() {
		return cache;
	}

	public void setCache(ApiCache cache) {
		this.cache = cache;
	}
}
