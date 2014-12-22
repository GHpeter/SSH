package com.ps.ssh.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ps.ssh.base.BaseDao;
import com.ps.ssh.bean.TUser;
import com.ps.ssh.dao.IUserDao;

public class UserDao extends BaseDao implements IUserDao{

    @SuppressWarnings("unchecked")
    public List<TUser> getUsers() {
         List<TUser> list = new ArrayList<TUser>();
         
         Session session =  this.getSession();
//         Query query = session.createQuery("from TUser");
         Query query = session.createSQLQuery("select * from t_user").addEntity(TUser.class);
         
         list = query.list();
         
         session.close();
         
        return list;
    }

}
