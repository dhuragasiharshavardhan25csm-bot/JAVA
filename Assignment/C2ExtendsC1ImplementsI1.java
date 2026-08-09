interface I1 {
    void method1();
}



class C1 {
    void method2() {
        System.out.println("Output from class C1");
    }
}

class C2 extends C1 implements I1 {

    @Override
    public void method1() {
        System.out.println("Output from interface I1");
    }
    void method3() {
        System.out.println("Output from class C2");
    }
}

public class C2ExtendsC1ImplementsI1 {
    public static void main(String[] args) {

        C2 obj = new C2();

        obj.method1();
        obj.method2();
        obj.method3();
    
    }
}