package spring.example.petclinic.domain;

public enum Category {
    GRIEVANCE ("Grievance"),
    EMPLOYMENT ("Employment"),
    SECURITY ("Security"),
    GENERAL ("General");

    private final String name;
    Category(String name){

        this.name = name;
    }
    public String getName(){
        return name;
    }

}
