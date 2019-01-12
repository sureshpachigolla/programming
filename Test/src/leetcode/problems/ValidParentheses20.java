package leetcode.problems;

import java.util.ArrayList;

public class ValidParentheses20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringPassed = new String("]");
		ValidParentheses20 validstr = new ValidParentheses20();
		boolean b = validstr.isValid(stringPassed);
		System.out.println(b);

	}
	
    public boolean isValid(String s) {
    	char[] charOfString = s.toCharArray();
    	char openBracket = '(';
    	char closedBracket = ')';
    	char openSqrBracket = '[';
    	char closedSqrBracket = ']';
    	char openCurlyBracket = '{';
    	char closedCurlyBraaccket = '}';
    	
    	ArrayList<Character> storeOpenBrackets=new ArrayList<Character>();
    	int indexofLast = 0;
    	
    	for(int i=0; i < charOfString.length; i++ ){
    		if(charOfString[i] == openBracket || charOfString[i] == openSqrBracket || charOfString[i] == openCurlyBracket){
    			storeOpenBrackets.add(charOfString[i]);
    			indexofLast++;
    			}
    			else {	
    		         if (!storeOpenBrackets.isEmpty()){ 
    			         if((charOfString[i] == closedBracket && storeOpenBrackets.get(indexofLast-1) == openBracket)
    			           || (charOfString[i] == closedSqrBracket && storeOpenBrackets.get(indexofLast-1) == openSqrBracket)
    			           || (charOfString[i] == closedCurlyBraaccket && storeOpenBrackets.get(indexofLast-1) == openCurlyBracket)){
    				      storeOpenBrackets.remove(indexofLast-1);
    				      indexofLast--;
    			         }
    			         else{
    			        	 return false;
    			         }
    		         }
    		         else{
    		        	 return false;
    		         }
    			}
    		}
    	if(storeOpenBrackets.isEmpty()){
    		return true;
    	}
    	return false;
    }
}
