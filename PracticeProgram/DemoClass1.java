class DemoClass1{
    void method1(){
        int a=10,b=20;
        int c=a+b;
        System.out.println("sum="+c);
    }
    int method2(int x,int y){
        return x+y+100;
    }
public static void main(String[] args){
        System.out.println("hello");
        DemoClass1 obj = new DemoClass1();
        obj.method1();
        System.out.println("result="+obj.method2(10,20));
}    
}
