package com.sfy.service.user.dao;

import com.sfy.common.core.dao.BaseDao;
import com.sfy.facade.user.entity.PmsUser;

/**
 * @Description: PmsUserDao.java
 * @Date: 2016/04/12
 * @Author: sunfayun
 * @Version: 1.0
 */
public interface PmsUserDao extends BaseDao<PmsUser> {

    /**
     * 根据用户登录名获取用户信息.
     * @return user .
     */
    PmsUser findByUserNo(String userNo);

}

