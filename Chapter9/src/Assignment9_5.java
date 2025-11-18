public class Assignment9_5 {

    public static double[] powArray(double[] a, int power) {
        double[] result = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = Math.pow(a[i], power);
        }

        return result;
    }

    public static int[] histogram(int[] scores, int counters) {
        int[] hist = new int[counters];

        for (int score : scores) {
            if (score >= 0 && score < counters) {
                hist[score]++;
            }
        }

        return hist;
    }

    public static void main(String[] args) {
        double[] nums = {1.0, 2.0, 3.0, 4.0};
        double[] squared = powArray(nums, 2);

        System.out.println("Squared values:");
        for (double d : squared) {
            System.out.print(d + " ");
        }

        int[] scores = {10, 20, 20, 30, 99, 0, 20};
        int[] hist = histogram(scores, 100);

        System.out.println("\n\nHistogram counts:");
        System.out.println("Score 20 occurred: " + hist[20] + " times");
    }
}
