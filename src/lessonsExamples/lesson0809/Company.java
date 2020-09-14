package lessonsExamples.lesson0809;

public class Company extends Owner {
    private String name;
    private TypeOfOwnership typeOfOwnership;

    public Company(String name, TypeOfOwnership typeOfOwnership) {
        this.name = name;
        this.typeOfOwnership = typeOfOwnership;
    }

    public TypeOfOwnership getTypeOfOwnership() {
        return typeOfOwnership;
    }

    @Override
    public String toString() {
        return name + " (" + typeOfOwnership +
                ")";
    }

    @Override
    public String getName() {
        return name;
    }
}
