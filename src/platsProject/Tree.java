package platsProject;

//надо понять, с каким значением работают методы - где его брать, как они суммируются и как их потом обобщить

public class Tree extends Plant {
    private double initialGrowth = 150; //первоначальный рост в сантиметрах
    private String name;
    private double growthNow;
    private int summerGrowth = 15;
    private int sprintGrowth = 15;
    private int autumnGrowth = 5;
    private int winterGrowth = 5;

    public int getSummerGrowth() {
        return summerGrowth;
    }

    public int getSpringGrowth() {
        return sprintGrowth;
    }

    public int getAutumnGrowth() {
        return autumnGrowth;
    }

    public int getWinterGrowth() {
        return winterGrowth;
    }

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

}
