package cetpa;

public class SeriesGen {

    // a) Fibonacci series
    public static void fibonacciSeries() {
        int n = 10;
        int a = 1, b = 1;
        System.out.print("a) ");
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }

    // b) Pattern of alternating numbers
    public static void alternatingSeries() {
        System.out.print("b) ");
        for (int i = 1; i <= 6; i++) {
            System.out.print(i + " " + (i - 1) + " ");
        }
        System.out.println();
    }

    // c) Series with increasing differences
    public static void increasingDifferenceSeries() {
        int num = 1;
        System.out.print("c) ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(num + " ");
            num += i;
        }
        System.out.println();
    }

    // d) Decreasing series
    public static void decreasingSeries() {
        int num = 99;
        System.out.print("d) ");
        for (int i = 0; i < 10; i++) {
            System.out.print(num + " ");
            num -= (i + 1);
        }
        System.out.println();
    }

    // e) Powers of numbers
    public static void powerSeries() {
        System.out.print("e) ");
        for (int i = 1; i <= 5; i++) {
            System.out.print((int) Math.pow(i, i) + " ");
        }
        System.out.println();
    }

    // f) Alternating series of increasing and decreasing numbers
    public static void alternatingIncreasingDecreasing() {
        System.out.print("f) ");
        for (int i = 1, j = 10; i <= 10; i++, j--) {
            System.out.print(i + " " + j + " ");
        }
        System.out.println();
    }

    // g) Series of alphabet characters with a specific pattern
    public static void alphabetSeries() {
        char[] series = {'A', 'B', 'D', 'G', 'K', 'P', 'V'};
        System.out.print("g) ");
        for (char c : series) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        fibonacciSeries();
        alternatingSeries();
        increasingDifferenceSeries();
        decreasingSeries();
        powerSeries();
        alternatingIncreasingDecreasing();
        alphabetSeries();
    }
}

