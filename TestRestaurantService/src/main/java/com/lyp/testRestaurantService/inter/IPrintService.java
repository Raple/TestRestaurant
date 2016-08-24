/**
 * 
 */
package com.lyp.testRestaurantService.inter;

import java.util.List;
import com.lyp.testRestaurantEntity.req.SupplierOrderStatisticsReq;
import com.lyp.testRestaurantEntity.resp.SupplierOrderStatisticsResp;

/**
 *
 * @author lyp
 * @date 2016年8月24日下午5:42:28
 */
public interface IPrintService {
	List<SupplierOrderStatisticsResp> GetSupplierOrderStatistics(SupplierOrderStatisticsReq e);
}
