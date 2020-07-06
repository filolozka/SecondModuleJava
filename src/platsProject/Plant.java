package platsProject;

public abstract class Plant {
    private double growthNow;
    private double initialGrowth;
    private double increase;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrowthNow() {
        return growthNow;
    }

    public void setGrowthNow(double growthNow) {
        this.growthNow = growthNow;
    }

    public double getInitialGrowth() {
        return initialGrowth;
    }

    public void setInitialGrowth(double initialGrowth) {
        this.initialGrowth = initialGrowth;
    }

    public double getIncrease() {
        return increase;
    }

    public void setIncrease(double increase) {
        this.increase = increase;
    }

    public abstract double seasonSpring(double growthNow);

    public abstract double seasonSummer(double growthNow);

    public abstract double seasonAutumn(double growthNow);

    public abstract double seasonWinter(double growthNow);

    public double yearOfGrowing(){
        growthNow = seasonWinter(seasonAutumn(seasonSummer(seasonSpring(initialGrowth))));
        return growthNow;
    };
}
