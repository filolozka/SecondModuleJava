package lessonsExamples.lesson5;

//Для вычисления площади прямоугольника нужно умножить его длину на ширину.

public class Rectangle extends Figure {
    private double secondSide;
    private String name = "Прямоугольник";

    public Rectangle(double sideLength, double secondSide) {
        super(sideLength);
        this.secondSide = secondSide;
        super.setName(name);
    }

    @Override
    public double findArea(){
        setArea(getSecondSide() * super.getSideLength());
        return getArea();
    }

    public double getSecondSide() {
        return secondSide;
    }

}
