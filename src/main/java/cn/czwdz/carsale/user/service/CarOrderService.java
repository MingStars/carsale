package cn.czwdz.carsale.user.service;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.CarOrder;
import org.apache.ibatis.annotations.Param;





public interface CarOrderService {
	public List<CarOrder> unCommit0();
	
	public List<CarOrder> unCommitBuyer();
	
	public int updateStatus(@Param("orderId") String orderId);
}
