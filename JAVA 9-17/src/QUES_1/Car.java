package QUES_1;

public interface Car {
    private static int wheels(){
        return 4;
    }
    static void speed(){
        System.out.println("The Car runs with a speed of 300KM/H and have " + wheels() + " wheels.");
    }
}
