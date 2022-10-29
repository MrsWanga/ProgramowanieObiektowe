package ak.po;

import ak.po.entities.Category;
import ak.po.entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // test class ak.po.entities.Category
        System.out.print("Podaj nazwe kategorii: ");
        String inputName=in.nextLine();
        Category sampleCategory = Category.from(inputName);
        System.out.println(sampleCategory.getName());
        System.out.println(sampleCategory);

        //Data input
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

        //test 2arg Constructor Product
        Product sampleProduct2Arg = new Product(inputNameProduct,inputPriceProduct);
        System.out.println(sampleProduct2Arg.getName());
        sampleProduct2Arg.setCategory(sampleCategory);
        System.out.println(sampleProduct2Arg.getCategory());
        System.out.println(sampleProduct2Arg.getPrice());
        System.out.println(sampleProduct2Arg);

        //test 3arg Constructor Product
        Product sampleProduct3Arg = new Product(inputNameProduct,sampleCategory,inputPriceProduct);
        System.out.println(sampleProduct3Arg.getName());
        sampleProduct3Arg.setCategory(sampleCategory);
        System.out.println(sampleProduct3Arg.getCategory());
        System.out.println(sampleProduct3Arg.getPrice());
        System.out.println(sampleProduct3Arg);

        //test 4arg Constructor Product
        Product sampleProduct4Arg = new Product(inputNameProduct,sampleCategory,inputPriceProduct,currency);
        System.out.println(sampleProduct4Arg.getName());
        sampleProduct4Arg.setCategory(sampleCategory);
        System.out.println(sampleProduct4Arg.getCategory());
        System.out.println(sampleProduct4Arg.getPrice());
        System.out.println(sampleProduct4Arg);
    }
}