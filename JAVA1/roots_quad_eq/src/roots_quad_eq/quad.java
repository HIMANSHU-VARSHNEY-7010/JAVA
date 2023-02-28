package roots_quad_eq;

public class quad {
    private int a = 0;
    private int b = 0;
    private int c = 0;

    quad(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double disc(){
        return ((b*b) -4*a*c);
    }
    public double root1(){
        return ((-b + Math.sqrt(this.disc()))/(2*a));
    }
    public double root2(){
        return ((-b - Math.sqrt(this.disc()))/(2*a));
    }
}
