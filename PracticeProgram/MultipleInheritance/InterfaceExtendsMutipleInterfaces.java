interface A {
    void method1();
}

interface B {
    void method2();
}

interface C extends A, B {
    void method3();
}

class Demo implements C {
    void method(){
        System.out.println("output from main method");
    }
    public void method1() {
        System.out.println("Method 1 in interface A");
    }

    public void method2() {
        System.out.println("Method 2 in interface B");
    }

    public void method3() {
        System.out.println("Method 3 in interface C");
    }
}

public class InterfaceExtendsMutipleInterfaces {

    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.method();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
