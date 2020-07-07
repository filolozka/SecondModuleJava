package platsProject;

public class PlantsArray {
    private Plant[] plants;

    public PlantsArray(Plant[] plants){
        this.plants = plants;
    }

    public Plant[] getPlants() {
        return plants;
    }

    public void yearOfGrow(){
        for (Plant plant: plants) {
            System.out.println(plant.getName());
            plant.yearOfGrowing();
        }
    }

}
