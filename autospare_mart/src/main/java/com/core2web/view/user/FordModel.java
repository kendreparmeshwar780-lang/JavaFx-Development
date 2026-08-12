package com.core2web.view.user;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListView;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FordModel extends Application {
   // public BorderPane homBorderPane;
    public static Stage homeStage;

    @Override
    public void start(Stage stage)  {
        homeStage=stage;
        BorderPane borderpane = new BorderPane();
        borderpane.setStyle("-fx-background-color: #f0f0f0;");
       
        
        ListView <String> listview = new ListView<>();
        listview.getItems().addAll("Home");
        listview.setStyle("-fx-background-color: #ffffff; -fx-text-fill : #edeaea; -fx-font-size: 16px");

        borderpane.setLeft(listview);

        listview.setOnMouseClicked(event->{
            String selected_item = listview.getSelectionModel().getSelectedItem();

            System.out.println(selected_item);



            if(selected_item.equals("Home")){
                System.out.println("Home");
                Text txt1 = new Text("Select Your Model");
                txt1.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-fill: #7d1c1c;");
                txt1.setTranslateX(50);
                borderpane.setCenter(txt1);


                Image img1 = new Image("assets\\images\\sparepart\\car.jpeg");
                ImageView imageView1 = new ImageView(img1);
                imageView1.setFitWidth(250);
                imageView1.setPreserveRatio(true);

                Button btn1 = new Button();
                btn1.setGraphic(imageView1);
                btn1.setStyle("-fx-background-color: #ffffff; -fx-padding: 10px 20px; -fx-border-color: #cccccc; -fx-border-width: 1px; -fx-cursor: hand;");
                btn1.setText("F-150");
                btn1.setContentDisplay(ContentDisplay.TOP);
                

                btn1.setOnAction(e -> {
                   System.out.println("F-150 button clicked!");
                   SpareFord sp = new SpareFord();
                   borderpane.setCenter(sp.getfordpart());
                   


                   

                });

           
                VBox vb1 = new VBox(20, btn1);
                vb1.setAlignment(Pos.CENTER_LEFT);
                borderpane.setCenter(vb1);


                Image img2 = new Image("assets\\images\\sparepart\\mustang.jpeg");
                ImageView imageView2 = new ImageView(img2);
                imageView2.setFitWidth(250);
                imageView2.setPreserveRatio(true);

                Button btn2 = new Button();
                btn2.setGraphic(imageView2);
                btn2.setStyle("-fx-background-color: #ffffff; -fx-padding: 10px 20px; -fx-border-color: #cccccc; -fx-border-width: 1px; -fx-cursor: hand;");
                btn2.setText("mustang");
                btn2.setContentDisplay(ContentDisplay.TOP);
                btn2.setLineSpacing(10);

                btn2.setOnAction(e -> {
                   System.out.println("mustang button clicked!");
                   SpareMustang sm = new SpareMustang();
                   borderpane.setCenter(sm.getMustangtapart());
                   
                });
                VBox vb2 = new VBox(20, btn2);
                vb2.setAlignment(Pos.CENTER);
                borderpane.setCenter(vb2);


                Image img3 = new Image("assets\\images\\sparepart\\explorer.jpeg");
                ImageView imageView3 = new ImageView(img3);
                imageView3.setFitWidth(200);
                imageView3.setPreserveRatio(true);

                Button btn3 = new Button();
                btn3.setGraphic(imageView3);
                btn3.setStyle("-fx-background-color: #ffffff; -fx-padding: 10px 20px; -fx-border-color: #cccccc; -fx-border-width: 1px; -fx-cursor: hand;");
                btn3.setText("Explorer");
                btn3.setContentDisplay(ContentDisplay.TOP);
                btn3.setLineSpacing(10);

                btn3.setOnAction(e -> {
                   System.out.println("Explorer button clicked!");
                   SpareExplorer se = new SpareExplorer();
                   borderpane.setCenter(se.getExplorerpart());
                });


                VBox vb3 = new VBox(20, btn3);
                vb3.setAlignment(Pos.CENTER);
                borderpane.setCenter(vb3);
            

             /*   Button filterButton = new Button("Filter");
                filterButton.setStyle("-fx-background-color: #9b2f2f; -fx-text-fill: #ffffff; -fx-font-size: 16px;-fx-padding: 5px 5px; -fx-border-radius: 5px; -fx-cursor: hand;");
                filterButton.setOnAction(e -> {
                    System.out.println("Filter button clicked!");
                });
*/
                Image img4 = new Image("assets\\images\\sparepart\\car.jpeg");
                ImageView imageView4 = new ImageView(img4);
                imageView4.setFitWidth(250);
                imageView4.setPreserveRatio(true);

                Button btn4 = new Button();
                btn4.setGraphic(imageView4);
                btn4.setStyle("-fx-background-color: #ffffff; -fx-padding: 10px 20px; -fx-border-color: #cccccc; -fx-border-width: 1px; -fx-cursor: hand;");
                btn4.setText("Puma");
                btn4.setContentDisplay(ContentDisplay.TOP);
                btn4.setLineSpacing(10);

                btn4.setOnAction(e -> {
                   System.out.println("Explorer button clicked!");
                   Sparepuma spuma = new Sparepuma();
                   borderpane.setCenter(spuma.getpumapart());
                });
                btn4.setTranslateX(25);

                HBox hb1 = new HBox(txt1);
                //borderpane.setTop(hb1);

                HBox hb2 = new HBox(10, vb1, vb2,vb3);
                hb1.setAlignment(Pos.TOP_CENTER);
                borderpane.setCenter(hb2);

                HBox hb3 = new HBox(btn4);
               
                
                VBox vb = new VBox(20, hb1, hb2,hb3);
               // vb.setAlignment(Pos.CENTER_LEFT);
                borderpane.setCenter(vb);

                      
                    
            }else{
                System.out.println("model");
                
            }
        });

        
        Scene scene = new Scene(borderpane,1200,800);
        homeStage.setScene(scene);
        homeStage.setTitle("Homepage");
        homeStage.show();
    }

    
}
