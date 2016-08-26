/**
 * 
 */
package com.lyp.testRestaurantApi.inter;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.lyp.testRestaurantEntity.common.ListResponse;
import com.lyp.testRestaurantEntity.resp.SupplierOrderStatisticsResp;

/**
 *
 * @author lyp
 * @date 2016年8月25日上午11:38:08
 */
@Path("/print")
@Produces("application/json; charset=utf-8") // 当前类的所有方法都返回json格式的数据
public interface IPrintAction {
	@GET
	@Path(value = "/getSupplierOrderStatistics/{supplierId}/{begintime}/{endtime}/{orderType}")
	ListResponse<SupplierOrderStatisticsResp> GetSupplierOrderStatistics(@PathParam("supplierId") @DefaultValue("269170") int supplierId,
			@PathParam("begintime") String begintime, @PathParam("endtime") String endtime,@PathParam("orderType") @DefaultValue("1") int orderType);
	
}
