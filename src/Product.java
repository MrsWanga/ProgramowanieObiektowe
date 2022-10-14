public class Product {
    private String name = null;
    private Category category = null;
    private float price = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(Validator.isNotBlankAndNull(name)){
            this.name = name;
        }
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        float roundPrice=Math.round(price * 100.0/100.0);
        if(Validator.isPositiveFloat(roundPrice)){
            this.price = roundPrice;
        }else {
            System.out.println("Podana cena musi być dodatnia");
        }

    }

    @Override
    public String toString() {
        return "Produkt: " + name + category + "Cena: " + price;
    }
}
