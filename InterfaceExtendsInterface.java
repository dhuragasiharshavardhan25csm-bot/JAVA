interface A{
    int a=10;
    void method1();
}
interface B extends A{
    int b=20;
    void method2();
}
class C implements B{
    void method3(){
        System.out.println("this is the output from class multi");
    }
@Override
public void method1(){
    System.out.println("this is he out put from interface A");

}
@Override
public void method2(){
    System.out.println("this is he out put from interface xyzzz");


}
}
public class InterfaceExtendsInterface {
    public static void main(String[] args){
    System.out.println("output from main method");
    C obj=new C();
    obj.method1();
    obj.method2();
    }
    
}
