package ak.po.entities;

import ak.po.Validator;

public class Product {
    private String name = null;
    private Category category = null;
    private float price = 0;
    private static final String VALIDATE_NULL_MESSEGE = "Argument nie może mieć wartości NULL";
    private static final String VALIDATE_BLANK_MESSEGE = "Argument nie może być pusty";

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

    public void setName(String name){
        if(Validator.isNotNull(name)) {
            if(Validator.isNotBlank(name)){
                this.name = name;
            }else{
                throw new IllegalArgumentException(VALIDATE_BLANK_MESSEGE);
            }
        }else{
            throw new IllegalArgumentException(VALIDATE_NULL_MESSEGE);
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
