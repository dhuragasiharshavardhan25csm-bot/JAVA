interface A {
    void method1(int c);
}
class B implements A{
    void method2(){
        System.out.println("output from class B");

    }
    @Override
    public void method1(int c){
        System.out.println("output from method1 and vairable a="+c);
    }
}
public class ClassImplementsInterface {
    public static void main(String[] args){
        System.out.println("ooutput from main class");
        B obj=new B();
        obj.method1(100);
        obj.method2();
    }
}
