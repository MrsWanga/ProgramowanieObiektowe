package ak.po;

public class Validator {
    public static boolean isNotBlankAndNull(String name){
        boolean isNameCorrect = false;
        if(name != null) {
            if (!name.isEmpty() && !name.isBlank()) {
                isNameCorrect = true;
            } else {
                System.out.println("Podano niepoprawna nazwe");
            }
        }else {
            System.out.println("Blad systemu");
        }
        return isNameCorrect;
    }

    public static boolean isPositiveFloat(float value){
        boolean isPositive = false;
        if(value >= 0){
            isPositive = true;
        }
        return isPositive;
    }

}
