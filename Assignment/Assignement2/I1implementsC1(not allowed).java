interface I1{
    void show();
}
class C1 implements I1{
    void important(){
        System.out.println("output from C1");
    }
}
public class I1implementsC1 {
    public static void main(String[] args) {
        System.out.println("hello");
        C1 c=new C1();
        c.show();
        c.important();
    }
}
