package lessonsExamples.lesson5;

public abstract class Figure {
    private int area;
    private int numberOfSides;
    private int sideLength;

    public Figure(int sideLength){
        this.sideLength = sideLength;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public int findArea(){
        area = getNumberOfSides() * sideLength;
        return getArea();
    }


}
