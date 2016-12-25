
public class StringTest {
public static void main(String...strings){
	//Strings are created using string literals 
	String a = "Brahima";
	System.out.println(a);
	
	//or a constructor
	String b = new String("Traore");
	String c = new String(); c = "Initialisation";
	System.out.println(b);
    System.out.println(c);
	
	//or using array of characters with or without a substring
	char ch [] = {'a','b','c','d','e','f'}; 
	String str = new String(ch,0,3);
	System.out.println(str);
	
	//or array of bytes
	byte arr [] = {65,66,67,68,69,70};
	String st = new String(arr);
	System.out.println(st);
	st = new String(arr,0,3);
	
	//From a StringBuilder and StringBuffer classes
	String str1 = new String(new StringBuilder("I am Happy "));
	String str2 = new String(new StringBuffer("Today"));
	System.out.println(str1.concat(str2));
	
	//Strings are immutable
	String d = "Hello";
	System.out.println("old_d= "+ d);
	//create another reference that points to the same object
	String e = d;
	System.out.println(e);
	//let's try to override the object containing "Hello";	
	d = d.replace("e", "a");
	//d now points to another object instead of pointing to an overridden version of hello
	System.out.println("new_d= "+d);
	//because the object containing "Hello" still exist and is referenced by 'e'
	//If strings were not immutable, the following would print Hallo but it still prints Hello
	System.out.println(e);
	
	
	
}
}
