package ak.po.entities;

import ak.po.Currency;
import ak.po.Validator;

public class Product {
    private String name = null;
    private Category category = null;
    private float price = 0;
    private static final String VALIDATE_NULL_MESSEGE = "Argument nie może mieć wartości NULL";
    private static final String VALIDATE_BLANK_MESSEGE = "Argument nie może być pusty";
    private Currency currency = Currency.PLN;

    private Product (Builder builder) {

    }

    public static class Builder {
        private String name = null;
        private Category category = null;
        private float price = 0;
        private Currency currency = Currency.PLN;


        public Builder (String name) {
            this.name=name;
        }

        public Builder (Category category){
            this.category=category;
            return this;
        }

        public Builder (float price){
            this.price=price;
        }

        public Builder (Currency currency) {
            this.currency=currency;
        }

    }
    public Product(String name, float price) {
        this(name, null, price, Currency.PLN);
    }

    public Product(String name, Category category,  float price){
        this(name, category, price, Currency.PLN);
    }

    public Product(String name, Category category, float price, Currency currency) {
        setName(name);
        setCategory(category);
        setPrice(price);
        setCurrency(currency);
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

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Produkt: " + name + " " + category + " Cena: " + price + " Waluta: " + currency;
    }
}
