package platsProject;

public class Flower extends Plant {
    private double initialGrowth = 0;
    private String name;
    private double growthNow;
    private int springGrowth = 20;
    private int summerGrowth = 10;
    private int autumnGrowth = 0;
    private int winterGrowth = 0;

    public Flower(String name) {
        this.name = name;
    }

    @Override
    public int getSpringGrowth() {
        return springGrowth;
    }

    @Override
    public int getAutumnGrowth() {
        return autumnGrowth;
    }

    @Override
    public int getWinterGrowth() {
        return winterGrowth;
    }

    @Override
    public int getSummerGrowth() {
        return summerGrowth;
    }

    public double getGrowthNow() {
        return growthNow;
    }

    public void setGrowthNow(double growthNow) {
        this.growthNow = growthNow;
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


}
