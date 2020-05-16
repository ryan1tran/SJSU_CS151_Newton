package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Animation extends Application
{
	@Override
	public void start(Stage stage)
	{
		TilePane pane = new TilePane();
		pane.setAlignment(Pos.CENTER);
		Scene scene = new Scene(pane);

		stage.setMinHeight(500);
		stage.setMinWidth(500);
		stage.setScene(scene);
		stage.setTitle("Animation");

		FlowPane one = new FlowPane();
		one.setPrefHeight(200);
        one.setPrefWidth(200);
		one.setPadding(new Insets(20, 20, 20, 20));
		one.setHgap(30);
		
		FlowPane two = new FlowPane();
		two.setPrefHeight(200);
		two.setPrefWidth(200);
		two.setPadding(new Insets(20, 20, 20, 20));
		two.setHgap(30);
		
		FlowPane three = new FlowPane();
		three.setPrefHeight(200);
		three.setPrefWidth(200);
		three.setPadding(new Insets(20, 20, 20, 20));
		three.setHgap(30);
		
		FlowPane four = new FlowPane();
		four.setPrefHeight(200);
		four.setPrefWidth(200);
		four.setPadding(new Insets(20, 20, 20, 20));
		four.setHgap(30);
		
		pane.setPrefColumns(2);
		pane.setVgap(1);
		pane.setHgap(1);
		one.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		two.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		three.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		four.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

		pane.getChildren().addAll(one, two, three, four);

		stage.show();
	}
	
	public static void main(String[] args)
	{
        launch(args);
    }
}
