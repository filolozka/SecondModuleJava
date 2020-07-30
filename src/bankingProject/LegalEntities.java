package bankingProject;

public class LegalEntities extends Customer {
    private String typeOfProperty;

    public LegalEntities(String typeProperty, String name, String iban) {
        this.typeOfProperty = typeProperty;
        super.name = name;
        super.iban = iban;
    }

    public String getTypeOfProperty() {
        return typeOfProperty;
    }

    @Override
    public String toStringIt() {
        return "LegalEntities{" +
                "typeOfProperty='" + typeOfProperty + '\'' +
                ", company name='" + name + '\'' +
                ", iban='" + iban + '\'' +
                '}';
    }
}
