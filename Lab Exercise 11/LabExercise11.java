package LabExercise11;
//File: LabExercise11.java
//Lab Exercise 11
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: LabExercise11
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Pos;

public class LabExercise11 extends Application
{
	@Override
	public void start(Stage primaryStage) 
	{
		VBox paneCircle = new VBox(10);
		paneCircle.setAlignment(Pos.CENTER);
		
		Circle c1 = getCircle();
		Circle c2 = getCircle();
		Circle c3 = getCircle();
		paneCircle.getChildren().addAll(c1, c2, c3);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setFill(Color.WHITE);
		rectangle.setWidth(70);
		rectangle.setHeight(220);
		rectangle.setStroke(Color.BLACK);
		rectangle.setStrokeWidth(2);
		StackPane trafficLight = new StackPane(rectangle, paneCircle);
		
		HBox paneRadioButton = new HBox(5);
		paneRadioButton.setAlignment(Pos.CENTER);
		
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbYellow = new RadioButton("Yellow");
		RadioButton rbGreen = new RadioButton("Green");
		
		rbRed.setSelected(false);
		paneRadioButton.getChildren().addAll(rbRed, rbYellow, rbGreen);
		
		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbYellow.setToggleGroup(group);
		rbGreen.setToggleGroup(group);
		
		BorderPane pane = new BorderPane();
		pane.setCenter(trafficLight);
		pane.setBottom(paneRadioButton);
		
		// Create and register handlers
		rbRed.setOnAction(e -> 
		{
			if (rbRed.isSelected()) 
			{
				c1.setFill(Color.RED);
				c2.setFill(Color.WHITE);
				c3.setFill(Color.WHITE);
			}
		});
		
		rbYellow.setOnAction(e -> 
		{
			if (rbYellow.isSelected()) 
			{
				c1.setFill(Color.WHITE);
				c2.setFill(Color.YELLOW);
				c3.setFill(Color.WHITE);
			}
		});
		
		rbGreen.setOnAction(e -> 
		{
			if (rbGreen.isSelected()) 
			{
				c1.setFill(Color.WHITE);
				c2.setFill(Color.WHITE);
				c3.setFill(Color.GREEN);
			}
		});
		
		Scene scene = new Scene(pane, 400, 350);
		primaryStage.setTitle("Lab Exercise 11"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage	
	}
	
	private Circle getCircle() 
	{
		Circle c = new Circle(30);
		c.setFill(Color.WHITE);
		c.setStroke(Color.BLACK);
		return c;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
