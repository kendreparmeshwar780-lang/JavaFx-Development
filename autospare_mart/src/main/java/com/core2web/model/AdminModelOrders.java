package com.core2web.model;

public class AdminModelOrders {

    String orders;
    String customerName;
    String company;
    double value;
    String payment;

    public AdminModelOrders(String orders,String customerName,String company,double value,String payment){

        this.orders=orders;
        this.customerName=customerName;
        this.company=company;
        this.value=value;
        this.payment=payment;

    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    
    
}
