package lessonsExamples.lesson5;

public class Square extends Figure {
    private int numberOfSides = 4;

    public Square(int sideLength) {
        super(sideLength);
    }

    @Override
    public int getNumberOfSides() {
        return numberOfSides;
    }
}
