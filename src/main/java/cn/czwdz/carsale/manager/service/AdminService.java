package cn.czwdz.carsale.manager.service;

import cn.czwdz.carsale.manager.pojo.HistoryOrder;

import java.util.List;



public interface AdminService {

	public List<HistoryOrder> getHistoryOrder();
	
	public List<HistoryOrder> getHistoryOrderByName(String id, String uyer, String car, String seller, Integer current);

	public Integer deleteHistoryOrder(Integer id);
	
	public Integer getCount();
	
	public Integer getCount(String id, String uyer, String car, String seller);
}
