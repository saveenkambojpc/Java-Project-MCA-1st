import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // Add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");

        System.out.println("ArrayList: " + languages);

        // get the element from the arraylist
        String str = languages.get(1);
        System.out.println("Element at index 1: " + str);

        // change the element of the array list
        languages.set(2, "Javascript");
        System.out.println("Modified ArrayList: " + languages);
    }
}