package ak.po.entities;

import ak.po.Currency;
import ak.po.Validator;

public class Category {
    private String name="";

    private Category(String name) {
        this.name=name;
    }

    public static Category from(String name){
        CategoryValidator.getInstance().validateString(name);
        return new Category(name);
    }

    public String getName(){
        return name;
    }

    public String toString() {
        return "Kategoria: "+getName();
    }

    static class CategoryValidator{

        private static final String VALIDATE_NULL_MESSEGE = "Argument nie może mieć wartości NULL";
        private static final String VALIDATE_BLANK_MESSEGE = "Argument nie może być pusty";
        private static final CategoryValidator INSTANCE = new CategoryValidator();

        public static CategoryValidator getInstance(){
            return INSTANCE;
        }

        public static void validateString(String name){
            isNotNull(name);
            isNotBlank(name);
        }
        public static void isNotNull(String name){
            boolean isNameCorrect =false;
            if(name == null) {
                throw new IllegalArgumentException(VALIDATE_NULL_MESSEGE);
            }
        }
        public static void isNotBlank(String name){
            if (name.isEmpty() || name.isBlank()) {
                throw new IllegalArgumentException(VALIDATE_BLANK_MESSEGE);
            }
        }
    }
}
