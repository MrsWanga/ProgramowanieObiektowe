public class Category {
    private String name="";

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(!name.isEmpty() || !name.lenght>0){
            this.name=name;
        }else{
            System.out.println("Podano niepoprawna nazwe");
        }
    }

    public String toString() {
        return "Kategoria:"+name;
    }
}
