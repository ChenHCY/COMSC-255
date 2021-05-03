package Assignment10;
//File: Assignment10.java
//Assignment9_Part2
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment10
*/
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Assignment10 extends Application
{
	// TODO Auto-generated method stub
	Pane pane = new Pane();
	
	@Override
	public void start(Stage primaryStage) 
	{
		double width = 525;
		double height = 300;
		pane.setOnMouseClicked(e-> 
		{
			double x = e.getX();//The center X of circle
			double y = e.getY();//The center Y of circle
			if (e.getButton() == MouseButton.PRIMARY) 
			{
				Circle c = drawPoint(x,y);
				pane.getChildren().add(c);
			} 
			else if (e.getButton() == MouseButton.SECONDARY) 
			{
				deletePoint(x, y);
		    }
		});
		
		Scene scene = new Scene(pane, width, height);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Assignment 10");
		primaryStage.show();
	}
	
	private Circle drawPoint(double x, double y) 
	{	
		Circle c = new Circle(x, y, 5);
		c.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        c.setStroke(Color.BLACK);
        return c;
     }
	
	private void deletePoint(double x, double y) 
	{
		ObservableList<Node> list = pane.getChildren();
		
		for (int i = list.size() - 1; i >= 0; i--) 
		{
			Node c = list.get(i);
			if (c instanceof Circle && c.contains(x, y)) 
			{
				pane.getChildren().remove(c);
				break;
		    }
		}
	}
	
	public static void main(String[] args) 
	{
		Application.launch(args);
    }
}
