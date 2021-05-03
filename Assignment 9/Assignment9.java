package Assignment9;
//File: Assignment9.java
//Assignment9
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment9 
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class Assignment9 extends Application
{
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) 
	{
		// Create a pane
		Pane pane = new Pane();

		// Create two circles
		Circle c1 = new Circle();
		c1.setFill(Color.YELLOW);
		c1.setStroke(Color.BLACK);
		c1.setRadius(15);
		c1.centerXProperty().bind(pane.widthProperty().divide(2));
		c1.centerYProperty().bind(pane.heightProperty().divide(2));
		
		Circle c2 = new Circle();
		c2.setFill(Color.RED);
		c2.setStroke(Color.BLACK);
		c2.setRadius(15);
		c2.setCenterX(15 + Math.random() * (400 - 2 * 15));
		c2.setCenterY(15 + Math.random() * (300 - 2 * 15));
		
		Line line = new Line();
		line.startXProperty().bind(pane.widthProperty().divide(2));
		line.startYProperty().bind(pane.heightProperty().divide(2));
		line.setEndX(c2.getCenterX());
		line.setEndY(c2.getCenterY());
		
		double distance = Math.sqrt(Math.pow(c2.getCenterX()-c1.getCenterX(), 2)+ Math.pow(c2.getCenterY()-c1.getCenterY(), 2));
		Text text = new Text();
		text.xProperty().bind(c1.centerXProperty().add(c2.centerXProperty()).divide(2));
		text.yProperty().bind(c1.centerYProperty().add(c2.centerYProperty()).divide(2));
		String d1 = String.format("%.2f", distance);
		text.setText("Distance is " + String.valueOf(d1));
		
		pane.getChildren().addAll(c1, c2, line,text, new Text(c1.getCenterX(), c1.getCenterY(), null), new Text(c2.getCenterX(), c2.getCenterY(), null));
		Scene scene = new Scene(pane, 400, 300);
		primaryStage.setTitle("Assignment9");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
		
		public static void main(String[] args)
		{  
			Application.launch(args);
		}
}
