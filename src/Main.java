import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Category sample = new Category();
        System.out.print("Podaj nazwe kategorii: ");
        sample.setName(in.nextLine());
        System.out.println(sample.getName());
        System.out.println(sample);
    }
}