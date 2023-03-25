public class Recur1 {
    static void PatRow(int n) {
        if (n<1)
            return;
        PatCol(n);
        System.out.println();
        PatRow(n-1);
    }
    static void PatCol(int n) {
        if (n<1)
            return;
        System.out.print("* ");
        PatCol(n-1);
    }

    static void PatRow2(int n) {
        if (n<1)
            return;
        PatColSpace(n-1);
        PatCol2(6-n);
        System.out.println();
        PatRow2(n-1);
    }
    static void PatColSpace(int n) {
        if (n<1)
            return;
        System.out.print("  ");
        PatColSpace(n-1);
    }
    static void PatCol2(int n) {
        if (n<1)
            return;
        System.out.print("*   ");
        PatCol2(n-1);
    }
    public static void main(String[] args) {
        PatRow(5);
        PatRow2(5);
    }
}
