interface Interface1{
    void methoda();
}
interface Interface2 extends Interface1{
    void methodb();
}
class Main implements Interface2{
    void methodc(){
        System.out.println("output from methodc from main class");
    }
    @Override
    public void methoda(){
        System.out.println("output from methoda from Interface1");
    }
    @Override
    public void methodb(){
        System.out.println("output from methodb from Interface2");
    }
}
public class I1extendsI2 {
    public static void main(String[] args) {
       Main m=new Main();
       m.methoda();
       m.methodb();
       m.methodc(); 
    }
}
