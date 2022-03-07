public class String_ {
  public static void main(String[] args) {

    // create strings
    String first = "Java";
    String second = "Programming";

    // print strings
    System.out.println(first); // print Java

    // java string methods

    // get the length of greet
    int length = first.length();
    System.out.println("The Length : " + length);

    // join two strings
    String joinedString = first.concat(second);
    System.out.println("Joined String: " + joinedString);

    // compare first and second strings
    boolean result2 = first.equals(second);
    System.out.println("Strings first and second are equal: " + result2);

  }
}