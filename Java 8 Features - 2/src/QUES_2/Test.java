package QUES_2;

public interface Test {
    default void showDefault() {
        System.out.println("Default Interface Method is Called");
    }

    static void showStatic() {
        System.out.println("Static Interface Method is Called");
    }
}
