package lessonsExamples.lesson5;

//Площадь треугольника равна произведению половины основания треугольника (a) на его высоту (h)

public class Triangle extends Figure {
    private double height;
    private String name = "Треугольник";

    public Triangle(double height, double sideLength) {
        super(sideLength);  //здесь = основание треугольника
        this.height = height;
        super.setName(name);
    }

    @Override
    public double findArea(){
        setArea((getSideLength() / 2) * height);
        return getArea();
    }

    public double getHeight() {
        return height;
    }
}
