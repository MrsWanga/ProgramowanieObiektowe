package ak.po.entities;

import ak.po.Validator;

public class Category {
    private String name="";

    public Category(String name) {
        setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(Validator.isNotBlankAndNull(name)) {
            this.name = name;
        }else {
            this.name = null;
        }
    }

    public String toString() {
        return "Kategoria: "+getName();
    }
}
