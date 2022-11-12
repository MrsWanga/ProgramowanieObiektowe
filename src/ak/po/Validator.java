package ak.po;

public class Validator {
    private static final Validator INSTANCE =new Validator();

    public static Validator getInstance(){
        return INSTANCE;
    }

    public static boolean isNotNull(String name){
        boolean isNameCorrect =false;
        if(name != null) {
            isNameCorrect=true;
        }else{
            throw new IllegalArgumentException("Argument nie może mieć wartości NULL");
        }
        return isNameCorrect;
    }
    public static boolean isNotBlank(String name){
        boolean isNameCorrect = false;

            if (!name.isEmpty() && !name.isBlank()) {
                isNameCorrect = true;
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
