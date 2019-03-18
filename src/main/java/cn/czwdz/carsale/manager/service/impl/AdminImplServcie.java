package cn.czwdz.carsale.manager.service.impl;

import java.util.List;

import cn.czwdz.carsale.manager.dao.AdminDao;
import cn.czwdz.carsale.manager.pojo.HistoryOrder;
import cn.czwdz.carsale.manager.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminImplServcie implements AdminService {
@Autowired
private AdminDao adminDao;
	
	@Override
	public List<HistoryOrder> getHistoryOrder() {
		
		return adminDao.getHistoryOrder();
	}

	@Override
	public List<HistoryOrder> getHistoryOrderByName(String d, String buyer, String car, String seller,Integer current) {
		// 3是pageSize Sql中固定，需同步修改
		current =(current-1)*3 ;
		return adminDao.getHistoryOrderByName(d, buyer, car, seller,current);
	}

	@Override
	public Integer deleteHistoryOrder(Integer id) {
		// TODO Auto-generated method stub
		return adminDao.deleteHistoryOrder(id);
	}

	@Override
	public Integer getCount() {
		// TODO Auto-generated method stub
		return adminDao.getCount();
	}

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public Integer getCount(String id, String buyer, String car, String seller) {
		// TODO Auto-generated method stub
		return adminDao.getCountByName(id, buyer, car, seller);
	}

}
