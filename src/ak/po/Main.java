package ak.po;

import ak.po.entities.Category;
import ak.po.entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Pobieranie danych
        System.out.print("Podaj nazwe kategorii: ");
        String inputName=in.nextLine();
        Category sampleCategory = Category.from(inputName);
        System.out.print("Podaj nazwe produktu: ");
        String inputNameProduct=in.nextLine();
        System.out.print("Podaj cene produktu: ");
        float inputPriceProduct = in.nextFloat();
        System.out.print("Podaj walute (PLN(domyslnie)/USD): ");
        in.nextLine();
        String inputCurrency = in.nextLine();
        Currency currency= Currency.PLN;
        if(inputCurrency.equals("USD")){
            currency = Currency.USD;
        }

        // Tworzenie instancji klasy z wykorzystaniem wzorca budowniczego
        Product product = new Product.Builder()
                .name(inputNameProduct)
                .price(inputPriceProduct)
                .category(sampleCategory)
                .currency(currency)
                .build();
        //Wyświetlenie danych o produkcie
        System.out.println(product);
    }
}