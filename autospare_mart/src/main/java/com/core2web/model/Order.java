package com.core2web.model;

public class Order {
    String order;
    String customer;
    int items;
    double price;
    String payment;
    String status;

    public Order(){

    }
    public Order(String order,String customer,int items,double price,String payment,String status){
            this.order=order;
            this.customer=customer;
            this.items=items;
            this.price=price;
            this.payment=payment;
            this.status=status;
    }
    public String getOrder() {
        return order;
    }
    public void setOrder(String order) {
        this.order = order;
    }
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public int getItems() {
        return items;
    }
    public void setItems(int items) {
        this.items = items;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getPayment() {
        return payment;
    }
    public void setPayment(String payment) {
        this.payment = payment;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    
}
