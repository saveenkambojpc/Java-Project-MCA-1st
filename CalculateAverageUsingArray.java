public class CalculateAverageUsingArray {
    public static void main(String[] args) {

        float[] marks = { 2, 4, 5, 6 };

        float sum = 0;

        for (float e : marks) {
            sum += e;
        }

        float avg = sum / marks.length;
        System.out.println("The Average is : " + avg);

    }
}
