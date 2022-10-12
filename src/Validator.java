public class Validator {
    public static boolean isNotBlankAndNull(String name){
        boolean isNameCorrect = false;
        if(name != null) {
            if (!name.isEmpty() && !name.isBlank()) {
                isNameCorrect = true;
            } else {
                System.out.println("Podano niepoprawna nazwe, sprobuj ponownie");
                System.out.println(Introducer.inputNameCategory());
                System.exit(0);
            }
        }else {
            System.out.println("Blad systemu, sprobuj ponownie");
            System.out.println(Introducer.inputNameCategory());
            System.exit(0);
        }
        return isNameCorrect;
    }

}
