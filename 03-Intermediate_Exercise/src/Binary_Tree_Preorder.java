class Nodong{
	int data;
	Nodong right;
	Nodong left;
	
	Nodong(int d){
		data = d;
		right = left = null;
	}
}

class Link_Bin{
	Nodong head;

	public void preOrder(Nodong node) {
		if (node == null) {
			return;
		}
		
		System.out.print(node.data + " ");	
		preOrder(node.left);
		preOrder(node.right);
		return;
	}

}
public class Binary_Tree_Preorder {
	public static void main(String[] args) {
		Link_Bin tree = new Link_Bin();
		tree.head = new Nodong(10);
		tree.head.left = new Nodong(20);
		tree.head.right = new Nodong(30);
		tree.head.left.left = new Nodong(40);
		tree.head.left.right = new Nodong(50);
		
		tree.preOrder(tree.head);
	}

}