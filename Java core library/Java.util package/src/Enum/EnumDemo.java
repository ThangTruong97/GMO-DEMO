package Enum;

public class EnumDemo {
    enum Season{SPRING,SUMMER,AUTUMN,WINTER}
    public static void main(String[] args){
        Season season=Season.SPRING;

        switch (season){
            case SPRING:
                System.out.println("Spring season!!");
                break;
            case SUMMER:
                System.out.println("Summer season!!");
                break;
            case AUTUMN:
                System.out.println("Autumn season!!");
                break;
            case WINTER:
                System.out.println("Winter season!!");
        }
    }
}
