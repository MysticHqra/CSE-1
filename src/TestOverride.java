public class TestOverride implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected void method1() {
        System.out.println("hi");
    }
}

class Suboverride extends TestOverride {
    void test() {
        method1();
    }
}

class TestOverrideDriver {
    public static void main(String[] args) throws CloneNotSupportedException {
        TestOverride o1 = new Suboverride();
        o1.method1();

        Suboverride o2 = new Suboverride();
        o2.test();
    }

}
