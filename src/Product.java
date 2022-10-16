import java.text.DecimalFormat;

public class Product {
    private String name = null;
    private Category category = null;
    private float price = 0;

    public Product(String name, float price) {
        setName(name);
        setPrice(price);
    }

    public Product(String name, float price, Category category){
        setName(name);
        setPrice(price);
        setCategory(category);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(Validator.isNotBlankAndNull(name)){
            this.name = name;
        }else {
            this.name = null;
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
            this.price = 0;
        }

    }

    @Override
    public String toString() {
        return "Produkt: " + name + " " + category + " Cena: " + price;
    }
}
