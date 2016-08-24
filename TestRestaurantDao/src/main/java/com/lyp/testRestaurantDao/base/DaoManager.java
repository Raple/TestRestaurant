package com.lyp.testRestaurantDao.base;

import java.util.List;
import com.lyp.testRestaurantEntity.common.PagerModel;

/**
 *
 * @author lyp
 * @date 2016年8月24日下午3:26:38
 */
public interface DaoManager<E extends PagerModel> {
	/**
	 * 添加
	 * 
	 * @param e
	 * @return
	 */
	public int insert(E e);
	
	public int insertList(List<E> list);

	/**
	 * 删除
	 * 
	 * @param e
	 * @return
	 */
	public int delete(E e);

	/**
	 * 修改
	 * 
	 * @param e
	 * @return
	 */
	public int update(E e);

	/**
	 * 查询一条记录
	 * 
	 * @param e
	 * @return
	 */
	public E selectOne(E e);

	/**
	 * 分页查询
	 * 
	 * @param e
	 * @return
	 */
	public PagerModel selectPageList(E e);
	
	/**
	 * 根据条件查询所有
	 * @return
	 */
	public List<E> selectList(E e);

	/**
	 * 根据ID来删除一条记录
	 * @param id
	 */
	public int deleteById(int id);

	/**
	 * 根据ID查询一条记录
	 * @param id
	 * @return
	 */
	public E selectById(int id);	
}
