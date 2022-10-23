package ak.po.entities;

import ak.po.Validator;

public class Category {
    private String name="";

    private static final String VALIDATE_NULL_MESSEGE = "Argument nie może mieć wartości NULL";
    private static final String VALIDATE_BLANK_MESSEGE = "Argument nie może być pusty";

    private Category(String name) {
        setName(name);
    }

    public static Category from(String name){
        return new Category(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(Validator.isNotNull(name)) {
            if(Validator.isNotBlank(name)){
                this.name = name;
            }else{
                throw new IllegalArgumentException(VALIDATE_BLANK_MESSEGE);
            }
        }else{
           throw new IllegalArgumentException(VALIDATE_NULL_MESSEGE);
        }
    }



    public String toString() {
        return "Kategoria: "+getName();
    }
}
