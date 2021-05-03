package Assignment14;
//File: Assignment14.java
//Assignment14
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment 14
*/
import java.util.Stack;

public class Assignment14 
{
	public static void main(String[] args) 
	{
		 if (args.length != 1) 
		 {
			 System.out.println("Usage: java EvaluateExpression \"expression\"");
			 System.exit(1);
	     }

		 try {
			 System.out.println(evaluateExpression(args[0]));
	     } catch (Exception ex)  {
			 System.out.println("Wrong expression: " + args[0]);
	     }
	  }

	/** Evaluate an expression */
	public static int evaluateExpression(String expression) 
	{
		Stack<Integer> operandStack = new Stack<>();
		Stack<Character> operatorStack = new Stack<>();
		
		// Insert blanks around (, ), +, -, /, and *
		expression = insertBlanks(expression);
		
		// Extract operands and operators
		String[] tokens = expression.split(" ");
		
		// Phase 1: Scan tokens
		for (String token: tokens) 
		{
			if (token.length() == 0) // Blank space
				continue; // Back to the while loop to extract the next token
			else if (token.charAt(0) == '+' || token.charAt(0) == '-') 
			{
				// Process all +, -, *, / in the top of the operator stack
				while (!operatorStack.isEmpty() && (operatorStack.peek() == '+' || operatorStack.peek() == '-' || operatorStack.peek() == '*' || operatorStack.peek() == '/'|| operatorStack.peek() == '^' ||operatorStack.peek() == '%'))
				{
					processAnOperator(operandStack, operatorStack);
				}
				// Push the + or - operator into the operator stack
				operatorStack.push(token.charAt(0));
			}
			else if (token.charAt(0) == '*' || token.charAt(0) == '/'|| token.charAt(0) == '%') 
			{
				// Process all *, / in the top of the operator stack
				while (!operatorStack.isEmpty() && (operatorStack.peek() == '*' || operatorStack.peek() == '/'|| operatorStack.peek() == '%' )) 
				{
					processAnOperator(operandStack, operatorStack);
				}
				// Push the * or / or % operator into the operator stack
				operatorStack.push(token.charAt(0));
			}
			else if (token.charAt(0) == '^') 
			{
		 		// Process all '^' operators in the top of the operator stack
		 		while (!operatorStack.isEmpty() && operatorStack.peek() == '^') 
		 		{
		 			processAnOperator(operandStack, operatorStack);
		 		}
		 		// Push the ^ operator into the operator stack
		 		operatorStack.push(token.charAt(0));
		 	}
			else if (token.trim().charAt(0) == '(') 
			{
				operatorStack.push('('); // Push '(' to stack
			}
			
			else if (token.trim().charAt(0) == ')') 
			{
				// Process all the operators in the stack until seeing '('
				while (operatorStack.peek() != '(') 
				{
					processAnOperator(operandStack, operatorStack);
				}
				operatorStack.pop(); // Pop the '(' symbol from the stack
			}
			else 
			{ 
				operandStack.push(new Integer(token));
			}
		}		
		// Phase 2: Process all the remaining operators in the stack
		while (!operatorStack.isEmpty()) 
		{
			processAnOperator(operandStack, operatorStack);
		}
		return operandStack.pop();
	}
	
	public static void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack) 
	{
		char op = operatorStack.pop();
		int op1 = operandStack.pop();
		int op2 = operandStack.pop();
		if (op == '+')
			operandStack.push(op2 + op1);
		else if (op == '-')
			operandStack.push(op2 - op1);
		else if (op == '*')
			operandStack.push(op2 * op1);
		else if (op == '/')
			operandStack.push(op2 / op1);
		else if (op == '/')
			operandStack.push(op2 / op1);
		else if (op == '^')
			operandStack.push((int)Math.pow(op2, op1));
		else if (op == '%')
			operandStack.push(op2 % op1);
	}
	
	public static String insertBlanks(String a) 
	{
		String result = "";
		for (int i = 0; i < a.length(); i++) 
		{
			if (a.charAt(i) == '(' || a.charAt(i) == ')' ||a.charAt(i) == '+' || a.charAt(i) == '-' ||a.charAt(i) == '*' || a.charAt(i) == '/'|| a.charAt(i) == '^' || a.charAt(i) == '%')
				result += " " + a.charAt(i) + " ";
			else
				result += a.charAt(i);
		}
		return result;
	}
}
