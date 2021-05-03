package LabExercise10;
//File: LabExercise10.java
//Assignment9_Part2
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: LabExercise10
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class LabExercise10 extends Application 
{
	private TextField tfInvestmentAmount = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfFutureValue = new TextField();
	private Button btCalculate = new Button("Calculate");
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		// TODO Auto-generated method stub
		GridPane pane = new GridPane();
		pane.setVgap(5);
		pane.setHgap(5);
		
		pane.add(new Label("Investment Amount:"), 0, 0);
		pane.add(tfInvestmentAmount, 1, 0);
		pane.add(new Label("Number Of Years:"), 0, 1);
		pane.add(tfNumberOfYears, 1, 1);
		pane.add(new Label("Annual Interest Rate:"), 0, 2);
		pane.add(tfAnnualInterestRate, 1, 2);
		pane.add(new Label("Future value:"), 0, 3);
		pane.add(tfFutureValue, 1, 3);
		pane.add(btCalculate, 1, 4);
		
		pane.setAlignment(Pos.CENTER);
		tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT);
		tfFutureValue.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);
		pane.setPadding(new Insets(11, 12, 13, 14));
		
		btCalculate.setOnAction(e -> futureValue());
		Scene scene = new Scene(pane);
	    primaryStage.setScene(scene);
	    primaryStage.setTitle("LabExercise10");
	    primaryStage.show();
	}
	
	public static void main(String[] args)
	{  
		Application.launch(args);
	}

	private void futureValue() 
	{
		double investmentAmount = Double.parseDouble(tfInvestmentAmount.getText());
		int year = Integer.parseInt(tfNumberOfYears.getText());
		double monthlyInterestRate = Double.parseDouble(tfAnnualInterestRate.getText()) / 12 /100;
		tfFutureValue.setText(String.format("$%.2f", (investmentAmount * Math.pow(1 + monthlyInterestRate, year * 12))));
	}
}
