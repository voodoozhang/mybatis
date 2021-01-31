package com.ithei.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String username;
    private Date birthday;
    private Integer id;
    private String address;
    private String sex;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", birthday=" + birthday +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
