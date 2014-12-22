package com.ps.ssh.bean;

import javax.persistence.Table;

import org.hibernate.annotations.Entity;

/**
 * TUser entity. @author MyEclipse Persistence Tools
 */
public class TUser implements java.io.Serializable {

    // Fields

    private static final long serialVersionUID = 1L;
    private Integer userId;
    private String userName;
    private String userNickname;
    private String userPwd;
    private String userEmail;
    private String userPhone;
    private Integer userState;
    private Integer userRole;
    private Integer userType;
    private Integer userFansCount;
    private Integer userAttentCount;
    private Long userRegisterTime;

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickname() {
        return this.userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserPwd() {
        return this.userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return this.userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getUserState() {
        return this.userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public Integer getUserRole() {
        return this.userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public Integer getUserType() {
        return this.userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserFansCount() {
        return this.userFansCount;
    }

    public void setUserFansCount(Integer userFansCount) {
        this.userFansCount = userFansCount;
    }

    public Integer getUserAttentCount() {
        return this.userAttentCount;
    }

    public void setUserAttentCount(Integer userAttentCount) {
        this.userAttentCount = userAttentCount;
    }

    public Long getUserRegisterTime() {
        return this.userRegisterTime;
    }

    public void setUserRegisterTime(Long userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

}