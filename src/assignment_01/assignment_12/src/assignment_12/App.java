package assignment_12;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Return a version of the given string, where for every star (*) 
	in the string the star and the chars immediately to its left and right are gone. 
	So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		starKill("cd*zq")  <b>---></b>"cq"<br>
		starKill("ab**cd")    <b>---></b> "ad" <br>
		starKill("wacy*xko") <b>---></b> "wacko" <br>
	 */
	
	public static String starKill(String str) {
//int n=str.length();
//		int star_id =str.indexOf("*");
//		String pre=str.substring(0, star_id-1);
//		String post=str.substring(star_id+2,n);
//		String main_s=pre+post;
//		
//	
//	return main_s;
//	}

	
		int n= str.length();
		int idx = str.indexOf("*");
		String first =str.substring(0,idx-1);
		String second= str.substring(idx+2,n);
		String res = first+second;
	return res;
	}
   
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
