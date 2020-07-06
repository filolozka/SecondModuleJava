package platsProject;

//надо понять, с каким значением работают методы - где его брать, как они суммируются и как их потом обобщить

public class Tree extends Plant {
    private double initialGrowth = 150; //первоначальный рост в сантиметрах
    private String name;
    private double growthNow;

    public Tree(String name) {
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
        return growthNow + 15;
    }

    @Override
    public double seasonSummer(double growthNow) {
        return growthNow + 15;
    }

    @Override
    public double seasonAutumn(double growthNow) {
        return growthNow + 5;
    }

    @Override
    public double seasonWinter(double growthNow) {
        return growthNow + 5;
    }

    public double yearOfGrowing(){
        growthNow = seasonWinter(seasonAutumn(seasonSummer(seasonSpring(initialGrowth))));
        return growthNow;
    };
}
