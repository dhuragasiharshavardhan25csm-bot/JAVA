class Student {
    
    private int age;//private data age
    private String name;//private data name

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Student s = new Student();

        s.setAge(18);
        s.setName("Harsha");

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}