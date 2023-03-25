public class Ramana1 {

    int a = 3;
    int b;
    static int c = 5;

    void fun1() {
        System.out.println(a + b);
        a = 69;
    }

    static void fun2() {

    }

}

class ChildRamana1 extends Ramana1 {
    int b;

    void display() {
        System.out.println("Super class A:");
        System.out.println(super.a);
        System.out.println("Child class A: ");
        System.out.println(this.a);
    }

}

class Main3 {
    public static void main(String[] args) {
        ChildRamana1 o1 = new ChildRamana1();
        o1.display();
    }
}
