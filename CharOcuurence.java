package week2.day1;

public class CharOcuurence {
       public static void main(String[] args) {
    	   
    	   String t1 = "welcome to chennai";
    	   char t2 = 'e';
    	   int count=0;
    	   
    	   char[] array = t1.toCharArray();
    	   int length = t1.length();
    	   			for (int i=0; i < length; i++) {
    	   				
    	   		if(t1.charAt(i)== t2)
							count++;
				
					}
    	   			System.out.println(count);
    	   		}
    	   			
       }
       


