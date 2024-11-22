package com.jobapplication.model;

public class References {

    public String name;
    public String title;
    public String company;
    public String phone;

    @Override
    public String toString() {
        return "References{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
