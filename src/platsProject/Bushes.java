package platsProject;

public class Bushes extends Plant {
    private double initialGrowth = 40;
    private String name;
    private double growthNow;
    private int summerGrowth = 10;
    private int sprintGrowth = 10;
    private int autumnGrowth = 3;

    public Bushes(String name) {
        this.name = name;
        this.growthNow = initialGrowth;
    }

    @Override
    public int getWinterGrowth() {
        return winterGrowth;
    }

    private int winterGrowth = 0;

    @Override
    public int getSummerGrowth() {
        return summerGrowth;
    }

    @Override
    public int getSpringGrowth() {
        return sprintGrowth;
    }

    @Override
    public int getAutumnGrowth() {
        return autumnGrowth;
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


}
