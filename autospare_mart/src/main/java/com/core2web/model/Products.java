package com.core2web.model;

public class Products {
    String part;
    String partno;
    String condition;
    double price;
    int stock;

    public Products(){

    }
    public Products(String part,String partno,String condition,double price,int stock){
        this.part=part;
        this.partno=partno;
        this.condition=condition;
        this.price=price;
        this.stock=stock;
    }
    public String getPart() {
        return part;
    }
    public void setPart(String part) {
        this.part = part;
    }
    public String getPartno() {
        return partno;
    }
    public void setPartno(String partno) {
        this.partno = partno;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
