package Assignment9_Part2;
//File: Assignment9_Part2.java
//Assignment9_Part2
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment9_Part2
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;

public class Assignment9_Part2 extends Application
{
	private static final int r1 = 100;//the radius of four circles
    private static final int r2 = 10;//the gap between every circle
    @Override
    public void start(Stage primaryStage)
    {
    	int x = r1 + r2;
        int y = r1 + r2;
        Pane pane = new Pane();
        
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                Circle circle = new Circle(r1);
                circle.setCenterX(x);
                circle.setCenterY(y);
                circle.setStroke(Color.BLACK);
                circle.setFill(Color.WHITE);
                pane.getChildren().add(circle);

                for (int k = 30; k < 360; k += 90) 
                {
                    Arc arc = new Arc(x, y, r1-7,r1-7,k,45);
                    arc.setFill(Color.RED);
                    arc.setType(ArcType.ROUND);
                    pane.getChildren().add(arc);
                }
                x += r1 * 2 + r2;
            }
            x = r1 + r2;
            y += r1 * 2 + r2;
        }
        Scene scene = new Scene(pane, 425, 425);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Assignment9_Part2");
        primaryStage.show();
    }
	
	public static void main(String[] args)
	{  
		Application.launch(args);
	}
}
