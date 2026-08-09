interface A {
    void method1(int a);
}

interface B {
    void method2();
}

interface C {
    void method3();
}
class C1{
    void method4(){
        System.out.println("output from class C1");
    }
}
class C2 extends C1 implements A,B,C{
    
    @Override
    public void method1(int a){
        System.out.println("output from method1 and vairable a="+a);
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
public class Multiple2 {
    public static void main(String[] args){
     System.out.println("output from main method");
     C2 obj=new C2();
     obj.method1(200);
     obj.method2();
     obj.method3();
     obj.method4();
    }
}
