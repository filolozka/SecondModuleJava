package lessonsExamples.lesson0209;

public enum AddressType {
    EMAIL(1, "e-mail адрес")
            {
                public void send(){
                    System.out.println("this is email address - send by internet");
                }
            },
    DELIVERY(2, "адрес доставки")
            {
                public void send(){
                    System.out.println("this is delivery address - send by DHL");
                }
            },
    BILLING(3, "билинговый адрес")
            {
                public void send(){
                    System.out.println("this is billing address - send by DHL");
                }
            };

    private String strValue;
    private int intValue;

    AddressType(int i, String s) {
        this.intValue = i;
        this.strValue = s;
    }

    public abstract void send();


    public String test() { //это то же самое, что и выше описанная реализация метода для каждого объекта класса
        if (this.name() == "EMAIL") {
            return "send email";
        } else {
            return "go to postoffice";
        }
    }

    @Override
    public String toString() {
        return "AddressType{" +
                "strValue='" + strValue + '\'' +
                ", intValue=" + intValue +
                '}';
    }
}
