package com.usermanagement.j.usermanagement.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserLogin {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    private int companyId;

    private String userName;

    private String password;

    private int active;

    
    public UserLogin() {
    }

    public UserLogin(long userId, int companyId, String userName, String password, int active) {
        this.userId = userId;
        this.companyId = companyId;
        this.userName = userName;
        this.password = password;
        this.active =active;
    }

    public UserLogin(int companyId, String userName, String password, int active) {
        this.companyId = companyId;
        this.userName = userName;
        this.password = password;
        this.active =active;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

}
