/**
 * 
 */
package com.lyp.testRestaurantDao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.lyp.testRestaurantDao.base.BaseDao;
import com.lyp.testRestaurantDao.intel.IPrintDao;
import com.lyp.testRestaurantEntity.domain.SupplierOrderStatisticsEntity;
import com.lyp.testRestaurantEntity.req.SupplierOrderStatisticsReq;

/**
 *
 * @author lyp
 * @date 2016年8月24日下午5:20:44
 */
public class PrintDaoImpl implements IPrintDao{
	@Autowired
	private BaseDao dao;
		
	@Override
	public List<SupplierOrderStatisticsEntity> GetSupplierOrderStatistics(SupplierOrderStatisticsReq e) {
		return dao.selectList("Print.SupplierOrderStatistics", e);	
	}

}
