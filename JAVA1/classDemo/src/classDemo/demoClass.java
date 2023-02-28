package classDemo;
public class demoClass {
    private int A=10;
    private int B;

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public demoClass(int A, int B){
        this.A = A;
        this.B = B;
    }
    public int addition(){
        return A+B;
    }
    public int addition(int a, int b){
        return a+b;
    }
    public double addition(double a, double b){
        return a+b;
    }
    public int subtraction(){
        return A-B;
    }
}
