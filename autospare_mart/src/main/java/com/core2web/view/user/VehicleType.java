package com.core2web.view.user;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class VehicleType {
     //private Scene vehicleTypeScene;

    
        Scene getVehicleTypeScene(Runnable callBackAction) {

        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color:  ");


        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Home", "Vehicle Type","Log Out");
        borderPane.setLeft(listView);
        listView.setStyle("-fx-text-fill: white; -fx-font-size: 16px; -fx-background-color: transparent;");


        listView.setOnMouseClicked(event -> {
            String selected_item = listView.getSelectionModel().getSelectedItem();

            System.out.println(selected_item);

            if (selected_item.equals("Vehicle Type")) {
                Text t2 = new Text("Selected Your Vehicle Category");
                t2.setStyle("-fx-font-size: 36px; -fx-font-weight: bold; -fx-fill: black;");
                

                Text t3 = new Text("Choose the type of vehicle to view  the compatible high performance spare parts and filament data");
                t3.setStyle("-fx-font-size: 24px; -fx-fill: black;");



                Image twoWheelerimg = new Image("assets//images//company icons//Two Wheeler icons//BMW logo.jpeg");
                ImageView twoWheelerImageView = new ImageView(twoWheelerimg);
                twoWheelerImageView.setFitWidth(300);
                twoWheelerImageView.setFitHeight(300);

                Button twoWheelerbButton = new Button();
                twoWheelerbButton.setGraphic(twoWheelerImageView);
                twoWheelerbButton.setText("Two Wheeler");
                twoWheelerbButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
                twoWheelerbButton.setContentDisplay(ContentDisplay.TOP);
                twoWheelerbButton.setGraphicTextGap(10);

                twoWheelerbButton.setOnAction(e->{
                    TwoWheelerManufacture manufacturer = new TwoWheelerManufacture();

                    ScrollPane manufacturerPage = manufacturer.getTwoWheelerManufacturer();

                    borderPane.setCenter(manufacturerPage);

                });


                Image fourWheelerimg = new Image("assets//images//company icons//Two Wheeler icons//BMW logo.jpeg");
                ImageView fourWheelerImageView = new ImageView(fourWheelerimg);
                fourWheelerImageView.setFitWidth(300);
                fourWheelerImageView.setFitHeight(300);

                Button fourWheelerButton = new Button();
                fourWheelerButton.setGraphic(fourWheelerImageView);
                fourWheelerButton.setText("Four Wheeler");
                fourWheelerButton.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-padding: 20px 30px;");
                fourWheelerButton.setContentDisplay(ContentDisplay.TOP);
                fourWheelerButton.setGraphicTextGap(10);

                fourWheelerButton.setOnAction(e->{
                    FourWheelerManufacturer manufacturer = new FourWheelerManufacturer();

                    ScrollPane manufacturerPage = manufacturer.getFourWheelerManufacturer();

                    borderPane.setCenter(manufacturerPage);



                });
                    


                 
            



                Image truckWheelerimg = new Image("assets//images//company icons//Two Wheeler icons//BMW logo.jpeg");
                ImageView truckWheelerImageView = new ImageView(truckWheelerimg);
                truckWheelerImageView.setFitWidth(300);
                truckWheelerImageView.setFitHeight(300);

                Button truckWheelerbButton = new Button();
                truckWheelerbButton.setGraphic(truckWheelerImageView);
                truckWheelerbButton.setText("Truck");
                truckWheelerbButton.setStyle( "-fx-font-size: 24px;" +"-fx-font-weight: bold;" +"-fx-padding: 20px 30px;");

                truckWheelerbButton.setContentDisplay(ContentDisplay.TOP);
                truckWheelerbButton.setGraphicTextGap(10);
               


                HBox hbox = new HBox(20, twoWheelerbButton, fourWheelerButton, truckWheelerbButton);
               

                VBox vbox = new VBox(20, t2, t3, hbox);
                vbox.setAlignment(Pos.CENTER_LEFT);

                borderPane.setCenter(vbox);


                }else if(selected_item.equals("Log Out")){
                    callBackAction.run();
                }


        });



        
        Scene scene = new Scene(borderPane,1500,800);
        
        return scene;
    }
    
    
}
