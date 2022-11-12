package ak.po.entities;

import ak.po.Currency;
import ak.po.Validator;

public class Product {
    private final String name;
    private final Category category;
    private final float price;
    private static final String VALIDATE_NULL_MESSAGE = "Argument nie może mieć wartości NULL";
    private static final String VALIDATE_BLANK_MESSAGE = "Argument nie może być pusty";
    private static final String VALIDATE_NEGATIVE_MESSAGE = "Argument nie może być pusty";
    private final Currency currency;

    private Product (Builder builder) {
        this.name = builder.name;
        this.category = builder.category;
        this.price = builder.price;
        this.currency = builder.currency;
    }

    public static class Builder {
        private String name = null;
        private Category category = null;
        private float price = 0;
        private Currency currency = Currency.PLN;


        public Builder name (String name) {
            if(Validator.isNotNull(name)) {
                if(Validator.isNotBlank(name)){
                    this.name = name;
                }else{
                    throw new IllegalArgumentException(VALIDATE_BLANK_MESSAGE);
                }
            }else{
            throw new IllegalArgumentException(VALIDATE_NULL_MESSAGE);
            }
            return this;
        }

        public Builder category (Category category){
            this.category=category;
            return this;
        }

        public Builder price (float price){
            price = price*100;
            price = Math.round(price);
            price = price /100;
            if(Validator.isPositiveFloat(price)){
                this.price = price;
            }else {
                throw new IllegalArgumentException(VALIDATE_NEGATIVE_MESSAGE);
            }
            return this;
        }

        public Builder currency (Currency currency) {
            this.currency=currency;
            return this;
        }

        public Product build (){
            return new Product(this);
        }
    }
    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produkt: ").append(name)
                .append(" Kategoria: ").append(category)
                .append(" Cena: ").append(price)
                .append(" Waluta: ").append(currency);
        return sb.toString();
    }
}
