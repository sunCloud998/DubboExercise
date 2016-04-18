package com.sfy.service.user.dao.impl;

import com.sfy.common.core.dao.BaseDaoImpl;
import com.sfy.facade.user.entity.PmsUser;
import com.sfy.service.user.dao.PmsUserDao;
import org.springframework.stereotype.Repository;

/**
 * @Description: PmsUserDaoImpl.java
 * @Date: 2016/04/12
 * @Author: sunfayun
 * @Version: 1.0
 */
@Repository("pmsUserDao")
public class PmsUserDaoImpl extends BaseDaoImpl<PmsUser> implements PmsUserDao {

    /**
     * 根据用户登录名获取用户信息.
     * @return user .
     */

    public PmsUser findByUserNo(String userNo) {
        return super.getSqlSession().selectOne(getStatement("findByUserNo"), userNo);
    }

}
