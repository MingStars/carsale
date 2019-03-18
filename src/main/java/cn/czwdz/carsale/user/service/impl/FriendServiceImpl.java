package cn.czwdz.carsale.user.service.impl;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.Friend;
import cn.czwdz.carsale.user.dao.FriendDao;
import cn.czwdz.carsale.user.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class FriendServiceImpl implements FriendService {
	@Autowired
	FriendDao friendDao;
	
	@Override
	public List<Friend> findFriend(String uid) {
		// TODO Auto-generated method stub
		return friendDao.findFriend(uid);
	}

}
