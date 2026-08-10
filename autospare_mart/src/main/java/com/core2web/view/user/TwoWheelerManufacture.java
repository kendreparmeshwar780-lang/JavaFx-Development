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

public class TwoWheelerManufacture {

    ScrollPane getTwoWheelerManufacturer(){

        Text text1 = new Text("Choose the Manufacturer");
        text1.setStyle("-fx-font-size: 36px; -fx-font-weight: bold; -fx-fill: black;");

        Text text2 = new Text("Select a Vehicle brand to view the compatible parts. ");
        text2.setStyle("-fx-font-size: 24px; -fx-fill: black;");

        TextField searchBar = new TextField();

        searchBar.setPromptText("Search Manufacturer...");
        searchBar.setPrefWidth(400);
        searchBar.setPrefHeight(45);
        
        Button searchButton = new Button("Search");


        
        Image heroimg = new Image("assets\\TwoWheeler loga\\Hero.png");
        ImageView heroImageView = new ImageView(heroimg);
        heroImageView.setFitWidth(250);
        heroImageView.setFitHeight(150);
        heroImageView.setPreserveRatio(true);


        Button heroButton = new Button();
        heroButton.setGraphic(heroImageView);
        heroButton.setText("Hero");
        heroButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        heroButton.setContentDisplay(ContentDisplay.TOP);
        heroButton.setGraphicTextGap(10);


        Image hondaimg = new Image("assets\\TwoWheeler loga\\Honda.png");
        ImageView hondaImageView = new ImageView(hondaimg);
        hondaImageView.setFitWidth(250);
        hondaImageView.setFitHeight(150);

        Button hondaButton = new Button();
        hondaButton.setGraphic(hondaImageView);
        hondaButton.setText("Honda");
        hondaButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        hondaButton.setContentDisplay(ContentDisplay.TOP);
        hondaButton.setGraphicTextGap(10);

        Image ktmimg = new Image("assets\\TwoWheeler loga\\KTM.png");
        ImageView ktmImageView = new ImageView(ktmimg);
        ktmImageView.setFitWidth(250);
        ktmImageView.setFitHeight(150);

        Button ktmButton = new Button();
        ktmButton.setGraphic(ktmImageView);
        ktmButton.setText("KTM");
        ktmButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        ktmButton.setContentDisplay(ContentDisplay.TOP);
        ktmButton.setGraphicTextGap(10);

        HBox hBox = new HBox(20,heroButton, hondaButton, ktmButton);
        
        hBox.setStyle("-fx-alignment: center;");


       Image bajajimg = new Image("assets\\TwoWheeler loga\\bajaj.png");
        ImageView bajajImageView = new ImageView(bajajimg);
        bajajImageView.setFitWidth(250);
        bajajImageView.setFitHeight(150);

        Button bajajButton = new Button();
        bajajButton.setGraphic(bajajImageView);
        bajajButton.setText("Bajaj");
        bajajButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        bajajButton.setContentDisplay(ContentDisplay.TOP);
        bajajButton.setGraphicTextGap(10);


        Image kawasakiimg = new Image("assets\\TwoWheeler loga\\kawasaki.png");
        ImageView kawasakiImageView = new ImageView(kawasakiimg);
        kawasakiImageView.setFitWidth(250);
        kawasakiImageView.setFitHeight(150);

        Button kawasakiButton = new Button();
        kawasakiButton.setGraphic(kawasakiImageView);
        kawasakiButton.setText("Kawasaki");
        kawasakiButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        kawasakiButton.setContentDisplay(ContentDisplay.TOP);
        kawasakiButton.setGraphicTextGap(10);

        Image vespaimg = new Image("assets\\TwoWheeler loga\\vespa.png");
        ImageView vespaImageView = new ImageView(vespaimg);
        vespaImageView.setFitWidth(250);
        vespaImageView.setFitHeight(150);

        Button vespaButton = new Button();
        vespaButton.setGraphic(vespaImageView);
        vespaButton.setText("Vespa");
        vespaButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        vespaButton.setContentDisplay(ContentDisplay.TOP);
        vespaButton.setGraphicTextGap(10);



        HBox hBox1 = new HBox(20,bajajButton, kawasakiButton,vespaButton);
        hBox1.setStyle("-fx-alignment: center;");


        Image suzukiimg = new Image("assets\\TwoWheeler loga\\suzuki.png");
        ImageView suzukiImageView = new ImageView(suzukiimg);
        suzukiImageView.setFitWidth(250);
        suzukiImageView.setFitHeight(150);

        Button suzukiButton = new Button();
        suzukiButton.setGraphic(suzukiImageView);
        suzukiButton.setText("Suzuki");
        suzukiButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        suzukiButton.setContentDisplay(ContentDisplay.TOP);
        suzukiButton.setGraphicTextGap(10);


        Image tvsimg = new Image("assets\\TwoWheeler loga\\tvs.png");
        ImageView tvsImageView = new ImageView(tvsimg);
        tvsImageView.setFitWidth(250);
        tvsImageView.setFitHeight(150);

        Button tvsButton = new Button();
        tvsButton.setGraphic(tvsImageView);
        tvsButton.setText("Tvs");
        tvsButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        tvsButton.setContentDisplay(ContentDisplay.TOP);
        tvsButton   .setGraphicTextGap(10);


        Image royalimg = new Image("assets\\TwoWheeler loga\\royal enfield.png");
        ImageView royalImageView = new ImageView(royalimg);
        royalImageView.setFitWidth(250);
        royalImageView.setFitHeight(150);

        Button royalButton = new Button();
        royalButton.setGraphic(royalImageView);
        royalButton.setText("Royal Enfield");
        royalButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
        royalButton.setContentDisplay(ContentDisplay.TOP);
        royalButton.setGraphicTextGap(10);

        HBox hBox2 = new HBox(20,suzukiButton, tvsButton,royalButton);
        hBox2.setStyle("-fx-alignment: center;");

        VBox vBox1 = new VBox( 20, hBox, hBox1,hBox2);
        

    


        VBox vbox = new VBox(20,text1, text2, searchBar, searchButton,vBox1);
        




        ScrollPane scrollpan = new ScrollPane(vbox);
        scrollpan.setFitToWidth(true);
        scrollpan.setFitToHeight(true);
        return scrollpan;
        
        
    }
    
}
