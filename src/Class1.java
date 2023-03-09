import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle o1 = new Circle();
        System.out.print("Input the radius of circle: ");
        o1.r = sc.nextDouble();
        System.out.println(o1.area());
        System.out.println(o1.circumference());
    }
}

class Circle {
    double r;
    double pi = 3.1415;

    double area() {
        return pi * r * r;
    }

    double circumference() {
        return 2 * pi * r;
    }
}