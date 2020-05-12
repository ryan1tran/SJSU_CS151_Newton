package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application
{
    TextField val1;
    TextField val2;
    Button add;
    Button subtract;
    Button multiply;
    Button divide;
    Button clear;
    Label result;
    
    @Override
    public void start(Stage stage)
    {
        
        val1 = new TextField();
        val2 = new TextField();
        add = new Button("+");
        subtract = new Button("-");
        multiply = new Button("*");
        divide = new Button("/");
        clear = new Button("C");
        result = new Label("Input your values below.");
        
        result.setAlignment(Pos.CENTER);
        result.setStyle("-fx-border-color: #A9A9A9; -fx-padding: 5px;");
        
        GridPane pane = new GridPane();
        
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);
        
        pane.add(result, 0, 0, 2, 1);
        pane.add(clear, 3, 0);
        pane.add(add, 3, 1);
        pane.add(subtract, 4, 1);
        pane.add(multiply, 3, 2);
        pane.add(divide, 4, 2);
        pane.add(val1, 0, 2);
        pane.add(val2, 1, 2);
        
        setDimensions();
        attachCode();
        
        Scene scene = new Scene(pane, 400, 350);
        stage.setTitle("Calculator Using JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    private void setDimensions()
    {
        val1.setPrefWidth(95);
        val1.setPrefHeight(50);
        
        val2.setPrefWidth(95);
        val2.setPrefHeight(50);
        
        add.setPrefWidth(50);
        add.setPrefHeight(50);
        
        subtract.setPrefWidth(50);
        subtract.setPrefHeight(50);
        
        multiply.setPrefWidth(50);
        multiply.setPrefHeight(50);
        
        divide.setPrefWidth(50);
        divide.setPrefHeight(50);
        
        clear.setPrefWidth(50);
        clear.setPrefHeight(50);
        
        result.setPrefWidth(200);
        result.setPrefHeight(50);
    }

    public void attachCode()
    {
        //have each button run BTNCODE when clicked
        add.setOnAction(e -> btncode(e));
        subtract.setOnAction(e -> btncode(e));
        multiply.setOnAction(e -> btncode(e));
        divide.setOnAction(e -> btncode(e));
        clear.setOnAction(e -> btncode(e));
    }

    public void btncode(ActionEvent e)
    {
        int num1, num2, answer;
        char symbol;
        
        //e tells us which button was clicked
        if (e.getSource() == clear)
        {
            val1.setText("");
            val2.setText("");
            result.setText("Input your values below.");
            val1.requestFocus();
            return;
        }
        
        num1 = Integer.parseInt(val1.getText());
        num2 = Integer.parseInt(val2.getText());
        
        if (e.getSource() == add)
        {
            symbol = '+';
            answer = num1 + num2;
        } else if (e.getSource() == subtract)
        {
            symbol = '-';
            answer = num1 - num2;
        } else if (e.getSource() == multiply)
        {
            symbol = 'x';
            answer = num1 * num2;
        } else
        {
            symbol = '/';
            answer = num1 / num2;
        }
        
        //display answer
        result.setText(num1 + " " + symbol + " " + num2 + " = " + answer);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}