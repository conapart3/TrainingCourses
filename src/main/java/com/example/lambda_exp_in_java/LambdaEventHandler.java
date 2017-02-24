package com.example.lambda_exp_in_java;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LambdaEventHandler extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");

        // func intfaces can have only 1 method
        //              param    body
        btn.setOnAction(event -> System.out.println("Hello world!"));

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello world!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
