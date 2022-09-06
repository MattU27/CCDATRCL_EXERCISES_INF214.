// Array implementation of Stack
public class App {
  public static void main(String[] args) {

    // Create new Stack Object
    Stack cannedgoods_stack = new Stack(5);

    // Insert new elements into the stack
    cannedgoods_stack.push("555");
    cannedgoods_stack.push("Argentina");
    cannedgoods_stack.push("Century");
    cannedgoods_stack.push("San Marino");

    // Show the size of the stack
    System.out.println("The size of the stack is: " + cannedgoods_stack.size());

    // Show top element in the stack
    System.out.println("The top of the stack is: " + cannedgoods_stack.peek());

    // Remove top element in the stack
    cannedgoods_stack.pop();

    System.out.println("After pop");

    // Show all elements in Stack
    cannedgoods_stack.printStack();

    // Show top element in the stack
    System.out.println("The top of the stack is: " + cannedgoods_stack.peek());
  }
}
