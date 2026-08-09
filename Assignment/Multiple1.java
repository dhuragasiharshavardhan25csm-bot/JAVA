interface A{
    void method1(int a);
}
class C1{
    void method2(){
        System.out.println("output from class C1");
    }
}
class C2 extends C1 implements A{
    void method3(){
        System.out.println("output from method3");
    }
    @Override
    public void method1(int a){
        System.out.println("output from method1 and vairable a="+a);
    }
}
public class Multiple1 {
    public static void main(String[] args){
        System.out.println("output from main method");
        C2 obj=new C2();
        obj.method1(10);
        obj.method2();
        obj.method3();
    }
}
