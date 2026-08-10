package com.core2web.view.user;


import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class FourWheelerManufacturer {
    

    ScrollPane getFourWheelerManufacturer(){

        Text text1 = new Text("Choose the Manufacturer");
        text1.setStyle("-fx-font-size: 36px; -fx-font-weight: bold; -fx-fill: black;");
        
        Text text2 = new Text("Select a Vehicle brand to view the compatible parts. ");
        text2.setStyle("-fx-font-size: 24px; -fx-fill: black;");

        TextField searchBar = new TextField();

        searchBar.setPromptText("Search Manufacturer...");
        searchBar.setPrefWidth(400);
        searchBar.setPrefHeight(45);
        
        Button searchButton = new Button("Search");


        Image fordimg = new Image("assets\\image\\ford logo.png");
        ImageView fordImageView = new ImageView(fordimg);
        fordImageView.setFitWidth(250);
        fordImageView.setFitHeight(150);
        fordImageView.setPreserveRatio(true);


        Button fordButton = new Button();
        fordButton.setGraphic(fordImageView);
        fordButton.setText("Ford");
        fordButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        fordButton.setContentDisplay(ContentDisplay.TOP);
        fordButton.setGraphicTextGap(10);


        Image toyotaimg = new Image("assets\\image\\Toyota logo.png");
        ImageView toyotaImageView = new ImageView(toyotaimg);
        toyotaImageView.setFitWidth(250);
        toyotaImageView.setFitHeight(150);

        Button toyotaButton = new Button();
        toyotaButton.setGraphic(toyotaImageView);   
        toyotaButton.setText("Toyota");
        toyotaButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        toyotaButton.setContentDisplay(ContentDisplay.TOP); 
        toyotaButton.setGraphicTextGap(10);    



        Image hondaimg = new Image("assets\\image\\Honda.png");
        ImageView hondaImageView = new ImageView(hondaimg);
        hondaImageView.setFitWidth(250);
        hondaImageView.setFitHeight(150);

        Button hondaButton = new Button();
        hondaButton.setGraphic(hondaImageView);
        hondaButton.setText("Honda");
        hondaButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        hondaButton.setContentDisplay(ContentDisplay.TOP);
        hondaButton.setGraphicTextGap(10);

        HBox hBox = new HBox(20,fordButton, toyotaButton, hondaButton);
        
        hBox.setStyle("-fx-alignment: center;");


        Image bmwimg = new Image("assets\\image\\BMW logo.png");
        ImageView bmwImageView = new ImageView(bmwimg);
        bmwImageView.setFitWidth(250);
        bmwImageView.setFitHeight(150);

        Button bmwButton = new Button();
        bmwButton.setGraphic(bmwImageView);
        bmwButton.setText("BMW");
        bmwButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        bmwButton.setContentDisplay(ContentDisplay.TOP);
        bmwButton.setGraphicTextGap(10);


        Image chevroletimg = new Image("assets\\image\\chevrolet logo.png");
        ImageView chevroletImageView = new ImageView(chevroletimg);
        chevroletImageView.setFitWidth(250);
        chevroletImageView.setFitHeight(150);

        Button chevroletButton = new Button();
        chevroletButton.setGraphic(chevroletImageView);
        chevroletButton.setText("Chevrolet");
        chevroletButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        chevroletButton.setContentDisplay(ContentDisplay.TOP);
        chevroletButton.setGraphicTextGap(10);

        Image mercedesimg = new Image("assets\\image\\mercedes.png");
        ImageView mercedesImageView = new ImageView(mercedesimg);
        mercedesImageView.setFitWidth(250);
        mercedesImageView.setFitHeight(150);

        Button mercedesButton = new Button();
        mercedesButton.setGraphic(mercedesImageView);
        mercedesButton.setText("Mercedes");
        mercedesButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        mercedesButton.setContentDisplay(ContentDisplay.TOP);
        mercedesButton.setGraphicTextGap(10);



        HBox hBox1 = new HBox(20,bmwButton, chevroletButton,mercedesButton);
        hBox1.setStyle("-fx-alignment: center;");


        Image tataimg = new Image("assets\\image\\tata logo.png");
        ImageView tataImageView = new ImageView(tataimg);
        tataImageView.setFitWidth(250);
        tataImageView.setFitHeight(150);

        Button tataButton = new Button();
        tataButton.setGraphic(tataImageView);
        tataButton.setText("Tata");
        tataButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        tataButton.setContentDisplay(ContentDisplay.TOP);
        tataButton.setGraphicTextGap(10);


        Image mahindraimg = new Image("assets\\image\\mahindralogo.png");
        ImageView mahindraImageView = new ImageView(mahindraimg);
        mahindraImageView.setFitWidth(250);
        mahindraImageView.setFitHeight(150);

        Button mahindraButton = new Button();
        mahindraButton.setGraphic(mahindraImageView);
        mahindraButton.setText("Mahindra");
        mahindraButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        mahindraButton.setContentDisplay(ContentDisplay.TOP);
        mahindraButton.setGraphicTextGap(10);


        Image audiimg = new Image("assets\\image\\Audi logo.png");
        ImageView audiImageView = new ImageView(audiimg);
        audiImageView.setFitWidth(250);
        audiImageView.setFitHeight(150);

        Button audiButton = new Button();
        audiButton.setGraphic(audiImageView);
        audiButton.setText("Audi");
        audiButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        audiButton.setContentDisplay(ContentDisplay.TOP);
        audiButton.setGraphicTextGap(10);

        HBox hBox2 = new HBox(20,tataButton, mahindraButton,audiButton);
        hBox2.setStyle("-fx-alignment: center;");

        VBox vBox1 = new VBox( 20, hBox, hBox1, hBox2);


        VBox vBox = new VBox( 20, text1, text2, searchBar, searchButton,vBox1);


        ScrollPane scrollPane = new ScrollPane(vBox);

        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        
        
        return scrollPane;
    }


    
}
