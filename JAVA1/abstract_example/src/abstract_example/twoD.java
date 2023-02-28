package abstract_example;

abstract class twoD  extends Shape{
    public twoD(String type){
        super(type);
    }
    public abstract double areaOfCircle(Integer radius);
    public abstract double areaOfSquare(Integer side);
    public abstract double areaOfRectangle(Integer length, Integer width);
    public void showType(){
        System.out.println("2-D");
    }
}
