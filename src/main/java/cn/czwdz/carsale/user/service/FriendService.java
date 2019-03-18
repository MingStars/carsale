package cn.czwdz.carsale.user.service;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.Friend;
import org.apache.ibatis.annotations.Param;




public interface FriendService {

	public List<Friend> findFriend(@Param("uid") String uid);
}
