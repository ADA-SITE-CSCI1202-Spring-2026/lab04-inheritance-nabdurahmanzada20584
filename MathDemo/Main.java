package MathDemo;

public class Main {

    public static void main(String[] args) {
        System.out.println(Mathd.min(2, 3));
        System.out.println(Mathd.max(2, 3));
        Mathd math = new Mathd();

        System.out.println(math.sum(new int[]{1, 2, 3, 4, 5}));
    }

}
