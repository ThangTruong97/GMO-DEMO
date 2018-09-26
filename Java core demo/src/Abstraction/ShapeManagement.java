package Abstraction;

public class ShapeManagement {
    public static void main(String[] args){
        Square square=new Square(5.5);
        Triangle triangle=new Triangle(5.0,8.5,9.0);

        System.out.println("Square area: " +square.calArea());
        System.out.println("Triangle area: " +triangle.calArea());
    }

}
