package xin.xuxiujun.dao;

import xin.xuxiujun.domain.User;

public interface UserDao {

	public abstract User findByUsername(String userNetworkName);

}
