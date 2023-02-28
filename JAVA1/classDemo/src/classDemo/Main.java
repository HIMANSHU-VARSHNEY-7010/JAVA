package classDemo;
public class Main {
    public static void main(String[] args) {
        demoClass dc1 = new demoClass(12,14);
        System.out.println("A: " + dc1.getA());
        System.out.println("B: " + dc1.getB());
        System.out.println("Addition: " + dc1.addition(13.5,16));
        dc1.setA(25);
        dc1.setB(34);
        System.out.println("New A: " + dc1.getA());
        System.out.println("New B: " + dc1.getB());
        System.out.println("Addition: " + dc1.addition());
        demoClass dc2 = new demoClass(20,17);
        System.out.println("A: " + dc2.getA());
        System.out.println("B: " + dc2.getB());
        System.out.println("Subtraction: " + dc2.subtraction());
    }
}