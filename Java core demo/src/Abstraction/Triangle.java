package Abstraction;

public class Triangle implements Shape{
    private double edge1;
    private double edge2;
    private double edge3;

    public Triangle(double edge1,double edge2,double edge3){
        this.edge1=edge1;
        this.edge2=edge2;
        this.edge3=edge3;
    }

    @Override
    public double calArea() {
        double halfPerimeter=(edge1+edge2+edge3)/2;
        System.out.println("edge1: "+edge1);
        System.out.println("edge2: "+edge2);
        System.out.println("edge3: "+edge3);
        System.out.println("half perimeter: "+halfPerimeter);
        return Math.sqrt(halfPerimeter*(halfPerimeter-edge1)*(halfPerimeter-edge2)*(halfPerimeter-edge3));
    }
}
