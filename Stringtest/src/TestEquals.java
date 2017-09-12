
public class TestEquals {

	
	
	public static void main(String ...args){
		
		/*Only one object is created in the string pool to hold these literals 
		 * name1 and name2 points to the same object in the memory
		 * */
		String name = "makassi";
		String name1 = "makassi";
		
		System.out.print("name==name1: ");
		System.out.println(name==name1);
		System.out.print("name.equals(name1): ");
		System.out.println(name.equals(name1));
		System.out.print("name.hashCode()==name1.hashCode(): ");
		System.out.println(name.hashCode()==name1.hashCode());
		
		System.out.println();
		
		/*Two different references are created but LIKELY one Object is created in memory
		 * for both references(for intelligent memory management)
		 * name1 and name2 points to the same object in the memory, that,s why they have the same hashcode().
		 * */
		String name2 = new String("Brahima");
		String name3 = new String("Brahima");
		
		System.out.print("name2==name3: ");
		System.out.println(name2==name3);
		System.out.print("name2.equals(name3): ");
		System.out.println(name2.equals(name3));
		System.out.print("name2.hashCode()==name3.hashCode(): ");
		System.out.println(name2.hashCode()==name3.hashCode());
		
		System.out.println();
		
		/*Two different references are created because they the have different content, two object will be created
		 * in memory, then two different hashcode().
		 * for both references(for intelligent memory management)
		 * name1 and name2 points to the same object in the memory, that,s why they have the same hashcode().
		 * */
		String name4 = new String("Traore");
		String name5 = new String("tRAORE");
		
		System.out.print("name4==name5: ");
		System.out.println(name4==name5);
		System.out.print("name4.equals(name5): ");
		System.out.println(name4.equals(name5));
		System.out.print("name4.hashCode()==name5.hashCode(): ");
		System.out.println(name4.hashCode()==name5.hashCode());
	}
}
