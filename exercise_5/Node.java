public class Node {
    
    // Every node has three properties
    // 1. Key/Data
    String ValorantOrg;
    
    // 2. Pointer to the left child
    Node left;
// 3. Pointer to the right child
    Node right;
    
      // Constructor
    public Node(String ValorantOrg) {
        this.ValorantOrg = ValorantOrg;
        
        left = null;
        right = null;
        
    }
}
