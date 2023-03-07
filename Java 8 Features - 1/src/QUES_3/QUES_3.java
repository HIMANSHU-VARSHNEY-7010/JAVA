package QUES_3;
//  Q3) Implement multiple inheritance with default method inside interface.
interface AutoMobiles {
    default void show(){
        System.out.println("This is a AutoMobile.");
    };
}

interface Car extends AutoMobiles{
    default void show(){
        System.out.println("This is a Car.");
    };
}

class SuperCar implements AutoMobiles , Car {
    public void show(){
        System.out.println("This is a Super Car.");
    }
}

public class QUES_3 {
    public static void main(String[] args) {
        SuperCar SC = new SuperCar() ;
        SC.show();
    }
}
