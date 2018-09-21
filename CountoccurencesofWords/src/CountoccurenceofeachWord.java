import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
	/**
	 *
	 * @author divya nistala
	 */
	public class CountoccurenceofeachWord {
	    public static void main(String[] args) {
	        Scanner scan= new Scanner(System.in);
	         System.out.println("Enter the name of the Novel");
	        String str= scan.nextLine();
	        try{
	        	Scanner input=new Scanner(new FileReader(str));
	        String content=input.next();
	        String [] array = content.split(" ");
	        Map <String,Integer> dictionary=new HashMap<String,Integer>();
	     int count = 0;
	     for(String word:array)
	     {
	      if(dictionary.containsKey(word)){
	          count=dictionary.get(word);
	          dictionary.put(word,count+1);
	      }
	          else
	      {
	          dictionary.put(word,1);   
	         }
	      
	     }
	     
	          for(Map.Entry<String,Integer> print:dictionary.entrySet())  
	          {
	              System.out.println("count of"+print.getKey()+print.getValue());
	          }
	        System.out.println(dictionary.toString());
	    }
        catch(FileNotFoundException e)
        {
        	System.out.println(e);
        }}}
	    


