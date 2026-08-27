class C1{
    int x=10;
    void method1(){
        System.err.println("value of x:"+x);
    }
}

class C2 extends C1{
     void method2(){
        int y=20;
        System.err.println("value of x accessed in c2:"+super.x);
        System.err.println("value of y:"+y);
     }

}
public class C1ExtendsC2 {
    public static void main(String[] args) {
     System.out.println("hello");   
     C2 obj=new C2();
     obj.method1();
     obj.method2();
    }
}
