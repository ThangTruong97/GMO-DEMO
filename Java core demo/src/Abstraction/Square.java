package Abstraction;

public class Square implements Shape{
    private double edge;

    public Square(double edge){
        this.edge=edge;
    }
    @Override
    public double calArea() {
        return edge*edge;
    }
}
