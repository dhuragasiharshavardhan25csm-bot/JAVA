interface A{
    int a=10;
    void method1();
}
interface B{
    int b=20;
    void method2();
}
class Multi implements A,B{
    void method3(){
        System.out.println("this is the output from class multi");
    }
@Override
public void method1(){
    System.out.println("this is he out put from interface A");

}
@Override
public void method2(){
    System.out.println("this is he out put from interface B");


}
}

public class Interface {
    public static void main(String[] args){
    System.out.println("output from main method");
    Multi obj=new Multi();
    obj.method1();
    obj.method2();
    
}
}
