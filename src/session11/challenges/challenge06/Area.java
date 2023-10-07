package session11.challenges.challenge06;

public class Area extends Shape {

    public Area() {
        System.out.println("This is area class");
    }

    @Override
    public void rectangleArea(double length, double width) {
        System.out.println(length * width);
    }

    @Override
    public void squareArea(double side) {
        System.out.println(side * side);
    }

    @Override
    public void circleArea(double radius) {
        System.out.println(Math.PI * radius * radius);
    }
}
