package com.core2web.model;

public class AdminUser {

    String name;
    String email;
    int orders;
    String joined;
    String status;


    public AdminUser(String name,String email ,int orders,String joined,String status){
        this.name = name;
        this.email= email;
        this.orders=orders;
        this.joined=joined;
        this.status=status;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public int getOrders() {
        return orders;
    }


    public void setOrders(int orders) {
        this.orders = orders;
    }


    public String getJoined() {
        return joined;
    }


    public void setJoined(String joined) {
        this.joined = joined;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    


    
}
