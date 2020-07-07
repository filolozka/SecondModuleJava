package lessonsExamples.lesson5;

public class Main {
    //классы геометических фигур
    // фигуры. метод, определяющие площадь.

    public static void main(String[] args) {
        Square mySquare = new Square(5);
        System.out.println(mySquare.findArea());
        Triangle myTr = new Triangle(3);
        System.out.println(myTr.findArea());
        Circle myCircle = new Circle(4);
        System.out.println(myCircle.findArea());

    }
}
