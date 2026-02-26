package MathDemo;

public class Mathd {

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
