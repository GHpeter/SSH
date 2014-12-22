package com.ps.ssh.service.impl;

import java.util.List;

import com.ps.ssh.base.BaseService;
import com.ps.ssh.bean.TUser;
import com.ps.ssh.dao.IUserDao;
import com.ps.ssh.service.IUserService;

public class UserService extends BaseService implements IUserService{
    
    private IUserDao userDao;

    public List<TUser> getUsers() {
        return userDao.getUsers();
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

}
