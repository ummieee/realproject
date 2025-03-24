import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String s ="Hai Hello Iam Umesh";
	    String word = "Iam";
	    String rev = " ";
	    String[] ss = s.split(" ");
	    boolean found = false;
	    for(int i=0 ; i< ss.length; i++){
	        if(ss[i].equals(word)){
	            found = true;
	            for(int j=ss[i].length()-1; j>=0 ;j--){
	                rev= rev + ss[i].charAt(j);
	            }
	        }
	        
	    }
	    if(!found){
	        rev= word;
	    }
	    String finals = s.replace(word, rev );
	    System.out.println(finals);
	}
}
