package com.core2web.view.user;

import com.core2web.model.Order;
import com.core2web.model.Products;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class CompanyLogin {

    private Scene companyLoginScene;

     Scene getCompanyLogin(Runnable callBackAction){

        BorderPane borderPane = new BorderPane();
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Products","Add Spare Parts","Orders","Sales Report","Reviews & Queries","Offers","Log Out");
        listView.setStyle("fx-background-color: #151A22; -fx-fill: white;-fx-font-size: 15px; -fx-font-weight: bold; -fx-padding: 15px; -fx-margin: 5px;  -fx-background-radius: 12px; -fx-border-radius: 12px; -fx-border-color: #252D3A;  -fx-border-width: 1px;");
        borderPane.setLeft(listView);

        


        listView.setOnMouseClicked(event ->{
        
            String selected_item = listView.getSelectionModel().getSelectedItem();

            System.out.println( selected_item);
        
        if(selected_item.equals("Products")){
        TableView<Products> tableView = new TableView<>();
        tableView.setStyle("-fx-background-color: transparent; -fx-border-color: white; -fx-border-width: 2px;");

        TableColumn<Products, String> partColumn = new TableColumn<>("PART");
        partColumn.setCellValueFactory(new PropertyValueFactory<>("part"));

        tableView.getColumns().add(partColumn);

        TableColumn<Products, String> partNoColumn = new TableColumn<>("PART_NO");
        partNoColumn.setCellValueFactory(new PropertyValueFactory<>("partno"));

        tableView.getColumns().add(partNoColumn);

        TableColumn<Products, String> conditionColumn = new TableColumn<>("CONDITION");
        conditionColumn.setPrefWidth(250);
        conditionColumn.setCellValueFactory(new PropertyValueFactory<>("condition"));
        tableView.getColumns().add(conditionColumn);

        TableColumn<Products, Double> priceColumn = new TableColumn<>("PRICE");
        priceColumn.setPrefWidth(250);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        tableView.getColumns().add(priceColumn);

        TableColumn<Products, Integer> stockColumn = new TableColumn<>("STOCK");
        stockColumn.setPrefWidth(250);
        stockColumn.setCellValueFactory(new PropertyValueFactory<>("stock"));
         

        tableView.getColumns().add(stockColumn);

        tableView.getItems().addAll(
            new Products("Brake","HON-345","New",3567.89,25),
            new Products("Brake","HON-345","New",903.56,25), 
            new Products("Brake","HON-345","New",3567.90,25)
            );

            tableView.setOnMouseClicked(e->{
                Products selectedProducts=tableView.getSelectionModel().getSelectedItem();

                System.out.println(selectedProducts.getPart());
            }

            );

            

            borderPane.setCenter(tableView);
        } else if(selected_item.equals("Add Spare Parts")){
            Text text1 = new Text("Part name");
            text1.setStyle("-fx-fill:black");

            TextField textfield1 = new TextField();
            textfield1.setPromptText("Front Brake Pad Set");

            

            Text text2 = new Text("Part number");
            text1.setStyle("-fx-fill:black");

            TextField textfield2 = new TextField();
            textfield2.setPromptText("HON-4521");

           


            Text text3 = new Text("Part name");
            text3.setStyle("-fx-fill:black");

            TextField textfield3 = new TextField();
            textfield3.setPromptText("Brakes");

            Text text4 = new Text("Price");
            text4.setStyle("-fx-fill:black");

            TextField textfield4 = new TextField();
            textfield4.setPromptText("1234");

            Text text5 = new Text("Stock");
            text5.setStyle("-fx-fill:black");

            TextField textfield5 = new TextField();
            textfield5.setPromptText("25");

            Text text6 = new Text("Part name");
            text6.setStyle("-fx-fill:black");

            TextField textfield6 = new TextField();
            textfield6.setPromptText("Front Brake Pad Set");

            Text text7 = new Text("Description");
            text7.setStyle("-fx-fill:black");

            TextArea textArea1 = new TextArea();
            textArea1.setPromptText("OEM-grade replacement part..");
            textArea1.setStyle("-fx-background-color:white;-fx-padding:20px 40px");


            Text text8 = new Text("Compatible Models");
            text8.setStyle("-fx-fill:black");

            TextArea textArea2 = new TextArea();
            textArea2.setPromptText("Honda City,Honda Amaze[2016-2024]");
            textArea2.setStyle("-fx-background-color:white;-fx-padding:20px 40px");


            VBox vbox1 = new VBox(5,text1,textfield1);
            HBox hbox1 = new HBox(vbox1);
            VBox vbox2 = new VBox(5,text2,textfield2);
            HBox hbox2 = new HBox(vbox2);


            VBox vbox3 = new VBox(5,text3,textfield3);
            HBox hbox3 = new HBox(vbox3);

            VBox vbox4 = new VBox(5,text4,textfield4);
            HBox hbox4 = new HBox(vbox4);

            VBox vbox5 = new VBox(5,text5,textfield5);
            HBox hbox5 = new HBox(vbox5);

            VBox vbox6 = new VBox(5,text6,textfield6);
            HBox hbox6 = new HBox(vbox6);

            VBox vbox7 = new VBox(5,text7,textArea1);
            HBox hbox7 = new HBox(vbox7);

            VBox vbox8 = new VBox(5,text8,textArea2);
            HBox hbox8 = new HBox(vbox8);

            Button approvalButton = new Button("Submit to approval");
            approvalButton.setStyle("-fx-background-color:red");
            

            

            VBox vbox9 = new VBox(20,hbox1,hbox2,hbox3,hbox4,hbox5,hbox6,hbox7,hbox8,approvalButton);

            borderPane.setCenter(vbox9);

        }else if(selected_item.equals("Orders")){
            
        TableView<Order> tableView = new TableView<>();
        tableView.setStyle("-fx-background-color: transparent; -fx-border-color: white; -fx-border-width: 2px;");

        TableColumn<Order, String> orderColumn = new TableColumn<>("ORDER");
        orderColumn.setCellValueFactory(new PropertyValueFactory<>("order"));

        tableView.getColumns().add(orderColumn);

        TableColumn<Order, String> customerColumn = new TableColumn<>("CUSTOMER");
        customerColumn.setCellValueFactory(new PropertyValueFactory<>("customer"));

        tableView.getColumns().add(customerColumn);

        TableColumn<Order, Integer> itemsColumn = new TableColumn<>("ITEMS");
        itemsColumn.setPrefWidth(250);
        itemsColumn.setCellValueFactory(new PropertyValueFactory<>("items"));
        tableView.getColumns().add(itemsColumn);

        TableColumn<Order, Double> valueColumn = new TableColumn<>("VALUE");
        valueColumn.setPrefWidth(250);
        valueColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        tableView.getColumns().add(valueColumn);

        TableColumn<Order, String> paymentColumn = new TableColumn<>("PAYMENT");
        paymentColumn.setPrefWidth(250);
        paymentColumn.setCellValueFactory(new PropertyValueFactory<>("payment"));
        tableView.getColumns().add(paymentColumn);


        TableColumn<Order, String> statusColumn = new TableColumn<>("STATUS");
        statusColumn.setPrefWidth(250);
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        tableView.getColumns().add(statusColumn);

         
         

        tableView.getColumns().add(paymentColumn);

        tableView.getItems().addAll(
            new Order("ASM-90142","OMKAR KADAM",10,3567.89,"Prepaid","Dispatched"),
            new Order("ASM-90142","OMKAR KADAM",1,3567.89,"Prepaid","Dispatched"), 
            new Order("ASM-90142","OMKAR KADAM",1,3567.89,"Prepaid","Dispatched")
            );

            tableView.setOnMouseClicked(e->{
                Order selectedProducts=tableView.getSelectionModel().getSelectedItem();

                System.out.println(selectedProducts.getOrder());
            }

            );

            

            borderPane.setCenter(tableView);
        }else if(selected_item.equals("Sales Report")){

        }else if(selected_item.equals("Reviews & Queries")){

        }else if(selected_item.equals("Offers")){
            Text text1 = new Text("CREATE AN OFFER");
            text1.setStyle("-fx-fill:black;-fx-weight:bold");

            Text text2 = new Text("CREATE AN OFFER");
            text2.setStyle("-fx-fill:black");

            TextField textfield1 = new TextField();
            textfield1.setPromptText("MOKJL12345");

            
            Text text3 = new Text("Discount %");
            text3.setStyle("-fx-fill:black");

            TextField textfield2 = new TextField();
            textfield2.setPromptText("20");

           
            Text text4 = new Text("RUNNING OFFERS");
            text4.setStyle("-fx-fill:black");

            

            Text text5 = new Text("MONSOON20");
            text5.setStyle("-fx-fill:black;-fx-weight:bold;-fx-text-size:10px");

            

            Text text6= new Text("20% off all filters · ends 31 Aug");
            text6.setStyle("-fx-fill:black");

            VBox vbox1 = new  VBox(5,text2,textfield1);

            VBox vbox2 = new VBox(5,text3,textfield2);

            VBox vbox3 = new VBox(8,text1,vbox1,vbox2);

            VBox vbox4 = new VBox(2,text5,text6);
            VBox vbox5 = new VBox(text4,vbox4);

            HBox hbox1 = new HBox(10,vbox3,vbox5);
            borderPane.setCenter(hbox1);



        }else if(selected_item.equals("Log Out")){
            callBackAction.run();
        }


          
        });
        

        

            
        


        Scene scene = new Scene(borderPane,1000,800);
        companyLoginScene=scene;

        return companyLoginScene;
        

        


    }
    
}

    
    

