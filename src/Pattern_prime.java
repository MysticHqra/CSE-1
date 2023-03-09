import java.util.Scanner;

class Prime {
    int x;

    Prime(int x) {
        this.x = x;
    }

    void mainMeth() {
        for (int i = 2; i <= x; i++) {
            if (isPrime(i)) {
                for (int j = 1; j <= i; j++) System.out.print("*");
                System.out.println();
            }
        }
    }

    static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}

public class Pattern_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a num: ");
        int x = sc.nextInt();
        Prime o1 = new Prime(x);
        o1.mainMeth();
    }
}