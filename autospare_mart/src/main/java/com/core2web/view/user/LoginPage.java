package com.core2web.view.user;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginPage extends Application {

    public static Stage loginPageStage;

    private Scene loginPageScene;

    @Override
    public void start(Stage myStage) throws Exception {
        loginPageStage = myStage;

        Text text1 = new Text("AUTOSPARE MART");
        text1.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-fill: #7217d4;");

        Button userButton = new Button("USER");
        userButton.setStyle(
                "-fx-background-color: #f9260a;-fx-background-radius: 10px;-fx-padding :10px 30px;-fx-border-radius: 5px;-fx-alignment: center;");

        userButton.setOnAction(event -> {
            System.out.println("user button clicked");
            userLogin();
        });

        Button companyButton = new Button("COMPANY");
        companyButton.setStyle(
                "-fx-background-color: #f9260a;-fx-background-radius: 10px;-fx-padding :10px 20px;-fx-border-radius: 5px;-fx-alignment: center;");

        companyButton.setOnAction(event -> {
            System.out.println("user button clicked");
            companyLogin();
        });

        Button adminButton = new Button("ADMIN");
        adminButton.setStyle(
                "-fx-background-color: #f9260a;-fx-background-radius: 10px;-fx-padding :10px 30px;-fx-border-radius: 5px;-fx-alignment: center;");

        adminButton.setOnAction(event -> {
            System.out.println("user button clicked");
            adminLogin();
        });

        HBox hbox1 = new HBox(text1);
        hbox1.setAlignment(Pos.CENTER);

        HBox hbox2 = new HBox(userButton);
        hbox2.setAlignment(Pos.CENTER);

        HBox hbox3 = new HBox( companyButton);
        hbox3.setAlignment(Pos.CENTER);

        HBox hbox4 = new HBox(adminButton);
        hbox4.setAlignment(Pos.CENTER);

        VBox vbox1 = new VBox(50,hbox1,hbox2,hbox3,hbox4);
        vbox1.setAlignment(Pos.CENTER);

    

        

        Scene scene = new Scene(vbox1,loginPageStage.getWidth(),loginPageStage.getHeight());
        loginPageScene = scene;
        loginPageStage.setTitle("AutoSpare Mart");
        loginPageStage.setScene(loginPageScene);
        loginPageStage.setMaximized(true);
        loginPageStage.show();

    }

    public void userLogin() {

        Text text1 = new Text("Enter Your Name");
        text1.setStyle("-fx-font-size: 12px; -fx-font-weight: bold; -fx-fill: #0b0b0b;");

        TextField textField1 = new TextField();
        textField1.setPromptText("Rohit Sharma");

        Text text2 = new Text("Enter Your Number");
        text2.setStyle("-fx-font-size: 12px; -fx-font-weight: bold; -fx-fill: #131111;");

        TextField textField2 = new TextField();
        textField2.setPromptText("8263827802");

        Text text3 = new Text("Enter Your Address");
        text3.setStyle("-fx-font-size: 12px; -fx-font-weight: bold; -fx-fill: #120f0f;");

        TextField textField3 = new TextField();
        textField3.setPromptText("Ambegao");

        Text text4 = new Text("Enter Password");
        text4.setStyle("-fx-font-size: 12px; -fx-font-weight: bold; -fx-fill: #181616;");

        PasswordField passwordField1 = new PasswordField();
        passwordField1.setPromptText("Enter your password");

        Button signButton = new Button("SIGN IN");
        signButton.setStyle(
                "-fx-background-color: #f9260a;-fx-background-radius: 10px;-fx-padding :10px 30px;-fx-border-radius: 5px;-fx-alignment: center;");
        
                signButton.setOnAction(event->{
                    VehicleType vehicleType = new VehicleType();

                    Runnable callBackAction = new Runnable(){
                        public void run(){
                            back();
                        }
                    };
                    Scene vehicleTypeScene = vehicleType.getVehicleTypeScene(callBackAction);
                    
                    loginPageStage.setScene(vehicleTypeScene);
                });
        Button backButton = new Button("Back");
        backButton.setStyle(
                "-fx-background-color: #f9260a;-fx-background-radius: 10px;-fx-padding :10px 30px;-fx-border-radius: 5px;-fx-alignment: center;");
       
        backButton.setOnAction(event->{
            back();


        });
       
        VBox vbox1 = new VBox(5, text1, textField1);
        VBox vbox2 = new VBox(5, text2, textField2);
        VBox vbox3 = new VBox(10, text3, textField3);
        VBox vbox4 = new VBox(10, text4, passwordField1);
        VBox vbox5 = new VBox(10, vbox1, vbox2, vbox3, vbox4, signButton,backButton);

        loginPageScene = new Scene(vbox5,loginPageStage.getWidth(),loginPageStage.getHeight());

        loginPageStage.setScene(loginPageScene);
        loginPageStage.setMaximized(true);

    }

    public void companyLogin() {

        Text text1 = new Text("Enter Company Name");
        text1.setStyle("-fx-font-size: 12px; -fx-font-weight: bold; -fx-text1-fill: #d41717;");

        TextField textField1 = new TextField();
        textField1.setPromptText("TATA Company");

        Text text2 = new Text("Enter Company Email");
        text2.setStyle("-fx-font-size: 12px; -fx-font-weight: bold; -fx-text1-fill: #d41717;");

        TextField textField2 = new TextField();
        textField2.setPromptText("company@email.com");

        Text text3 = new Text("Enter Password");
        text3.setStyle("-fx-font-size: 12px; -fx-font-weight: bold; -fx-text1-fill: #d41717;");

        PasswordField passwordField1 = new PasswordField();
        passwordField1.setPromptText("Enter your password");

        Button signButton = new Button("SIGN IN");
        signButton.setStyle(
                "-fx-background-color: #f9260a;-fx-background-radius: 10px;-fx-padding :10px 30px;-fx-border-radius: 5px;-fx-alignment: center;");
        
                signButton.setOnAction(event->{
                    CompanyLogin company = new CompanyLogin();

                    Runnable callBackAction = new Runnable(){
                        public void run(){
                            back();
                        }
                    };

                    loginPageStage.setScene(company.getCompanyLogin(callBackAction));

                });

        Button backButton = new Button("Back");
        backButton.setStyle(
                "-fx-background-color: #f9260a;-fx-background-radius: 10px;-fx-padding :10px 30px;-fx-border-radius: 5px;-fx-alignment: center;");
       
            backButton.setOnAction(event->{
                back();
            });
        VBox vbox1 = new VBox(5, text1, textField1);
        VBox vbox2 = new VBox(5, text2, textField2);

        VBox vbox3 = new VBox(10, text3, passwordField1);
        VBox vbox4 = new VBox(10, vbox1, vbox2, vbox3, signButton,backButton);

        loginPageScene = new Scene(vbox4,loginPageStage.getWidth(),loginPageStage.getHeight());

        loginPageStage.setScene(loginPageScene);
        loginPageStage.setMaximized(true);

    }

    public void adminLogin() {

        Text text1 = new Text("Enter Password");
        text1.setStyle("-fx-font-size: 12px; -fx-font-weight: bold; -fx-text1-fill: #d41717;");
        TextField textField1 = new TextField();
        textField1.setPromptText("user@name");

        Text text2 = new Text("Enter Password");
        text2.setStyle("-fx-font-size: 12px; -fx-font-weight: bold; -fx-text1-fill: #d41717;");

        TextField textField2 = new TextField();
        textField2.setPromptText("admin@email.com");

        Text text3 = new Text("Enter Password");
        text3.setStyle("-fx-font-size: 12px; -fx-font-weight: bold; -fx-text1-fill: #d41717;");

        PasswordField passwordField1 = new PasswordField();
        passwordField1.setPromptText("Enter your password");

        Button signButton = new Button("SIGN IN");
        signButton.setStyle(
                "-fx-background-color: #f9260a;-fx-background-radius: 10px;-fx-padding :10px 30px;-fx-border-radius: 5px;-fx-alignment: center;");
        
                signButton.setOnAction(event->{
                    AdminLogin adminLogin = new AdminLogin();

                    loginPageStage.setScene(adminLogin.getAdminLogin());
                });
        VBox vbox1 = new VBox(5, text1, textField1);
        VBox vbox2 = new VBox(5, text2, textField2);

        VBox vbox3 = new VBox(10, text3, passwordField1);
        VBox vbox4 = new VBox(10, vbox1, vbox2, vbox3, signButton);

        loginPageScene = new Scene(vbox4,loginPageStage.getWidth(),loginPageStage.getHeight());

        loginPageStage.setScene(loginPageScene);
        loginPageStage.setMaximized(true);
    }
    public void back(){
        loginPageStage.setScene(loginPageScene);
    }
}
