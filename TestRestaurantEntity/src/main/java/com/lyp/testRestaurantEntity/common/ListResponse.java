/**
 * 
 */
package com.lyp.testRestaurantEntity.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author lyp
 * @date 2016年8月25日上午11:55:45
 */
public class ListResponse<T> extends ApiResponse{
	@JsonProperty(value = "Result")
	private List<T> result;

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}
}
