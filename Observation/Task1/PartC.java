// inheritance super:person sub:student and faculty
class Person {
    void method1(){
        System.out.println("output from class person");
    }
}
class Student extends Person {
    void method2(){
        System.out.println("output from class student which inherit person");
    }
}

class Faculty extends Person {
    void method3(){
        System.out.println("output from class faculty which inherits person");
    }
}
public class PartC {
    public static void main(String[] args){
         Student obj=new Student();
         obj.method1();
         obj.method2();

         Faculty obj2=new Faculty();
         obj2.method1();
         obj2.method3();
    }
}
