class A{
    int x=10;
    void method1(){
        System.out.println("output from class A="+(this.x+10));
    }
}
class B extends A{
  
    void method2(){
        System.out.println("output from class B="+(super.x+20));
    }
}
public class Single {
    public static void main(String args[]){
        System.out.println("hello");
        B obj=new B();
        obj.method2();
        obj.method1();
    }
}
