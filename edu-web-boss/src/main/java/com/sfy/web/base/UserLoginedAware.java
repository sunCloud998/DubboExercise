package com.sfy.web.base;

import com.sfy.facade.user.entity.PmsUser;

public interface UserLoginedAware {

	/**
	 * 取得登录的用户
	 * 
	 * @return
	 */
	public PmsUser getLoginedUser();
}
