package cn.czwdz.carsale.manager.service;

import cn.czwdz.carsale.manager.pojo.CarOrder;
import cn.czwdz.carsale.manager.pojo.HistoryOrder;

import java.util.List;



public interface AdminOrderService {

	
	public List<CarOrder> getCarOrderById(String orderId, String buyerId, String sellerId, String carId, String orderStatus);

	
	public List<CarOrder> getCarOrderCancelled();

	public List<HistoryOrder> getCarOrderCompleted();
 
	public List<CarOrder> getCarOrderConfirmed();
	
	public List<CarOrder> getCarOrderUnconfirmed();
}
