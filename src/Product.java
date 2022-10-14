import java.text.DecimalFormat;

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
        price = price*100;
        price = Math.round(price);
        price = price /100;
        if(Validator.isPositiveFloat(price)){
            this.price = price;
        }else {
            System.out.println("Podana cena musi być dodatnia");
        }

    }

    @Override
    public String toString() {
        return "Produkt: " + name + " " + category + " Cena: " + price;
    }
}
