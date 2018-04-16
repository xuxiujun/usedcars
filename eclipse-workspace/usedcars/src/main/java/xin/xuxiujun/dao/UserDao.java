package xin.xuxiujun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import xin.xuxiujun.domain.User;
import xin.xuxiujun.domain.UserCollections;

public interface UserDao {
	public abstract User findByUsername(String userNetworkName);//登录
	public abstract User findByUserid(String string);//根据用户编号查询
	public abstract void updateUserbaseinformation(User user);//修改个人信息
	public abstract void saveUserInformation(User user);//注册
    public abstract void uploadUserAvator(User user);//上传用户头像
    public abstract void myColllection(@Param("userid")String userid,@Param("carid")String carid);//用户添加收藏
    public abstract List<UserCollections> findMyCollectionByUserId(UserCollections userCollections);//用户查看自己的收藏   
    public abstract void deleteCollection();//用户删除自己的收藏
}
