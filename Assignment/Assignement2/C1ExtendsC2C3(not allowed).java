class C2{
    void method1(){
        System.err.println("this is the out put from C2");
    }
}
class C3{
    void method2(){
        System.err.println("this is the out put from C3");
    }
}
class C1 implements C2,C2{

}

public class C1ExtendsC2C3 {
    public static void main(String[] args) {
        System.err.println("helloo");
    }
}
