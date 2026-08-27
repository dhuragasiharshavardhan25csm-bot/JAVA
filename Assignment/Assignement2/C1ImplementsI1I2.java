interface I1 {
    void display1();
}
interface I2{
	void display2();
}
class C1 implements I1,I2 {
    void method1(){
        System.out.println("output from C1");
    }

    @Override
    public void display1() {
        System.out.println("C1 implements I1");
    }
    @Override
    public void display2() {
    	System.out.println("C1 implements I2 ");
    }
    
}

public class C1ImplementsI1I2 {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.method1();
        obj.display1();
        obj.display2();
    }
}