/* 1. Write a Java Program to define a class, describe its constructor,
 *  overload the Constructors and instantiate its object */

class SubAssign1 {
    int a, b;

    SubAssign1() {
        a = 6;
        b = 8;
    }

    SubAssign1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
    }

}

public class Assign1 {
    public static void main(String[] args) {
        SubAssign1 obj1 = new SubAssign1();
        SubAssign1 obj2 = new SubAssign1(14, 18);
        obj1.display();
        obj2.display();
    }
}