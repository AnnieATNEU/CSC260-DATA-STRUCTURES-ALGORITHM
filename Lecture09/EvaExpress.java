package Lecture09;

import java.util.Stack;

public class EvaExpress {

	public static void main(String[] args) {
		String x = "3*(5+2)-10";
		 eveExpression(x);
//		int result = myoper('+', '5', '2');
//		System.out.println(result);
	}

//=============================================	
	public static void eveExpression(String expression) {
		// create a stack
		Stack<Integer> myvalue = new Stack<Integer>();
		Stack<Character> myop = new Stack<Character>();

		// break down String to char
		char[] tokens = expression.toCharArray();

		// iterate over array
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i] == ' ')
				continue;
			// iterate over the string then catch if there are numbers
			if (tokens[i] >= '0' && tokens[i] <= '9') {
				StringBuffer sub = new StringBuffer();
				while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') {
					sub.append(tokens[i++]);
					myvalue.push(Integer.parseInt(sub.toString()));
				}

			} else if (tokens[i] == '(')
				myop.push(tokens[i]);
			else if (tokens[i] != '(') {
				while (myop.peek() != '(') {
					myvalue.push(myoper(myop.pop(), myvalue.pop(), myvalue.pop()));
				}
			}
			myop.pop();
		 if((tokens[i]=='+'|| tokens[i]=='-'|| tokens[i]=='*'|| tokens[i]=='/')			 
       {
    	while (!myop.empty() && checkop(tokens[i], myop.peek())) { 
		    myvalue.push(myoper(mypop.pop),myvalue.pop(),myvalue.pop()));
	    	myop.push(tokens[i]);
	    
       }
    	while(!myop.empty())
    	{
    		myvalue.push(null);
    	}
	}
       return myvalue.peek
	}
	// =============================================
	public static int myoper(char op, int a, int b) {
		switch (op) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b == 0)
				System.out.println("We cannot divide by zero");
			return a + b;
		}
		return 0;

	}

//=============================================	
	public static boolean checkop(char op1, char op2) {
		if (op1 == '(' || op2 == ')')
			return false;
		if ((op1 == '*' || op2 == '/') && (op1 == '+' || op2 == '-'))
			return false;
		else
			return true;
	}

}
