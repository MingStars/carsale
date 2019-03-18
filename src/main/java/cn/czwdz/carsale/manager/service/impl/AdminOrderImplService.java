package cn.czwdz.carsale.manager.service.impl;

import java.util.List;

import cn.czwdz.carsale.manager.dao.AdminOrderDao;
import cn.czwdz.carsale.manager.pojo.CarOrder;
import cn.czwdz.carsale.manager.pojo.HistoryOrder;
import cn.czwdz.carsale.manager.service.AdminOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminOrderImplService implements AdminOrderService {
@Autowired
	private AdminOrderDao adminOrderDao;
	
	@Override
	public List<CarOrder> getCarOrderById(String orderId, String buyerId, String sellerId, String carId,
										  String orderStatus) {
		// TODO Auto-generated method stub
		System.out.println(orderId+"qq"+buyerId+"qq"+sellerId+"qq"+carId+"qq"+orderStatus);
		return adminOrderDao.getCarOrderById(orderId, buyerId, sellerId, carId, orderStatus);
	}
	
	

	public AdminOrderDao getAdminOrderDao() {
		return adminOrderDao;
	}

	public void setAdminOrderDao(AdminOrderDao adminOrderDao) {
		this.adminOrderDao = adminOrderDao;
	}



	@Override
	public List<CarOrder> getCarOrderCancelled() {
		// TODO Auto-generated method stub
		return adminOrderDao.getCarOrderCancelled();
	}



	@Override
	public List<HistoryOrder> getCarOrderCompleted(){
		// TODO Auto-generated method stub
		return adminOrderDao.getCarOrderCompleted();
	}



	@Override
	public List<CarOrder> getCarOrderConfirmed() {
		// TODO Auto-generated method stub
		return adminOrderDao.getCarOrderConfirmed();
	}



	@Override
	public List<CarOrder> getCarOrderUnconfirmed() {
		// TODO Auto-generated method stub
		return adminOrderDao.getCarOrderUnconfirmed();
	}

}
