import platsProject.*;

public class Main {
    public static void main(String[] args) {
        Tree spruce = new Tree("ель");
        Bushes eglantine = new Bushes("шиповник");
        Flower rose = new Flower("роза");

        System.out.println(spruce.getName() + ": изначальный рост - " + spruce.getInitialGrowth());
        System.out.println(spruce.getName() + ": рост в конце года - " + spruce.yearOfGrowing());
        System.out.println(rose.getName() + ": изначальный рост - " + rose.getInitialGrowth());
        System.out.println(rose.getName() + ": рост в конце года - " + rose.yearOfGrowing());
        System.out.println(eglantine.getName() + ": изначальный рост - " + eglantine.getInitialGrowth());
        System.out.println(eglantine.getName() + ": рост в конце года - " + eglantine.yearOfGrowing());

        Plant[] myGarden = {spruce, eglantine, rose};
        PlantsArray garden = new PlantsArray(myGarden);
        //garden.yearOfGrow();  //при вызове метода по отношению к массиву ошибка
    }
}
