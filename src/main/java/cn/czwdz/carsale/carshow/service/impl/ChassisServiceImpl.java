package cn.czwdz.carsale.carshow.service.impl;


import cn.czwdz.carsale.carshow.dao.ChassisDao;
import cn.czwdz.carsale.carshow.service.ChassisService;
import cn.czwdz.carsale.manager.pojo.CarChassis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ChassisServiceImpl implements ChassisService {
    @Autowired
    private ChassisDao chassisDao;

    public ChassisDao getChassisDao() {
        return chassisDao;
    }

    public void setChassisDao(ChassisDao chassisDao) {
        this.chassisDao = chassisDao;
    }

    @Override
    public CarChassis getChassis(Integer id) {
        // TODO Auto-generated method stub
        return chassisDao.getChassis(id);
    }


}
