abstract class A{
    void method1(){
        System.out.println("out put from class A");
    }
    abstract void method2();
}
class B extends A{
     void method3(){
        System.out.println("output from class B");
     }
     @Override
     void method2(){
       System.out.println("output from class A inherited by class B");
     }
}
public class Abstract {
    public static void main(String[] args){
        B obj=new B();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
