package com.core2web.model;

public class AdminModelCompany {

    String companyname;
    String city;
    int listing;
    String documents;
    String status;

    public AdminModelCompany(String companyname,
            String city,
            int listing,
            String documents,
            String status) {


                this.companyname=companyname;
                this.city= city;
                this.listing=listing;
                this.documents=documents;
                this.status=status;

    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getListing() {
        return listing;
    }

    public void setListing(int listing) {
        this.listing = listing;
    }

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

}
