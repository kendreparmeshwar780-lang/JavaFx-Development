package com.core2web;

import com.core2web.view.user.LoginPage;

import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Application.launch(LoginPage.class,args);
    }
}