//single inheritance
class A{
    void method1(){
        System.out.println("sinle inheritance...A");
    }
}

class B extends A{
    void method2(){
        System.out.println("single inheritance...B");
    }
}

//multi-level inheritance
class C{
    void method3(){
        System.out.println("multi-level inheritance...C");
    }
}
class D extends C{
    void method4(){
        System.out.println("multi-level inheritance...D");
    }
}
class E extends D{
    void method5(){
        System.out.println("multi-level inheritance...E");
    }
}

//hierarchical inheritance
class F{
    void common(){
        System.out.println("hierarchical inheritance...F");
    }
}
class G extends F{
    void method6(){
        System.out.println("hierarchical inheritance...G");
    }
}
class H extends F{
    void method7(){
        System.out.println("hierarchical inheritance...H");
    }
}

//hybrid Inheritance(hierarchical+multi-level)
class I{
    void common1(){
        System.out.println("hybrid Inheritance...I...common1");
    }
}
class J extends I{
    void method8(){
         System.out.println("hybrid Inheritance...J...method8");
    }
}
class K extends J{
    void method9(){
        System.out.println("hybrid Inheritance...K...method9");
    }
}
class L extends I{
    void method10(){
        System.out.println("hybrid Inheritance...L...method10");
    }
}



public class Inheritance{

    public static void main(String[] args){
        
        //single inheritance
        System.out.println("single Inheritance");
        B b=new B();
        b.method1();
        b.method2();
        System.out.println(" ");


        //multi-level inheritance
        System.out.println("Multi-level inheritance");
        E e=new E();
        e.method3();
        e.method4();
        e.method5();
         System.out.println(" ");


        //hierarchical inheritance
        System.out.println("hierarchical inheritance");
        G g=new G();
        g.common();
        g.method6();

        H h=new H();
        h.common();
        h.method7();
         System.out.println(" ");

        //hybrid Inheritance
        System.out.println("hybrid Inheritance");
          //multi-level
          K k=new K();
          k.common1();
          k.method8();
          k.method9();
          System.out.println(" ");

          //hybrid Inheritance
          J j=new J();
          j.common1();
          j.method8();

          L l=new L();
          l.common1();
          l.method10();


    }
}
