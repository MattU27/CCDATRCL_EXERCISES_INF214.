public class BinaryTree
{
	public static void main(String[] args) throws Exception {
		
		Node MainDuel = new Node("Main Duel: (Banto)");
		Node Smoker = new Node("Smoker: (Oli)"); 
		Node Initiator = new Node("Initiator: (Chas)"); 
		Node SecondDuelist = new Node("Second Duel: (Julmar)"); 
		Node Sentinel = new Node("Sentinel: (Jaa)");
        Node SecondInitiator = new Node("Second Initiator: (Kizuki)"); 
        Node SecondSmoker = new Node("Second Smoker: (Mark)");

        MainDuel.left = Smoker;
        MainDuel.right = Initiator;
        
        Smoker.left = SecondDuelist;
        Smoker.right = Sentinel;
        
        Initiator.left = SecondInitiator;

        SecondInitiator.left = SecondSmoker;

        System.out.println("\nPre-order Traversal ");
        traversePreOrder(MainDuel);
        
        System.out.print("\n");
        System.out.println("\nIn-order Traversal ");
        traverseInOrder(MainDuel);
        
        System.out.print("\n");
        System.out.println("\nPost-order Traversal ");
        traversePostOrder(MainDuel);
	}
	
    // Traverse Preorder method
    static void traversePreOrder(Node element) {
        if (element != null) {
            System.out.print(element.ValorantOrg+ " ");
            traversePreOrder(element.left);
            traversePreOrder(element.right);
        }
    }
    
    // Traverse Inorder Method
    static void traverseInOrder(Node element) {
        if (element != null) {
            traverseInOrder(element.left);
            System.out.print(element.ValorantOrg+ " ");
            traverseInOrder(element.right);
        }
    }

    // Traverse Postorder method
    static void traversePostOrder(Node element) {
        if (element != null) {
            traversePostOrder(element.left);
            traversePostOrder(element.right);
            System.out.print(element.ValorantOrg+ " ");
        }
    }
    
}
