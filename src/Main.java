import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // test class Category
        Category sampleCategory = new Category();
        System.out.print("Podaj nazwe kategorii: ");
        sampleCategory.setName(in.nextLine());
        System.out.println(sampleCategory.getName());
        System.out.println(sampleCategory);

        //test class Product
        Product sampleProduct = new Product();
        System.out.print("Podaj nazwe produktu: ");
        sampleProduct.setName(in.nextLine());
        System.out.println(sampleProduct.getName());
        sampleProduct.setCategory(sampleCategory);
        System.out.println(sampleProduct.getCategory());
        System.out.print("Podaj cene produktu: ");
        sampleProduct.setPrice(in.nextFloat());
        System.out.println(sampleProduct.getPrice());
        System.out.println(sampleProduct);
    }
}