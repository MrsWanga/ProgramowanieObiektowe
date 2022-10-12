public class Category {
    private String name="";

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(Validator.isNotBlankAndNull(name)) {
            this.name = name;
        }
    }

    public String toString() {
        return "Kategoria: "+getName();
    }
}
