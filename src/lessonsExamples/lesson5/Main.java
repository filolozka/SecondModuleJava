package lessonsExamples.lesson5;

public class Main {

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5, 4);
        System.out.println("Площадь прямоугольника со сторонами " + myRectangle.getSideLength() + " и " + myRectangle.getSecondSide() + " равна: " + myRectangle.findArea());
        Triangle myTr = new Triangle(5, 10);
        System.out.println("Площадь треугольника с основанием " + myTr.getSideLength() + " и высотой " + myTr.getHeight() + " равна: " + myTr.findArea());
        Circle myCircle = new Circle(4);
        System.out.println("Площадь круга с радиусом " + myCircle.getRadius() + " равна: " + myCircle.findArea());

        Figure[] myFigure = new Figure[]{myRectangle, myCircle, myTr};
        for (Figure element: myFigure) {
            System.out.println(element.getName() + " площадь равна: " + element.findArea());
        }

    }
}
