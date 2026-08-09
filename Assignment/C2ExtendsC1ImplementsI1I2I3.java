interface I1 {
    void method1();
}

interface I2 {
    void method2();
}

interface I3 {
    void method3();
}

class C1 {
    void method4() {
        System.out.println("Output from class C1");
    }
}

class C2 extends C1 implements I1, I2, I3 {

    @Override
    public void method1() {
        System.out.println("Output from interface I1");
    }

    @Override
    public void method2() {
        System.out.println("Output from interface I2");
    }

    @Override
    public void method3() {
        System.out.println("Output from interface I3");
    }

    void method5() {
        System.out.println("Output from class C2");
    }
}

public class C2ExtendsC1ImplementsI1I2I3 {
    public static void main(String[] args) {

        C2 obj = new C2();

        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
    }
}