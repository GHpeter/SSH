package com.ps.ssh.action;

import java.util.List;

import com.ps.ssh.base.BaseAction;
import com.ps.ssh.bean.TUser;
import com.ps.ssh.service.IUserService;

public class UserAction extends BaseAction{
    
    private List<TUser> userList;
    
    private IUserService userService;
    
    public String getUsers(){
        userList = userService.getUsers();
        System.out.println(userList.size());
        return "getUsers";
    }

    public List<TUser> getUserList() {
        return userList;
    }

    public void setUserList(List<TUser> userList) {
        this.userList = userList;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

}
