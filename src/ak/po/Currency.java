package ak.po;

public enum Currency {
    PLN("polski zloty"),
    USD("dolar amerykanski");

    private final String name;
    Currency() {
        this.name="polski zloty";
    }

    Currency(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
