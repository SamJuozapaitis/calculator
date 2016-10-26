import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;


public class CheckExpression {

	public static ArrayList<String> CheckExp(String fullExpression){
		char[] characterArray = fullExpression.toCharArray();
		
		int index = 0;
		//Stack numberStack = new Stack();
		//Stack operanStack = new Stack();
		ArrayList<String> numberStack = new ArrayList<String>();
		ArrayList<String> operanStack = new ArrayList<String>();
		
		StringTokenizer tokenizedString = tokenizerMethod(fullExpression);
		
		/*
		while(true){
			
			if(Character.isDigit(characterArray[index])){
				index++;
				continue;
				
			}//end if is digit
			if(characterArray[index] == '-'){
				index++;
				if(characterArray[index] != '0' && Character.isDigit(characterArray[index])){
					index++;
					continue;
				}
			}
			
			break;
		}*/
		if(tokenizedString.countTokens() == 1 && isNumber(tokenizedString.nextToken())){
			System.out.println("This is not a valid statement");
			System.exit(-1);
		}
		
		String currentToken;
		while(tokenizedString.hasMoreTokens()){
			currentToken = tokenizedString.nextToken();
			
			if(isNumber(currentToken)){
				numberStack.add(currentToken);
				continue;
				
			}//end if token is a number
			
			if(currentToken.equals("+") || currentToken.equals("-") || currentToken.equals("*") || currentToken.equals("/") ||
					currentToken.equals("(") || currentToken.equals(")") || currentToken.equals("^")){
				
				if(currentToken.equals(")")){
					
					String varToCheckIfTheOperanIsARightEnd;
					try{
					while(true){
						
						varToCheckIfTheOperanIsARightEnd = (operanStack.get(operanStack.size() - 1));
						
						if(varToCheckIfTheOperanIsARightEnd.equals("(")){
							
							operanStack.remove(operanStack.size() - 1);
							break;
						}//end if
						else{
							
							numberStack.add(varToCheckIfTheOperanIsARightEnd);
							operanStack.remove(operanStack.size() - 1);
							
						}//end else
						
							
						
					}//end while loop
					}catch(ArrayIndexOutOfBoundsException e){
						return null;
					}
					continue;
					
				}//end if for )
				
				if(currentToken.equals("(")){
					operanStack.add(currentToken);
					continue;
				}
				
				if(operanStack.size() <= 0){
					operanStack.add(currentToken);
					continue;
				}
				else{
					String str = operanStack.get(operanStack.size() - 1);
					if(compare(currentToken, str)){
						operanStack.add(currentToken);
						continue;
					}//end if
					else{
						//code for if one operan needs to put to the queue
						numberStack.add(str);
						operanStack.remove(operanStack.size() - 1);
						operanStack.add(currentToken);
						continue;
					}
				}//end else
				
			}// to check if operan
			
			
		}//end while string tokenizer has more tokens
		
		for(int i = (operanStack.size() - 1); i >= 0; i--){
			
			numberStack.add(operanStack.get(i));
			operanStack.remove(i);
		}
		
		return numberStack;
	}//end CheckExp
	
	public static StringTokenizer tokenizerMethod(String stringToSplit){
		
		
		//StringTokenizer toReturn = new StringTokenizer(stringToSplit, "*, +, -, (, ), ^, /", true);
		StringTokenizer toReturn = new StringTokenizer(stringToSplit, " ");
		
		return toReturn;
		
	}//end tokenIzerMethod
	/**
	 * 
	 * @param str1 string that is on the left side of the equation
	 * @param str2 string that is on the right side of the equation
	 * @return if str is bigger than str2
	 */
	public static boolean compare(String str1, String str2){
		
		int str1Value = 0;
		int str2Value = 0;
		
		if(str1.equals("^")){
			return true;
		}
		if(str1.equals("+") || str1.equals("-") || str1.equals("^")){
			str1Value = 1;
		}
		else{
			str1Value = 2;
		}
		if(str2.equals("+") || str2.equals("-") || str2.equals("^")){
			str2Value = 1;
		}
		else{
			str2Value = 2;
		}
		if(str2.equals("(")){
			return true;
		}
		if(str1Value > str2Value){
			return true;
		}
		else return false;
		
	}//end compare method
	
	public static boolean isNumber(String string) {
		
		try  
		  {  
		    double d = Double.parseDouble(string);  
		  }  
		  catch(NumberFormatException nfe)  
		  {  
		    return false;  
		  }  
		  return true; 
		
		/*
	    if (string == null || string.isEmpty()) {
	        return false;
	    }
	    int i = 0;
	    if (string.charAt(0) == '-') {
	        if (string.length() > 1) {
	            i++;
	        } else {
	            return false;
	        }
	    }
	    for (; i < string.length(); i++) {
	        if (!Character.isDigit(string.charAt(i))) {
	            return false;
	        }
	    }
	    return true;*/
	}//end isNumber method
	
	public static String doMath(ArrayList<String> initialArray){
		int indexOfCurrentOperation;
		String currentOperation;
		try{
			indexOfCurrentOperation = initialArray.size() - 1;
			//String currentOperation;
		}catch (NullPointerException e){
			return null;
		}
		while(true){
			
			if(initialArray.size() == 0){
				return null;
			}
			
			if(initialArray.size() == 1){
				
				return initialArray.get(0);
			}
			currentOperation = initialArray.get(indexOfCurrentOperation);
			
			//if(isNumber(currentOperation)){
			//	System.out.println("This is not a correct statement");
			//}//end if
			try{
			if(!isNumber(initialArray.get(indexOfCurrentOperation - 1))){
				indexOfCurrentOperation--;
				continue;
			}//end if
			else{
				
				if(isNumber(initialArray.get(indexOfCurrentOperation - 1)) && isNumber(initialArray.get(indexOfCurrentOperation - 2))){
					
					double num1 = Double.parseDouble(initialArray.get(indexOfCurrentOperation - 1));
					double num2 = Double.parseDouble(initialArray.get(indexOfCurrentOperation - 2));
					String operation = initialArray.get(indexOfCurrentOperation);
					
					if(operation.equals("+")){
						String str = Double.toString(num1 + num2);
						initialArray.remove(indexOfCurrentOperation - 2);
						initialArray.remove(indexOfCurrentOperation - 2);
						initialArray.add(indexOfCurrentOperation - 2, str);
						initialArray.remove(indexOfCurrentOperation - 1);
					}
					
					if(operation.equals("-")){
						String str = Double.toString(num2 - num1);
						initialArray.remove(indexOfCurrentOperation - 2);
						initialArray.remove(indexOfCurrentOperation - 2);
						initialArray.add(indexOfCurrentOperation - 2, str);
						initialArray.remove(indexOfCurrentOperation - 1);
					}
					
					if(operation.equals("/")){
						String str = Double.toString(num2 / num1);
						initialArray.remove(indexOfCurrentOperation - 2);
						initialArray.remove(indexOfCurrentOperation - 2);
						initialArray.add(indexOfCurrentOperation - 2, str);
						initialArray.remove(indexOfCurrentOperation - 1);
					}
					
					if(operation.equals("^")){
						String str = Double.toString(Math.pow(num2, num1));
						initialArray.remove(indexOfCurrentOperation - 2);
						initialArray.remove(indexOfCurrentOperation - 2);
						initialArray.add(indexOfCurrentOperation - 2, str);
						initialArray.remove(indexOfCurrentOperation - 1);
					}
					
					if(operation.equals("*")){
						String str = Double.toString(num1 * num2);
						initialArray.remove(indexOfCurrentOperation - 2);
						initialArray.remove(indexOfCurrentOperation - 2);
						initialArray.add(indexOfCurrentOperation - 2, str);
						initialArray.remove(indexOfCurrentOperation - 1);
					}
					indexOfCurrentOperation = initialArray.size() - 1;
					
				}//end if
				else{
					indexOfCurrentOperation--;
				}//end else

				//indexOfCurrentOperation--;
				//continue;
				
			}//end else
			
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Not a real statement");
				//System.exit(-1);
				return null;
			}
		}//end while true
		
	}
	
}//end class
