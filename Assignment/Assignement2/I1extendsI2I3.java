interface I2 {
    void display2();
}

interface I3 {
    void display3();
}

interface I1 extends I2, I3 {
    void display1();
}

class C1 implements I1 {
    @Override
    public void display1() {
        System.out.println("I1 method");
    }
    @Override
    public void display2() {
        System.out.println("I2 method");
    }
    @Override
    public void display3() {
        System.out.println("I3 method");
    }
}

public class I1extendsI2I3Z{

    public static void main(String[] args) {
        C1 obj = new C1();

        obj.display1();
        obj.display2();
        obj.display3();
    }
}