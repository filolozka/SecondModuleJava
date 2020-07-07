package lessonsExamples.lesson5;

public class Circle extends Figure {
    private int sideLength;
    private int area;

    public Circle(int sideLength) {
        super(sideLength);
    }

    @Override
    public int findArea() {
        area = (int) (sideLength * sideLength * Math.PI);
        return getArea();
    }
}
