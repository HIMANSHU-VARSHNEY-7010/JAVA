package abstract_example;

abstract class threeD  extends Shape{
    public threeD(String type){
        super(type);
    }
    public abstract double areaOfSphere(Integer radius);
    public abstract double areaOfCube(Integer side);
    public abstract double areaOfCuboid(Integer length, Integer width, Integer height);
    public void showType(){
        System.out.println("3-D");
    }
}
