package cn.czwdz.carsale.user.dao;

import java.util.List;

import cn.czwdz.carsale.manager.pojo.Friend;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;


@Repository
public interface FriendDao {
	
	//根据输入id查询其好友信息
	@Select("select uid from friend where  fid=#{uid} union SELECT fid FROM friend WHERE uid=#{uid} ")
	public List<Friend> findFriend(@Param("uid") String uid);
	
	
}
