public class Category {
    private String name="";

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(validateName(name)) {
            this.name = name;
        }
    }

    public static boolean validateName(String name){
        boolean isNameCorrect = false;
        if(!name.isEmpty()){
            isNameCorrect = true;
        }else{
            System.out.println("Podano niepoprawna nazwe");
            System.exit(0);
        }
        return isNameCorrect;
    }

    public String toString() {
        return "Kategoria:"+getName();
    }
}
