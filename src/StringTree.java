
public class StringTree {

	Node root;
	
	public StringTree(String value) {
		root = new Node (value);
	}
	
	public void addNode(String value) {
		Node n = new Node(value);
		addNodeRec(n, root);
	}
	
	private void addNodeRec(Node newNode, Node root) {
		if (this.root == null) {
			this.root = newNode;
		}
		int result = newNode.value.compareTo(root.value);
		if (result == 0) {
			return;
		}
		else if (result > 0) {
			if(root.right == null) {
				root.right = newNode;
				return;
			}
			else {
				addNodeRec(newNode, root.right);
			}	
		}
		else {
			if(root.left == null) {
				root.left = newNode;
				return;
			}
			else {
				addNodeRec(newNode, root.left);
			}
		}
	}
	
	public void inOrderPrint() {
		inOrderPrintRec(root);
	}
	
	private void inOrderPrintRec(Node root) {
		if(root == null) return;
		inOrderPrintRec(root.left);
		System.out.println(root.value);
		inOrderPrintRec(root.right);
	}
}
