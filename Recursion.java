public class Recursion {
    public static void counting(int n) {
        if (n < 0) {
            return;
        }
        counting(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        // Print couting using Recursion
        counting(10);

    }
}
