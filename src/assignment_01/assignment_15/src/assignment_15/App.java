package assignment_15;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Given a string, return the length of the longest streak of the same chars in the string. 

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		longestStreak("hayyeu") <b>---></b> 2<br>
		longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
		longestStreak("")  <b>---></b> 0 <br>
	 */
	
	public static int longestStreak(String str) {
		   int strLength = str.length();
		   
		   if (strLength==0) return 0;
		   
		   int count = 0;
		   char lastChar = 0;
		   int maxCount = 0;
		   
		   for (int i=0; i<strLength; i++){
		      if (str.charAt(i)==lastChar) {
		         count++;
		         if (maxCount<count) maxCount = count;
		      }
		      else count = 0;
		      lastChar = str.charAt(i);
		   }
		   maxCount++;
		   return maxCount;
		}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

