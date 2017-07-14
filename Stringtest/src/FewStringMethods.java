
public class FewStringMethods {

	public static void main(String[] args) {

     String s = "The guy said Ibrahim is Happy";
     
     //the getChar method
     System.out.println(s.charAt(13));
     
     //the getChars()
     int startIndex = 13;
     int endIndex = 20; // end of the substring + 1
     char [] extracted = new char [endIndex-startIndex];//endIndex-startIndex = length of the array;
     s.getChars(13, 20, extracted,0);// extract the chars into 'extracted'
     System.out.println(extracted);
     
     // the the same substring using toCharArray;
      char [] sArr = s.toCharArray();
      
      String st = "";// empty string to hold my substring characters
      for(int i = startIndex;i<endIndex;i++){
    	  
    	  st += sArr[i];
        }
      System.out.println(st);
      
      //equals() versus == with String
      
      // both references point to object with the same sequence of characters
      String str1 = "Brahima";
      String str2 = new String("Brahima");
      System.out.println(str1.equals(str2));// returns true cause the sequence of characters are the same
      System.out.println(str1==str2);// returns false cause str1 and str2 point to different objects
      

	}

}
