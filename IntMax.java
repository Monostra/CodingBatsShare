package ua.warmup1;

public class IntMax {
    public static void main(String[] args) {
//        Given three int values, a b c, return the largest.
//
//        intMax(1, 2, 3) → 3
//        intMax(1, 3, 2) → 3
//        intMax(3, 2, 1) → 3

        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));
    }

    public static int intMax(int a, int b, int c) {
        if(a > b && a > c) {
            return a;
        } else if(b > a && b > c) {
            return b;
        } else{
            return c;
        }
    }

    public static int intMax2(int a, int b, int c) {
        int max;

        // First check between a and b
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        // Now check between max and c
        if (c > max) {
            max = c;
        }

        return max;

        // Could use the built in Math.max(x, y) function which selects the larger
        // of two values.
    }
}
