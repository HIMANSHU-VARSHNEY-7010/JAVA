package roots_quad_eq;

public class Main {
    public static void main(String[] args) {
        quad q1 = new quad(1,-1, -30);
        if(q1.disc() < 0){
            System.out.println("Imaginary Roots");
        }
        else {
            System.out.println("Roots are : " + q1.root1() + " , " + q1.root2());
        }

    }
}