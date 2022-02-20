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

    
    public UserLogin(long userId, int companyId, String userName, String password) {
        this.userId = userId;
        this.companyId = companyId;
        this.userName = userName;
        this.password = password;
    }

    public UserLogin(int companyId, String userName, String password) {
        this.companyId = companyId;
        this.userName = userName;
        this.password = password;
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

    

}
