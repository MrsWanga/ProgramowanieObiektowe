import java.util.Scanner;

public class Introducer {
    public static Category inputNameCategory(){
        Scanner in = new Scanner(System.in);
        Category sample = new Category();
        System.out.print("Podaj nazwe kategorii: ");
        sample.setName(in.nextLine());
        return sample;
    }

}
