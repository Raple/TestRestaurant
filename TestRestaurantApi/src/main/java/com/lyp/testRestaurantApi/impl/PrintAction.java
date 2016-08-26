/**
 * 
 */
package com.lyp.testRestaurantApi.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lyp.testRestaurantApi.inter.IPrintAction;
import com.lyp.testRestaurantEntity.common.ListResponse;
import com.lyp.testRestaurantEntity.req.SupplierOrderStatisticsReq;
import com.lyp.testRestaurantEntity.resp.SupplierOrderStatisticsResp;
import com.lyp.testRestaurantService.inter.IPrintService;

/**
 *
 * @author lyp
 * @date 2016年8月25日上午11:37:55
 */
@Service
public class PrintAction implements IPrintAction{
	@Autowired
	private IPrintService printService;
	
	@Override
	public ListResponse<SupplierOrderStatisticsResp> GetSupplierOrderStatistics(int supplierId, String begintime, String endtime, int orderType) {
		
		ListResponse<SupplierOrderStatisticsResp> resp=new ListResponse<SupplierOrderStatisticsResp>();
		if(supplierId<1||StringUtils.isBlank(begintime)||StringUtils.isBlank(endtime)){
			resp.getMessage().setStatusCode(500);
			resp.getMessage().setMessage("传入参数有误");
			return resp;
		}
		
		SupplierOrderStatisticsReq req=new SupplierOrderStatisticsReq();
		req.setSupplierId(supplierId);
		req.setBegintime(begintime+" 00:00:00");
		req.setEndtime(endtime+" 23:59:59");
		req.setOrderType(orderType);
		
		List<SupplierOrderStatisticsResp> result=printService.GetSupplierOrderStatistics(req);				
		resp.setResult(result);			
		return resp;
	}

}
