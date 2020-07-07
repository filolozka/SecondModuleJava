package lessonsExamples.lesson5;

public class Triangle extends Figure {
    private int numberOfSides = 3;

    public Triangle(int sideLength) {
        super(sideLength);
    }

    @Override
    public int getNumberOfSides() {
        return numberOfSides;
    }
}
