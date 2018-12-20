package ua.warmup1;

public class Close10 {
    public static void main(String[] args) {
//        Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
//
//        close10(8, 13) → 8
//        close10(13, 8) → 8
//        close10(13, 7) → 0

        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));
    }

    public static int close10(int a, int b) {
        int resA = Math.abs(10 - a);
        int resB = Math.abs(10 - b);

        if(resA == resB){
            return 0;
        } else if(resA > resB){
            return b;
        } else {
            return a;
        }
    }

    public static int close10_2(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;  // i.e. aDiff == bDiff

        // Solution notes: aDiff/bDiff local vars clean the code up a bit.
        // Could have "else" before the second if and the return 0.
    }

}
