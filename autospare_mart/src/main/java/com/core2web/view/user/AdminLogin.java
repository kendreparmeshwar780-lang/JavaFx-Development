package com.core2web.view.user;

import java.util.Collection;

import com.core2web.model.AdminModelCompany;
import com.core2web.model.AdminModelOrders;
import com.core2web.model.AdminUser;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AdminLogin {
        private Scene adminLoginScene;

        Scene getAdminLogin() {

                VBox vbox = new VBox();

                BorderPane borderPane = new BorderPane();
                borderPane.setStyle("-fx-background-color:  ");

                ListView<String> listView = new ListView<>();
                listView.getItems().addAll("Users", "Companies", "Product Approvals ", "Orders", "Complaints",
                                "Reviews",
                                "Notification");
                borderPane.setLeft(listView);
                listView.setStyle("-fx-text-fill: white; -fx-font-size: 16px; -fx-background-color: transpar;");

                listView.setOnMouseClicked(event -> {
                        String selected_item = listView.getSelectionModel().getSelectedItem();

                        System.out.println(selected_item);

                        if (selected_item.equals("Users")) {
                                System.out.println("user button clicked");

                                TableView<AdminUser> tableView = new TableView<>();
                                tableView
                                                .setStyle("-fx-background-color: transparent; -fx-border-color: white; -fx-border-width: 2px;");
                                tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

                                TableColumn<AdminUser, String> nameColumn = new TableColumn<>("Name");
                                nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

                                tableView.getColumns().add(nameColumn);

                                TableColumn<AdminUser, String> emailColumn = new TableColumn<>("Email");
                                emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

                                tableView.getColumns().add(emailColumn);

                                TableColumn<AdminUser, Integer> orderColumn = new TableColumn<>("Order");

                                orderColumn.setCellValueFactory(new PropertyValueFactory<>("order"));
                                tableView.getColumns().add(orderColumn);

                                TableColumn<AdminUser, String> joinedColumn = new TableColumn<>("Joined");
                                joinedColumn.setCellValueFactory(new PropertyValueFactory<>("joined"));

                                tableView.getColumns().add(joinedColumn);

                                TableColumn<AdminUser, String> statusColumn = new TableColumn<>("Status");
                                statusColumn.setCellValueFactory(new PropertyValueFactory<>("Status"));
                                tableView.getColumns().add(statusColumn);

                                TableColumn<AdminUser, String> actionColumn = new TableColumn<>("Action");
                                actionColumn.setCellValueFactory(new PropertyValueFactory<>("action"));
                                tableView.getColumns().add(actionColumn);

                                tableView.getItems().addAll(
                                                new AdminUser("Krushna", "Krushna@gmail.com", 13, "14 May", "Active"),
                                                new AdminUser("Amit", "amit@gmail.com", 4, "13june", "Active"),
                                                new AdminUser("pankaj", "pankaj@gmail.com", 024, "13 feb", "Active"),
                                                new AdminUser("omkar", "omkar@gmail.com", 12, "13 feb", "DeActive"));

                                borderPane.setCenter(tableView);

                        } else if (selected_item.equals("Companies")) {
                                TableView<AdminModelCompany> tableView = new TableView<>();
                                tableView
                                                .setStyle("-fx-background-color: transparent; -fx-border-color: white; -fx-border-width: 2px;");
                                tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

                                TableColumn<AdminModelCompany, String> companyNameColumn = new TableColumn<>(
                                                "Company Name");
                                companyNameColumn.setCellValueFactory(new PropertyValueFactory<>("companyname"));

                                TableColumn<AdminModelCompany, String> cityColumn = new TableColumn<>("City");

                                cityColumn.setCellValueFactory(new PropertyValueFactory<>("city"));

                                TableColumn<AdminModelCompany, Integer> listingColumn = new TableColumn<>("Listing");
                                listingColumn.setCellValueFactory(new PropertyValueFactory<>("listing"));

                                TableColumn<AdminModelCompany, String> documentsColumn = new TableColumn<>("Documents");
                                documentsColumn.setCellValueFactory(new PropertyValueFactory<>("documents"));

                                TableColumn<AdminModelCompany, String> statusColumn = new TableColumn<>("Status");
                                statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

                                TableColumn<AdminModelCompany, String> actionColumn = new TableColumn<>("Action");
                                actionColumn.setCellValueFactory(new PropertyValueFactory<>("action"));

                                tableView.getColumns().addAll(companyNameColumn, cityColumn, listingColumn,
                                                documentsColumn,
                                                statusColumn, actionColumn);

                                tableView.getItems().addAll(
                                                new AdminModelCompany("Bajaj", "Pune", 13, "Verified", "Active"),
                                                new AdminModelCompany("BMW", "Mumbai", 4, "Pending", "Active"),
                                                new AdminModelCompany("Honha", "Nashik", 24, "Verified", "Active"),
                                                new AdminModelCompany("Mahindra", "Nagpur", 12, "Rejected",
                                                                "DeActive"));

                                borderPane.setCenter(tableView);

                        } else if (selected_item.equals("Product Approvals ")) {

                                Text text1 = new Text("Heavy Duty Clutch Plate Set");

                                VBox vBox1 = new VBox(text1);
                                vbox.setStyle("-fx-border-color: #303030;" + "-fx-border-width: 100px;");

                                HBox hBox = new HBox(vBox1);

                                VBox vBox = new VBox(hBox);
                                borderPane.setCenter(vBox);

                        } else if (selected_item.equals("Orders")) {

                                TableView<AdminModelOrders> tableView = new TableView<>();
                                tableView
                                                .setStyle("-fx-background-color: transparent; -fx-border-color: white; -fx-border-width: 2px;");
                                tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

                                TableColumn<AdminModelOrders, String> ordersColumn = new TableColumn<>("Orders");
                                ordersColumn.setCellValueFactory(new PropertyValueFactory<>("orders"));

                                TableColumn<AdminModelOrders, String> customerNameColumn = new TableColumn<>(
                                                "Customer Name");
                                customerNameColumn.setCellValueFactory(new PropertyValueFactory<>("customerName"));

                                TableColumn<AdminModelOrders, String> companyColumn = new TableColumn<>("Company");
                                companyColumn.setCellValueFactory(new PropertyValueFactory<>("company"));

                                TableColumn<AdminModelOrders, Double> valueColumn = new TableColumn<>("Value");
                                valueColumn.setCellValueFactory(new PropertyValueFactory<>("value"));

                                TableColumn<AdminModelOrders, String> paymentColumn = new TableColumn<>("Payment");
                                paymentColumn.setCellValueFactory(new PropertyValueFactory<>("payment"));

                                TableColumn<AdminModelOrders, String> statusColumn = new TableColumn<>("Status");
                                statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

                                tableView.getColumns().addAll(ordersColumn, customerNameColumn, companyColumn,
                                                valueColumn, paymentColumn, statusColumn);

                                tableView.getItems().addAll(
                                                new AdminModelOrders("#ORD-101", "Rahul kadam", "Bajaj", 15400.00,
                                                                "Paid"),
                                                new AdminModelOrders("#ORD-102", "Priya shelke", "BMW", 82000.50,
                                                                "Pending"),
                                                new AdminModelOrders("#ORD-103", "Amit Mhetre", "Honda", 12300.00,
                                                                "Paid"),
                                                new AdminModelOrders("#ORD-104", "Neha patil", "Mahindra", 45000.75,
                                                                "Failed"));

                                borderPane.setCenter(tableView);

                        } else if (selected_item.equals("Complaints")) {

                        } else if (selected_item.equals("Reviews")) {

                        } else if (selected_item.equals("Notification")) {

                        

                                VBox leftBox = new VBox(20);
                                leftBox.setPadding(new Insets(30));

                                leftBox.setPrefWidth(700);
                                leftBox.setPrefHeight(450);

                                leftBox.setStyle(
                                                "-fx-background-color: #ffffff;" +
                                                                "-fx-border-color: #303030;" +
                                                                "-fx-border-width: 1px;");

                                
                                Text heading = new Text("SEND A BROADCAST");

                                heading.setStyle(
                                                "-fx-fill: black;" +
                                                                "-fx-font-size: 25px;");

                                
                                TextField titleField = new TextField();

                                titleField.setPromptText("Notification title");

                                titleField.setPrefHeight(45);

                                titleField.setStyle(
                                                "-fx-background-color: transparent;" +
                                                                "-fx-border-color: #303030;" +
                                                                "-fx-text-fill: white;" +
                                                                "-fx-prompt-text-fill: #131010;" +
                                                                "-fx-font-size: 16px;");

                                
                                TextArea messageArea = new TextArea();

                                messageArea.setPromptText(
                                                "Message to users and vendors...");

                                messageArea.setPrefHeight(150);

                                messageArea.setWrapText(true);

                                messageArea.setStyle(
                                                "-fx-control-inner-background: #ffffff;" +
                                                                "-fx-border-color: #303030;" +
                                                                "-fx-text-fill: white;" +
                                                                "-fx-prompt-text-fill: #131313;" +
                                                                "-fx-font-size: 16px;");

                                
                                Button sendButton = new Button("✈   Send notification");

                                sendButton.setPrefWidth(210);
                                sendButton.setPrefHeight(45);

                                sendButton.setStyle(
                                                "-fx-background-color: #e51c2a;" +
                                                                "-fx-text-fill: white;" +
                                                                "-fx-font-size: 16px;" +
                                                                "-fx-font-weight: bold;");

                                leftBox.getChildren().addAll(
                                                heading,
                                                titleField,
                                                messageArea,
                                                sendButton);

                        

                                VBox rightBox = new VBox(20);

                                rightBox.setPadding(new Insets(30));

                                rightBox.setPrefWidth(700);
                                rightBox.setPrefHeight(450);

                                rightBox.setStyle(
                                                "-fx-background-color: #ffffff;" +
                                                                "-fx-border-color: #303030;" +
                                                                "-fx-border-width: 1px;");

                                
                                Text maintenanceText = new Text("MAINTENANCE");

                                maintenanceText.setStyle(
                                                "-fx-fill: white;" +
                                                                "-fx-font-size: 25px;");

                                
                                Text backupText = new Text(
                                                "Last database backup: 09 Aug 2026, 02:00 IST");

                                backupText.setStyle(
                                                "-fx-fill: #100d0d;" +
                                                                "-fx-font-size: 16px;");

                                
                                Button backupButton = new Button("Backup now");

                                backupButton.setPrefWidth(115);
                                backupButton.setPrefHeight(40);

                                backupButton.setStyle(
                                                "-fx-background-color: #25262a;" +
                                                                "-fx-text-fill: white;" +
                                                                "-fx-font-weight: bold;");

                                Button restoreButton = new Button("Restore from backup");

                                restoreButton.setPrefWidth(170);
                                restoreButton.setPrefHeight(40);

                                restoreButton.setStyle(
                                                "-fx-background-color: #25262a;" +
                                                                "-fx-text-fill: white;" +
                                                                "-fx-font-weight: bold;");

                                HBox maintenanceButtons = new HBox(10);

                                maintenanceButtons.getChildren().addAll(
                                                backupButton,
                                                restoreButton);

                                rightBox.getChildren().addAll(
                                                maintenanceText,
                                                backupText,
                                                maintenanceButtons);

                

                                HBox mainHBox = new HBox(30);

                                mainHBox.setPadding(new Insets(20));

                                mainHBox.getChildren().addAll(
                                                leftBox,
                                                rightBox);

                                borderPane.setCenter(mainHBox);
                        }

                });

                Scene scene = new Scene(borderPane, 1500, 800);
                
                adminLoginScene=scene;
                return adminLoginScene;

        }

}
