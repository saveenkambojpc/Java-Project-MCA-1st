public class Array {
    public static void main(String[] args) {

        // create an array
        int[] age = { 12, 4, 5 };

        // access value
        System.out.println("First element : "+age[0]);

        // loop through the array
        // using for loop
        System.out.println("Using for Loop:");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i]+" ");
        }
    }
}