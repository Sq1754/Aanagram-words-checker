//Q-> Check the Words Are anagrams or not(IgnoringCase)
// Anagram means both words have same Characters with same frequency 

import java.util.Scanner;
import java.util.Arrays;

public class Q_Anagram_String {

	    static boolean isAnagram(String a, String b) {  
	    	
	    	if(a.length()!=b.length()){
	         return false;
	        }
	        
	       a= a.toLowerCase();
	       b= b.toLowerCase();
	        
	       // converting String to Char Array
	       char[]a1=  a.toCharArray();
	       char[]b1=  b.toCharArray();
	        
	        // sort array
	        Arrays.sort(a1);
	        Arrays.sort(b1);
	        
	        if(Arrays.equals(a1, b1))
	            return true;
	        else
	            return false;
	    }

	  public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter two words");
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
}
