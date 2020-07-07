package platsProject;

public abstract class Plant {
    private double growthNow;
    private double initialGrowth;
    private String name;
    private int summerGrowth = 0;
    private int sprintGrowth = 0;
    private int autumnGrowth = 0;
    private int winterGrowth = 0;

    public abstract int getSummerGrowth();
    public abstract int getSpringGrowth();
    public abstract int getAutumnGrowth();
    public abstract int getWinterGrowth();


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

    protected double seasonSpring() {
        setGrowthNow(getGrowthNow() + getSpringGrowth()); //задаём значение, взяв нынешнее значение атрибута growthNow
        return getGrowthNow();
    }


    protected double seasonSummer() {
        setGrowthNow(getGrowthNow() + getSummerGrowth());
        return getGrowthNow();
    }

    protected double seasonAutumn() {
        setGrowthNow(getGrowthNow() + getAutumnGrowth());
        return getGrowthNow();
    }

    protected double seasonWinter() {
        setGrowthNow(getGrowthNow() + getWinterGrowth());
        return getGrowthNow();
    }

        public double yearOfGrowing() {
            seasonSpring();
            seasonSummer();
            seasonAutumn();
            seasonWinter();
            return growthNow;
        }
}
