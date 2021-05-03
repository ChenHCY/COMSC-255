import javax.swing.JOptionPane;
public class LabExercise1
{
  public static void main(String[] args) 
  {
		// TODO Auto-generated method stub
	  int loanPeriod;
      double loanAmount;
      double startingIR = 5.0;
      double endingIR = 8.0;
      double increment = 1.0 / 8.0;
      
      String loanAmountString = JOptionPane.showInputDialog(null, "Please enter the loan amount:", "Lab Exercise 1",JOptionPane.WARNING_MESSAGE);
      String loanPeriodString = JOptionPane.showInputDialog(null, "Please enter the loan period(years): ", "Lab Exercise 1", JOptionPane.WARNING_MESSAGE);
      
      loanAmount = Double.parseDouble(loanAmountString);
      loanPeriod = (int) Double.parseDouble(loanPeriodString);
      
      String displayMessage = String.format("\n%-20s%-20s%-20s\n", "Interest Rate(%)", "Monthly Payment($)", "Total Payment($)");
      
      for(double interestRate = startingIR; interestRate <= endingIR; interestRate += increment)
      {
          // compute monthly interest rate
          double monthlyIR = interestRate / 1200;
         
          // compute the monthly payment
          double monthlyPayment = loanAmount * monthlyIR    / (1 - 1 / Math.pow(1 + monthlyIR, loanPeriod * 12));
         
          // compute the total payment
          double totalPayment = monthlyPayment * loanPeriod * 12;
          
          displayMessage += String.format("%-35.3f%-35.2f%-35.2f\n", interestRate, monthlyPayment, totalPayment);
      }
      
      JOptionPane.showMessageDialog(null, displayMessage, "Lab Exercise 1", JOptionPane.WARNING_MESSAGE);
   }

}
