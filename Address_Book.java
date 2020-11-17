
import java.util.Scanner;

public class Address_Book {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("prompt- enter anything");
		System.out.println("user input-" +sc.next());
		while ( userinput != exit) {
			switch (sc) {
				case add::		//1 for adding 
					obj.add:
				case delete::	//2 for deleting
					obj.remove:
				case edit::		//3 for editing
					obj.set:
				case fetch::
					obj.set:
				case exit::
					System.out.println("exiting");
					break;;
				
					
			esac
		}
	}
		System.out.println ("1 for add" +add)
		System.out.println("2 = Delete" +delete)
		System.out.println("3 = Editing")
		System.out.println("4 = Fetching")
		System.out.println("5 = Exit")
}
