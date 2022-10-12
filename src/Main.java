import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random los = new Random();
        Category sample = new Category();
        System.out.println("Podaj nazwe kategorii: ");
        sample.setName(in.nextLine());
        System.out.println(sample);
    }
}