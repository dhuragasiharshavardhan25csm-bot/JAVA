class Animals{
    String name;
    String place;
    String food;
    String sound;

    Animals(String name,String place,String food,String sound){
        this.name=name;
        this.place=place;
        this.food=food;
        this.sound=sound;

    }

    void display(){
       System.out.println("the animal "+name+" stays in "+place+" and eats "+food+" and make the sound "+sound);
    }
}
public class FarmHouse {
    public static void main(String[] args) {
        Animals cow=new Animals("cow","coewhed","grass","aaaaaaa");
        Animals pig=new Animals("pig","pigshed","grass","ooooo");
        Animals horse=new Animals("horse","shed", "grass", "hmmmm");

        cow.display();
        pig.display();
        horse.display();
    }
}
