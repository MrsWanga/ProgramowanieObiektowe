import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // test class Category
        System.out.print("Podaj nazwe kategorii: ");
        String inputName=in.nextLine();
        Category sampleCategory = new Category(inputName);
        System.out.println(sampleCategory.getName());
        System.out.println(sampleCategory);

        //test class Product
        System.out.print("Podaj nazwe produktu: ");
        String inputNameProduct=in.nextLine();
        System.out.print("Podaj cene produktu: ");
        float inputPriceProduct = in.nextFloat();
        Product sampleProduct2Arg = new Product(inputNameProduct,inputPriceProduct);
        Product sampleProduct3Arg = new Product(inputNameProduct,inputPriceProduct, sampleCategory);

        System.out.println(sampleProduct2Arg.getName());
        sampleProduct2Arg.setCategory(sampleCategory);
        System.out.println(sampleProduct2Arg.getCategory());
        System.out.println(sampleProduct2Arg.getPrice());
        System.out.println(sampleProduct2Arg);

        System.out.println(sampleProduct3Arg.getName());
        sampleProduct3Arg.setCategory(sampleCategory);
        System.out.println(sampleProduct3Arg.getCategory());
        System.out.println(sampleProduct3Arg.getPrice());
        System.out.println(sampleProduct3Arg);
    }
}