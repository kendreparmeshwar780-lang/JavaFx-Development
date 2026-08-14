package com.core2web;

import com.core2web.view.user.FordModel;
import com.core2web.view.user.LoginPage;
import com.core2web.view.user.TwoWheelerManufacture;

import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Application.launch(FordModel.class,args);
    }
}