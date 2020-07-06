package platsProject;

public class Bushes extends Plant {
    private double initialGrowth = 40;
    private String name;
    private double growthNow;

    public Bushes(String name) {
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
        return growthNow + 10;
    }

    @Override
    public double seasonSummer(double growthNow) {
        return growthNow + 10;
    }

    @Override
    public double seasonAutumn(double growthNow) {
        return growthNow + 3;
    }

    @Override
    public double seasonWinter(double growthNow) {
        return growthNow;
    }

    public double yearOfGrowing(){
        growthNow = seasonWinter(seasonAutumn(seasonSummer(seasonSpring(initialGrowth))));
        return growthNow;
    };
}
