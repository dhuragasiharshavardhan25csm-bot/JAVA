class A{
    void setAge(int age){
        if(age<0){
            throw new IllegalArgumentException("cannot be negative");
        }
        System.out.println("age is:"+age);

    }
}
public class IllegalArgumentExample{
    public static void main(String[] args) {
        A a=new A();
        try{
        a.setAge(-5);
        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }

}