package Oefning3;

public class Circle extends Shapes {
    public Circle(int radius , float pi)
    {
        super(radius,pi);
    }
    @Override
    public float area() {
        return getPi()* getRadius()*getRadius();
    }
    @Override
    public float perimeter() {
        return  2*getPi()* getRadius();
    }

}
