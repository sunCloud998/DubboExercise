package com.sfy.facade.user.service.impl;

import com.sfy.common.page.PageBean;
import com.sfy.common.page.PageParam;
import com.sfy.facade.user.entity.PmsUser;
import com.sfy.facade.user.service.PmsUserFacade;
import com.sfy.service.user.biz.PmsUserBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Description: PmsUserFacadeImpl.java
 * @Date: 2016/04/12
 * @Author: sunfayun
 * @Version: 1.0
 */
@Service("pmsUserFacade")
public class PmsUserFacadeImpl implements PmsUserFacade {
    @Autowired
    private PmsUserBiz pmsUserBiz;

    /**
     * 保存用户信息.
     * @param pmsUser
     */
    public void create(PmsUser pmsUser) {
        pmsUserBiz.create(pmsUser);
    }

    /**
     * 根据ID获取用户信息.
     * @param userId
     * @return
     */
    public PmsUser getById(Long userId) {
        return pmsUserBiz.getById(userId);
    }

    /**
     * 根据登录名取得用户对象
     */
    public PmsUser findUserByUserNo(String userNo) {
        return pmsUserBiz.findUserByUserNo(userNo);
    }

    /**
     * 根据ID删除一个用户，同时删除与该用户关联的角色关联信息. type="1"的超级管理员不能删除.
     *
     * @param userId
     *            用户ID.
     */
    public void deleteUserById(long userId) {
        pmsUserBiz.deleteUserById(userId);
    }


    /**
     * 更新用户信息.
     * @param user
     */
    public void update(PmsUser user) {
        pmsUserBiz.update(user);
    }

    /**
     * 根据用户ID更新用户密码.
     *
     * @param userId
     * @param newPwd
     *            (已进行SHA1加密)
     */
    public void updateUserPwd(Long userId, String newPwd, boolean isTrue) {
        pmsUserBiz.updateUserPwd(userId, newPwd, isTrue);
    }



    /**
     * 查询并分页列出用户信息.
     * @param pageParam
     * @param paramMap
     * @return
     */
    public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
        return pmsUserBiz.listPage(pageParam, paramMap);
    }
}
