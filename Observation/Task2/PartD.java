//polymorph
class AreaCalculator {
    double area(double radius) { 
        return Math.PI * radius * radius;
    }
  double area(double length, double breadth) { 
        return length * breadth;
    }
    double area(double base, double height, boolean triangle) { 
            return 0.5 * base * height;
    }
}

class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Car.");
    }
}

class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Bike.");
    }
} 
public class PartD {
    public static void main(String[] args){
        Vehicle v = new Vehicle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        v.display();
        car.display();
        bike.display();
    }
}
