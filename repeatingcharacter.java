//nonrepeating characters from string
public class Main
{
	public static void main(String[] args) {
	    String str = "haritha";
	    
	    for(int i = 0; i< str.length(); i ++){
	        if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
	           System.out.println(str.charAt(i));
	        }
	    }
		
	}
}


//repeating character
public class Main
{
	public static void main(String[] args) {
	    String str = "haritha";
	    
	    for(int i = 0; i< str.length(); i ++){
	        if(str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))){
	           System.out.println(str.charAt(i));
	        }
	    }
		
	}
}
