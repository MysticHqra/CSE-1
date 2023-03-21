class Rectangle {
    double l, b;

    void setVar(double l, double b) {
        this.l = l;
        this.b = b;
    }
    void getVar() {
        System.out.println("Length: " + l);
        System.out.println("Breadth: " + b);
    }
}
public class Testmain2 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        obj1.setVar(8.84, 7.21);
        obj1.getVar();
    }
}
