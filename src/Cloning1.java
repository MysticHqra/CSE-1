class Clone1 {
    int x=3, y=5;
}

class Clone2 implements Cloneable {
    int a = 7;
    int b = 8;

    Clone1 a1 = new Clone1();

    public Object clone() throws CloneNotSupportedException {
        Clone2 obj1 = (Clone2) super.clone();
        obj1.a1 = new Clone1();
        obj1.a1.x = a1.x;
        obj1.a1.y = a1.y;
        return obj1;
    }
}

public class Cloning1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Clone2 obj1 = new Clone2();
        Clone2 obj2 = (Clone2)obj1.clone();
        obj1.a = 10;
        obj1.b = 12;
        obj1.a1.x = 15;
        obj1.a1.y = 20;
        System.out.println(obj1.a + " " + obj1.b + " " + obj2.a + " " + obj2.b);
        System.out.println(obj1.a1.x + " " + obj1.a1.y + " " + obj2.a1.x + " " + obj2.a1.y);
    }
}
