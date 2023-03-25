public class Prac2 {
    int x = 3, y = 4;
}

class Subprac1 {
    int a = 8, b = 9;
    Prac2 o1 = new Prac2();

    void display() {
        System.out.println(o1.x);
        System.out.println(o1.y);
    }

}

class Main4 {
    public static void main(String[] args)  {
        Subprac1 obj1 = new Subprac1();
        Subprac1 obj2 = new Subprac1();
        obj1.o1.x = 10;
        obj1.o1.y = 12;
        System.out.println(obj1.o1.x);
        System.out.println(obj1.o1.y);
        System.out.println(obj2.o1.x);
        System.out.println(obj2.o1.y);
    }

}