package lessonsExamples.lesson5;

//это произведение числа пи на квадрат радиуса

public class Circle extends Figure {
    private double radius;
    private String name = "Круг";

    public Circle(double radius) {
        this.radius = radius;
        super.setName(name);
    }

    @Override
    public double findArea() {
        setArea(radius * radius * Math.PI);
        return getArea();
    }

    public double getRadius() {
        return radius;
    }
}
