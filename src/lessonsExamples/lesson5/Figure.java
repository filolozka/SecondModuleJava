package lessonsExamples.lesson5;

public abstract class Figure {
    private String name;
    private double area;
    private double sideLength;

    public Figure() {
    }

    public Figure(double sideLength) {
        this.sideLength = sideLength;
    }

    public /*abstract */double findArea() {
        return getArea();
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
