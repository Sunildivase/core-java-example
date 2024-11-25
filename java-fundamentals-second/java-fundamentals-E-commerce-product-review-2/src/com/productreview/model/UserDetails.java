package com.productreview.model;

public class UserDetails {

    public int id;
    public String userName;
    public String address;

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
