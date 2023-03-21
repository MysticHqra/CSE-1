public class Polymorphism {
    int a = 3, b = 4;

    //overloading or static/compile-time polymorphism
    void fun1() {
        System.out.println("Parent fun1() executed...");
        System.out.println("A: " + a + ", B: " + b);
    }
    void fun1(int tempvar) {
        System.out.println("Parent fun1(int tempvar) executed...");
        System.out.println("A: " + a + ", B: " + b);
    }

    void fun_special(Subpoly obj) {
        System.out.println("a: " + a + ", " + "b: " + b + ", " + "obj.a: " + obj.a + ", " + "obj.b: " + obj.b);
        a = 10; //modifies parent class a
        b = 10; //modifies parent class b
        System.out.println("a: " + a + ", " + "b: " + b + ", " + "obj.a: " + obj.a + ", " + "obj.b: " + obj.b);
    }

    //Typecasting (implicitly) object with Parent class makes object point to Parent class instance variables
    void fun_special_2(Polymorphism obj) {
        System.out.println("a: " + a + ", " + "b: " + b + ", " + "obj.a: " + obj.a + ", " + "obj.b: " + obj.b);
    }

    void fun2() {
        System.out.println("Parent class unique method executed");
    }
}

class Subpoly extends Polymorphism {
    int a = 5, b = 6;
    int c = 7, d = 8;

    void fun1() { //Dynamic method dispatch or Dynamic binding or Late binding or Runtime (dynamic) polymorphism
        super.fun1();
        System.out.println("Overriding...");
        System.out.println("A: " + a + ", B: " + b);
    }

    //Without overriding, (inheriting only) obj will point to a=3, b=4
    //With overriding, it will point to a=5, b=6
    /*void fun1(int tempvar) {
        System.out.println("A: " + a + ", B: " + b);
    }*/

    void fun3() {
        System.out.println("Child class unique method executed");
    }

}

class Main2 {
    public static void main(String[] args) {
        Polymorphism obj1 = new Polymorphism();
        System.out.println("Parent class obj:");
        obj1.fun1();
        obj1.fun1(0); //overloading
        /*obj1.fun_special(obj1);*/ //Error because parent class object cannot be type-casted as Child class obj in the formal parameter
        obj1.fun_special_2(obj1);
        obj1.fun2();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        /*System.out.println(obj1.c);*/ //c doesn't exist for parent class object
        /*System.out.println(obj1.d);*/ //d doesn't exist for parent class object
        Subpoly obj2 = new Subpoly();
        System.out.println("Child class obj:");
        obj2.fun1();
        obj2.fun1(0);
        obj2.fun_special(obj2);
        obj2.fun_special_2(obj2);
        obj2.fun3();
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(obj2.c);
        System.out.println(obj2.d);
        Polymorphism obj3 = new Subpoly(); //Upcasting with parent class
        System.out.println("Upcasted object: ");
        obj3.fun1(); //works since fun1() is overridden in child class
        obj3.fun1(0);
        obj3.fun2(); //works since method is unique to parent class
        /*obj3.fun3();*/ //--> Error because upcasting neglects child class methods except those which are overridden
        /*obj3.fun_special(obj3);*/ //--> Error because parent class type object cannot be type-casted as child class obj
        obj3.fun_special_2(obj3);
        System.out.println(obj3.a);
        System.out.println(obj3.b);
        /*System.out.println(obj3.c);*/ //--> Error because upcasting neglects child class instance variables
        /*System.out.println(obj3.d);*/ //--> Error because upcasting neglects child class instance variables
    }
}
