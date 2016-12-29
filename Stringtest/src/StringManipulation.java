
public class StringManipulation {

	public static void main(String...args){
		
		// the join static method added by JDK8
		String identity = String.join("**", "Saka","Zulu","21-NOV","1980");
		System.out.println("identity: " + identity);
		
		// use of the contains() method
		System.out.println("identity contains Zulu: " + identity.contains("Zulu"));
		
		//The contains method is key sensitive		
		System.out.println("identity contains zulu: " +identity.contains("zulu"));
		
		// the contentEquals() method check the String content similar to equals();
		System.out.println("The content of identity is: "+identity.contentEquals("Saka**Zulu**21-NOV**1980"));
		System.out.println("identity= "+identity.equals("Saka**Zulu**21-NOV**1980"));
		System.out.println("identity is empty: "+identity.isEmpty());
		System.out.println(" \"\" is empty: " +"".isEmpty());//Empty String
		System.out.println(" \" \" is empty: " +" ".isEmpty()); // is not empty, because is contains a white space.
		
		
		// Case conversion methods(); non--alphabetical characters are not taken into account
		System.out.println("identity in lowwercas: "+identity.toLowerCase());
		System.out.println("identity in uppercase: "+identity.toUpperCase());
		
		// replacing portion of a string
		System.out.println("Replacing first Saka with Manu: "+ identity.replaceFirst("Saka","Manu"));
		System.out.println("Repacing all 'a' with 'o': "+ identity.replaceAll("a", "o") );
		
		// Splitting a String
		
		String[] splittedIdentity = identity.split("21-");
		
		System.out.println("identity splitted using 21- ");
		for(String s :splittedIdentity ){
		System.out.println(s);
		}
		
		
	}
}