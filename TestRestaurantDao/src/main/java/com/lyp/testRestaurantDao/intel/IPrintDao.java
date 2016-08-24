/**
 * 
 */
package com.lyp.testRestaurantDao.intel;

import java.util.List;
import com.lyp.testRestaurantEntity.domain.SupplierOrderStatisticsEntity;
import com.lyp.testRestaurantEntity.req.SupplierOrderStatisticsReq;

/**
 *
 * @author lyp
 * @date 2016年8月24日下午5:20:03
 */
public interface IPrintDao {
	List<SupplierOrderStatisticsEntity> GetSupplierOrderStatistics(SupplierOrderStatisticsReq e);
}
