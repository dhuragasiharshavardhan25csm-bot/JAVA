interface A {
    void method1(int d);
}

interface B {
    void method2();
}

interface C {
    void method3();
}
class C1 implements A,B,C{
    void method4(){
        System.out.println("output from class C1");
    }
    
    @Override
    public void method1(int d){
        System.out.println("output from method1 and vairable d="+d);
    }
    @Override
    public void method2(){
        System.out.println("output from method2 in interface B ");
    }
    @Override
    public void method3(){
        System.out.println("output from method3 in interface C");
    }

}
    
public class ClassImplementsMultipleInterfaces {
    public static void main(String[] args){
     System.out.println("output from main method");
     C1 obj=new C1();
     obj.method1(24);
     obj.method2();
     obj.method3();
     obj.method4();
    }
}
