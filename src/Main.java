
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		StringTree tree = new StringTree("onion");
		tree.addNode("apple");
		tree.addNode("carrot");
		tree.addNode("banana");
		tree.addNode("tomato");
		tree.addNode("orange");
		tree.addNode("cucumber");
		tree.addNode("pear");
		tree.addNode("pepper");
		tree.addNode("grapes");
		tree.addNode("cauliflower");
		tree.addNode("apricot");
		tree.addNode("broccoli");
		tree.addNode("nectarine");
		tree.addNode("kale");
		
		boolean run = true;
		String entry = null;
		
		System.out.println("Type in a fruit or vegetable to add it to the tree: ");
		while(run) {
			entry = scan.nextLine(); 
			if (entry.equalsIgnoreCase("end")) {
				run = false;
			}
			
			else {
			tree.addNode(entry);
			tree.inOrderPrint();
			System.out.println("\n" + "Please type in another fruit or vegetable to add it to the tree. Type end to exit: ");
			}
		}
	}
}
