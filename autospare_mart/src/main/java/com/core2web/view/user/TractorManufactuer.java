package com.core2web.view;

import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class TractorManufactuer {

    ScrollPane getTractorManufacturer() {

        Text text1 = new Text("Choose the Manufacturer");
        text1.setStyle("-fx-font-size: 36px; -fx-font-weight: bold; -fx-fill: black;");
        
        Text text2 = new Text("Select a Vehicle brand to view the compatible parts. ");
        text2.setStyle("-fx-font-size: 24px; -fx-fill: black;");

        TextField searchBar = new TextField();
        searchBar.setPromptText("Search Manufacturer...");
        searchBar.setPrefWidth(400);
        searchBar.setPrefHeight(45);
        
        Button searchButton = new Button("Search");

       
        Image mahindraImg = new Image("assets//image//tractor image//Mahindra.png");
        ImageView mahindraImageView = new ImageView(mahindraImg);
        mahindraImageView.setFitWidth(250);
        mahindraImageView.setFitHeight(150);
        mahindraImageView.setPreserveRatio(true);

        Button mahindraButton = new Button();
        mahindraButton.setGraphic(mahindraImageView);
        mahindraButton.setText("Mahindra");
        mahindraButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        mahindraButton.setContentDisplay(ContentDisplay.TOP);
        mahindraButton.setGraphicTextGap(10);

       
        Image johnDeereImg = new Image("assets//image//tractor image//Mahindra.png");
        ImageView johnDeereImageView = new ImageView(johnDeereImg);
        johnDeereImageView.setFitWidth(250);
        johnDeereImageView.setFitHeight(150);
        johnDeereImageView.setPreserveRatio(true);

        Button johnDeereButton = new Button();
        johnDeereButton.setGraphic(johnDeereImageView);   
        johnDeereButton.setText("John Deere");
        johnDeereButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        johnDeereButton.setContentDisplay(ContentDisplay.TOP); 
        johnDeereButton.setGraphicTextGap(10);    

        
        Image sonalikaImg = new Image("assets//image//tractor image//Mahindra.png");
        ImageView sonalikaImageView = new ImageView(sonalikaImg);
        sonalikaImageView.setFitWidth(250);
        sonalikaImageView.setFitHeight(150);
        sonalikaImageView.setPreserveRatio(true);

        Button sonalikaButton = new Button();
        sonalikaButton.setGraphic(sonalikaImageView);
        sonalikaButton.setText("Sonalika");
        sonalikaButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        sonalikaButton.setContentDisplay(ContentDisplay.TOP);
        sonalikaButton.setGraphicTextGap(10);

        HBox hBox = new HBox(20, mahindraButton, johnDeereButton, sonalikaButton);
        hBox.setStyle("-fx-alignment: center;");

        Image newHollandImg = new Image("assets//image//tractor image//Mahindra.png");
        ImageView newHollandImagneView = new ImageView(newHollandImg);
        newHollandImagneView.setFitWidth(250);
        newHollandImagneView.setFitHeight(150);
        newHollandImagneView.setPreserveRatio(true);

        Button tafeButton = new Button();
        tafeButton.setGraphic(newHollandImagneView);
        tafeButton.setText("New Holland");
        tafeButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        tafeButton.setContentDisplay(ContentDisplay.TOP);
        tafeButton.setGraphicTextGap(10);

       
        Image kubotaImg = new Image("assets//image//tractor image//Mahindra.png");
        ImageView kubotaImageView = new ImageView(kubotaImg);
        kubotaImageView.setFitWidth(250);
        kubotaImageView.setFitHeight(150);
        kubotaImageView.setPreserveRatio(true);

        Button kubotaButton = new Button();
        kubotaButton.setGraphic(kubotaImageView);
        kubotaButton.setText("Kubota");
        kubotaButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        kubotaButton.setContentDisplay(ContentDisplay.TOP);
        kubotaButton.setGraphicTextGap(10);

        
        Image swarajImg = new Image("assets//image//tractor image//Mahindra.png");
        ImageView swarajImageView = new ImageView(swarajImg);
        swarajImageView.setFitWidth(250);
        swarajImageView.setFitHeight(150);
        swarajImageView.setPreserveRatio(true);

        Button swarajButton = new Button();
        swarajButton.setGraphic(swarajImageView);
        swarajButton.setText("Swaraj");
        swarajButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        swarajButton.setContentDisplay(ContentDisplay.TOP);
        swarajButton.setGraphicTextGap(10);

        HBox hBox1 = new HBox(20, tafeButton, kubotaButton, swarajButton);
        hBox1.setStyle("-fx-alignment: center;");


        VBox vBox1 = new VBox(20, hBox, hBox1);
        VBox vBox = new VBox(20, text1, text2, searchBar, searchButton, vBox1);

        ScrollPane scrollPane = new ScrollPane(vBox);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        return scrollPane;
    }
}