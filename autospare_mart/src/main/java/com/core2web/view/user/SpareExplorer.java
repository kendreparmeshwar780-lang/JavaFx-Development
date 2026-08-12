package com.core2web.view.user;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SpareExplorer {
     private BorderPane homebBorderPane;
     BorderPane getExplorerpart() {
        Label l1 = new Label("Spare Parts of 2026 Ford Explorer");
        l1.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #7d1c1c;");
        l1.setAlignment(Pos.CENTER);

        Image img1 = new Image("assets\\images\\sparepart\\starter motor.jpeg");
        ImageView imageView1 = new ImageView(img1);
        imageView1.setFitWidth(200);
        imageView1.setFitHeight(200);

        Button btn1 = new Button("ADD TO CART");
        btn1.setStyle("-fx-background-color: #7d1c1c; -fx-text-fill: #ffffff; -fx-font-size: 16px; -fx-padding: 5px 10px; -fx-border-radius: 5px; -fx-cursor: hand;");

        btn1.setOnAction(event->{
            System.out.println("add button clicked");

        });
        

        //2

        Image img2 = new Image("assets\\images\\sparepart\\spark plug.jpeg");
        ImageView imageView2 = new ImageView(img2);
        imageView2.setFitWidth(200);
        imageView2.setFitHeight(200);


        Button btn2 = new Button("ADD TO CART");
        btn2.setStyle("-fx-background-color: #7d1c1c; -fx-text-fill: #ffffff; -fx-font-size: 16px; -fx-padding: 5px 10px; -fx-border-radius: 5px; -fx-cursor: hand;");

        btn2.setOnAction(event->{
            System.out.println("add button clicked");

        });

        //3

        Image img3 = new Image("assets\\images\\sparepart\\windshield.jpeg");
        ImageView imageView3 = new ImageView(img3);
        imageView3.setFitWidth(200);
        imageView3.setFitHeight(200);


        Button btn3 = new Button("ADD TO CART");
        btn3.setStyle("-fx-background-color: #ac2626; -fx-text-fill: #f1e1e1; -fx-font-size: 16px; -fx-padding: 5px 10px; -fx-border-radius: 5px; -fx-cursor: hand;");
       

        btn3.setOnAction(event->{
            System.out.println("add button clicked");

        });


        Image img4 = new Image("assets\\images\\sparepart\\hood.jpeg");
        ImageView imageView4 = new ImageView(img4);
        imageView4.setFitWidth(200);
        imageView4.setFitHeight(200);


        Button btn4 = new Button("ADD TO CART");
        btn4.setStyle("-fx-background-color: #ac2626; -fx-text-fill: #f1e1e1; -fx-font-size: 16px; -fx-padding: 5px 10px; -fx-border-radius: 5px; -fx-cursor: hand;");
       

        btn4.setOnAction(event->{
            System.out.println("add button clicked");

        });

         Image img5 = new Image("assets\\images\\sparepart\\bumper.jpeg");
        ImageView imageView5 = new ImageView(img5);
        imageView5.setFitWidth(200);
        imageView5.setFitHeight(200);


        Button btn5 = new Button("ADD TO CART");
        btn5.setStyle("-fx-background-color: #f01111; -fx-text-fill: #c7c2c2; -fx-font-size: 16px; -fx-padding: 5px 10px; -fx-border-radius: 5px; -fx-cursor: hand;");
       

        btn5.setOnAction(event->{
            System.out.println("add button clicked");

        });

        Image img6 = new Image("assets\\images\\sparepart\\bumper.jpeg");
        ImageView imageView6 = new ImageView(img6);
        imageView6.setFitWidth(200);
        imageView6.setFitHeight(200);


        Button btn6 = new Button("ADD TO CART");
        btn4.setStyle("-fx-background-color: #7b0e0e; -fx-text-fill: #d9d6d6; -fx-font-size: 16px; -fx-padding: 5px 10px; -fx-border-radius: 5px; -fx-cursor: hand;");
       

        btn6.setOnAction(event->{
            System.out.println("add button clicked");

        });

        Image img7 = new Image("assets\\images\\sparepart\\bumper.jpeg");
        ImageView imageView7 = new ImageView(img7);
        imageView7.setFitWidth(200);
        imageView7.setFitHeight(200);


        Button btn7 = new Button("ADD TO CART");
        btn7.setStyle("-fx-background-color: #e12d2d; -fx-text-fill: #dad3d3; -fx-font-size: 16px; -fx-padding: 5px 10px; -fx-border-radius: 5px; -fx-cursor: hand;");
       

        btn7.setOnAction(event->{
            System.out.println("add button clicked");

        });

        Image img8 = new Image("assets\\images\\sparepart\\bumper.jpeg");
        ImageView imageView8 = new ImageView(img8);
        imageView8.setFitWidth(200);
        imageView8.setFitHeight(200);


        Button btn8 = new Button("ADD TO CART");
        btn8.setStyle("-fx-background-color: #ac2626; -fx-text-fill: #d8d2d2; -fx-font-size: 16px; -fx-padding: 5px 10px; -fx-border-radius: 5px; -fx-cursor: hand;");
       

        btn8.setOnAction(event->{
            System.out.println("add button clicked");

        });

        HBox hb1 = new HBox(btn1);
        hb1.setAlignment(Pos.CENTER);
        VBox vb1 = new VBox(10,imageView1,hb1);
        vb1.setAlignment(Pos.TOP_LEFT);
      
        

        HBox hb2 = new HBox(btn2);
        hb2.setAlignment(Pos.CENTER);
        VBox vb2 = new VBox(10,imageView2,hb2);
        vb2.setAlignment(Pos.TOP_LEFT);

        HBox hb3 = new HBox(btn3);
        hb3.setAlignment(Pos.CENTER);
        VBox vb3 = new VBox(10,imageView3,hb3);
        vb3.setAlignment(Pos.TOP_LEFT);

        HBox hb4 = new HBox(btn4);
        hb4.setAlignment(Pos.CENTER);
        VBox vb4 = new VBox(10,imageView4,hb4);
        vb4.setAlignment(Pos.TOP_LEFT);

        HBox hb5 = new HBox(btn5);
        hb5.setAlignment(Pos.CENTER);
        VBox vb5 = new VBox(10,imageView5,hb5);
        vb5.setAlignment(Pos.TOP_LEFT);

        HBox hb6 = new HBox(btn6);
        hb6.setAlignment(Pos.CENTER);
        VBox vb6 = new VBox(10,imageView6,hb6);
        vb6.setAlignment(Pos.TOP_LEFT);

        HBox hb7 = new HBox(btn7);
        hb7.setAlignment(Pos.CENTER);
        VBox vb7 = new VBox(10,imageView7,hb7);
        vb7.setAlignment(Pos.TOP_LEFT);

        HBox hb8 = new HBox(btn5);
        hb8.setAlignment(Pos.CENTER);
        VBox vb8 = new VBox(10,imageView8,hb8);
        vb8.setAlignment(Pos.TOP_LEFT);

        HBox hb11 = new HBox(30,vb5,vb6,vb7,vb8);

        HBox hb = new HBox(30,vb1,vb2,vb3,vb4);

        VBox vb = new VBox(20,l1,hb,hb11);
        vb.setAlignment(Pos.TOP_LEFT);
        
        BorderPane borderpane = new BorderPane(vb);
        homebBorderPane=borderpane;
        return homebBorderPane;
    }

}
