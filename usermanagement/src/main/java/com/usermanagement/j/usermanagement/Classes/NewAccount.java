package com.usermanagement.j.usermanagement.Classes;

public class NewAccount {
    private String username;
    private String password;
    private String surname;
    private String lastname;
    private String email;
    private String phone;
    private String birthday;
    private String companyId;
    public NewAccount(String username, String password, String surname, String lastname, String email, String phone,
            String birthday, String companyId) {
        this.username = username;
        this.password = password;
        this.surname = surname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.companyId = companyId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getBday() {
        return birthday;
    }
    public void setBday(String bday) {
        this.birthday = bday;
    }
    public String getCompanyId() {
        return companyId;
    }
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }


    public String toString(){
        return "->" + username + " " + password + " " + surname + " " + lastname + " " + email +  " " + phone + " " + birthday + " " + companyId;
    }
    
}
