package Assignment11;
//File: Assignment11.java
//Assignment 11
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment 11
*/
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Assignment11 extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		FanPane fanPane = new FanPane(100);
		KeyFrame keyFrame = new KeyFrame(Duration.millis(5), e -> fanPane.spinArc());
		
		Timeline timeline = new Timeline(keyFrame);
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play(); // Start the animation
		
		Button btPause = new Button("Pause");
		btPause.setOnAction(e -> timeline.pause());
		Button btResume = new Button("Resume");
		btResume.setOnAction(e -> timeline.play());
		Button btReverse = new Button("Reverse");
		btReverse.setOnAction(e -> fanPane.increment *= -1);
		
		HBox buttons = new HBox(5);
		buttons.getChildren().addAll(btPause, btResume, btReverse);
		buttons.setAlignment(Pos.CENTER);
		buttons.setPadding(new Insets(10, 10, 10, 10));
		
		BorderPane Pane = new BorderPane(fanPane, null, null, buttons, null);
		primaryStage.setScene(new Scene(Pane));
		primaryStage.setTitle("Assignment11");
		primaryStage.show(); 
	}
	
	private class FanPane extends Pane
	{
		private Arc[] fanArc = new Arc[4];
		private double increment = 1;
		FanPane(double radius)
		{
			setMinHeight(300);
			setMinWidth(300);
			Circle c = new Circle(150, 150, radius, Color.WHITE);
			c.setStroke(Color.BLACK);
			double arcRadius = radius * 0.9;
			for (int i = 0; i < fanArc.length; i++)
			{
				fanArc[i] = new Arc(c.getCenterX(), c.getCenterY(),arcRadius, arcRadius, (i * 90) + 30,50);
				fanArc[i].setFill(Color.RED);
				fanArc[i].setType(ArcType.ROUND);
			}
			getChildren().addAll(c);
			getChildren().addAll(fanArc);
		}
		
		private void spinArc()
		{
			for (Arc arc : fanArc)
			{
				double startAngle = arc.getStartAngle();
				arc.setStartAngle(startAngle + increment);
			}
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
