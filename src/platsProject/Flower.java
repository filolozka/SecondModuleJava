package platsProject;

public class Flower extends Plant {
    private double initialGrowth = 0;
    private String name;
    private double growthNow;

    public Flower(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getInitialGrowth() {
        return initialGrowth;
    }

    @Override
    public double seasonSpring(double growthNow) {
        return growthNow + 20;
    }

    @Override
    public double seasonSummer(double growthNow) {
        return growthNow + 10;
    }

    @Override
    public double seasonAutumn(double growthNow) {
        return growthNow;
    }

    @Override
    public double seasonWinter(double growthNow) {
        return growthNow * 0;
    }

    public double yearOfGrowing(){
        growthNow = seasonWinter(seasonAutumn(seasonSummer(seasonSpring(initialGrowth))));
        return growthNow;
    };
}
