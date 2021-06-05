package someQst;

import java.util.Stack;

public class Prefix2Infix {
	
	public static void main(String[] args) {
		
		String exp = "*-A/BC-/AKL";
		System.out.println(prefixToInfixConversion(exp));
	}
	
	 public static boolean isOperator(char x)
		{
	    switch(x)
	    {
	        case '+':
	        case '-':
	        case '*':
	        case '/':
	            return true;
	    }
	    return false;
	}
	 
	public static String prefixToInfixConversion(String str)
	{
	    Stack<String> stack = new Stack<>();
	     
	    // Length of expression
	    int l = str.length();
	     
	    // Reading from right to left
	    for(int i = l - 1; i >= 0; i--)
	    {
	        char c = str.charAt(i);
	        if (isOperator(c))
	        {
	            String op1 = stack.pop();
	            String op2 = stack.pop();
	             
	            // Concat the operands and operator
	            String temp = "(" + op1 + c + op2 + ")";
	            stack.push(temp);
	        }
	        else
	        {
	             
	            // To make character to string
	            stack.push(c + "");
	        }
	    }
	    return stack.pop();
	}

}
