import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> SchoolEnrollment = new LinkedList<>();

        // Adds elements to the queue
        SchoolEnrollment.add("Jethro Ruiz Vargas");
        SchoolEnrollment.add("Neil Rifarial");
        SchoolEnrollment.add("Vincent Paul Saavedra");
        SchoolEnrollment.add("Alliyah Almocera");
        SchoolEnrollment.add("Marvin John Gonzales");

        // Display all elements of the queue.
        System.out.println(SchoolEnrollment);

        // Returns the number of elements in the queue.
        System.out.println(SchoolEnrollment.size());

        // Shows the element at the front of the queue
        System.out.println(SchoolEnrollment.peek());

        // Removes the element at the front of the queue
        SchoolEnrollment.remove();
        SchoolEnrollment.remove();
        SchoolEnrollment.remove();
        SchoolEnrollment.remove();
        SchoolEnrollment.remove();
        
        SchoolEnrollment.add("Hani Hafiz Elhag");
        SchoolEnrollment.add("John Christian Masangcay");
        SchoolEnrollment.add("Carlos Leslie Legaspi");
        SchoolEnrollment.add("Jean Angelo Flores");
        SchoolEnrollment.add("Alexander John Du");
        
        // Returns the number of elements in the queue.
        System.out.println(SchoolEnrollment.size());

        // Shows the element at the front of the queue
        System.out.println(SchoolEnrollment.peek());

        // Display all elements of the queue.
        System.out.println(SchoolEnrollment);
    }
}
