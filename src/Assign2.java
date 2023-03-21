/* 2. Write a Java Program to define a class, define instance methods for setting
 * and Retrieving values of instance variables and instantiate its object */

class Box {
    double l, b, h;

    void setVar(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    void getVar() {
        System.out.println("Length: " + l);
        System.out.println("Breadth: " + b);
        System.out.println("Height: " + h);
    }

}

public class Assign2 {
    public static void main(String[] args) {
        Box obj1 = new Box();
        obj1.setVar(3.4, 4.3, 6.8);
        obj1.getVar();
    }
}