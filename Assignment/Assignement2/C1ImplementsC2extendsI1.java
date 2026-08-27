interface Inter1{
    void cat();
}
class Small{
    void dog(){
        System.out.println("output from class small");
    }
}
class Big implements Small implements Inter1{
    void pig(){
        System.out.println("output from class big...method pig");
    }
    @Override
    public void cat(){
        System.out.println("otput from method class implemented by big");
    }
}
public class C1ImplementsC2extendsI1 {
    public static void main(String[] args) {
        System.out.println("hello");
        Big b=new Big();
        b.cat();
        b.dog();
        b.pig();

    }
}
