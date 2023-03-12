package QUES_12;

public sealed class Figure permits Circle,Square {
    float side;

    public Figure(float side) {
        this.side = side;
    }

}
final class Circle extends Figure {
    public Circle(float radius) {
        super(radius);
    }

    public float area(){
        return (float) (3.14*side*side);
    }
}
non-sealed class Square extends Figure {

    public Square(float side) {
        super(side);
    }
    public float area(){
        return side*side;
    }
}

// Not able to extend Figure in Rectangle as Figure has not given permit to Class Rectangle.
//        final class Rectangle extends Figure {
//
//            public Rectangle(float side) {
//                super(side);
//            }
//        }
