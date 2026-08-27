interface I1{
    void display();
}
class C1 implements I1{
    void method1(){
        System.err.println("output from class C1...method1");
    }
    
    @Override
    public void display(){
            System.out.println("output from interface implemented by C1...method2");
        }
}
public class C1ImplementsI1 {
    public static void main(String[] args) {
        System.err.println("hello");
        C1 obj=new C1();
        obj.method1();
        obj.display();
    }
}
