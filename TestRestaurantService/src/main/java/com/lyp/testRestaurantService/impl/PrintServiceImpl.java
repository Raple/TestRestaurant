/**
 * 
 */
package com.lyp.testRestaurantService.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lyp.testRestaurantDao.intel.IPrintDao;
import com.lyp.testRestaurantEntity.domain.SupplierOrderStatisticsEntity;
import com.lyp.testRestaurantEntity.req.SupplierOrderStatisticsReq;
import com.lyp.testRestaurantEntity.resp.SupplierCategoryResp;
import com.lyp.testRestaurantEntity.resp.SupplierDishPrintResp;
import com.lyp.testRestaurantEntity.resp.SupplierOrderStatisticsResp;
import com.lyp.testRestaurantService.inter.IPrintService;

/**
 *
 * @author lyp
 * @date 2016年8月24日下午5:42:05
 */
@Service
public class PrintServiceImpl implements IPrintService{
	@Autowired
	private IPrintDao printDao;	
	
	@Override
	public List<SupplierOrderStatisticsResp> GetSupplierOrderStatistics(SupplierOrderStatisticsReq e) {
		List<SupplierOrderStatisticsResp> list=new ArrayList<SupplierOrderStatisticsResp>();
		List<SupplierOrderStatisticsEntity> orderList=printDao.GetSupplierOrderStatistics(e);
		if(null==orderList||orderList.isEmpty())
		{
			return null;
		}
		
		Map<Integer,List<SupplierOrderStatisticsEntity>> supplierListMap=orderList.stream().collect(Collectors.groupingBy(SupplierOrderStatisticsEntity::getSupplierId));
		if (supplierListMap != null && supplierListMap.size() > 0) {
			supplierListMap.forEach((id, val) -> list.add(CreateSupplierListMap(val)));
		}
							
		return list;
	}
	
	/*
	 * 获取门店数据
	 */
	private SupplierOrderStatisticsResp CreateSupplierListMap(List<SupplierOrderStatisticsEntity> list)
	{
		if(null==list||list.isEmpty())
		{
			return null;
		}
		
		SupplierOrderStatisticsResp result=new SupplierOrderStatisticsResp();
		result.setSupplierId(list.get(0).getSupplierId());
		result.setSupplierName(list.get(0).getSupplierName());
		result.setAllTotal(list.get(0).getAllTotal());
		result.setBeginTime(null); //TODO
		result.setEndTime(null);  //TODO
		
		Map<Integer,List<SupplierOrderStatisticsEntity>> supplierCategoryListMap=list.stream().collect(Collectors.groupingBy(SupplierOrderStatisticsEntity::getSupplierCategoryId));
		if(null!=supplierCategoryListMap&&supplierCategoryListMap.size()>0)
		{
			List<SupplierCategoryResp> temp=new ArrayList<SupplierCategoryResp>();
			supplierCategoryListMap.forEach((id,val)->temp.add(CreateSupplierCategoryListMap(val)));
			result.setSupplierCategory(temp);
		}
		
		return result;
	}
	
	/*
	 * 获取菜品分类数据
	 */
	private SupplierCategoryResp CreateSupplierCategoryListMap(List<SupplierOrderStatisticsEntity> list)
	{
		if(null==list||list.isEmpty())
		{
			return null;
		}
		
		SupplierCategoryResp result=new SupplierCategoryResp();
		result.setSupplierCategoryId(list.get(0).getSupplierCategoryId());
		result.setCategoryName(list.get(0).getCategoryName());
		result.setCategoryTotal(list.get(0).getCategoryTotal());
	    BigDecimal categoryTotal=list.get(0).getCategoryTotal();
	    BigDecimal allTotal=list.get(0).getAllTotal();
		String percentage=(allTotal.equals(0))?"0%":categoryTotal.divide(allTotal,2,BigDecimal.ROUND_HALF_EVEN).multiply(new BigDecimal(100)).toString()+"%";
		result.setCategoryPercentage(percentage); //百分比	
		
		List<SupplierDishPrintResp> temp=new ArrayList<SupplierDishPrintResp>();
		list.forEach(val->temp.add(CreateSupplierDishListMap(val)));
		result.setSupplierDish(temp);

		return result;
	}

	/*
	 * 获取菜品数据
	 */
	private SupplierDishPrintResp CreateSupplierDishListMap(SupplierOrderStatisticsEntity list)
	{
		if(null==list)
		{
			return null;
		}
		
		SupplierDishPrintResp result=new SupplierDishPrintResp();
		result.setSupplierDishId(list.getSupplierDishId());
		result.setSupplierDishName(list.getSupplierDishName());
		result.setQuantity(list.getQuantity());
		result.setSupplierPrice(list.getSupplierPrice());
		result.setCustomerTotal(list.getCustomerTotal());
					
		return result;
	}
	

}
