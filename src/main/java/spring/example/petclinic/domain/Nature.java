package spring.example.petclinic.domain;

public enum Nature {
    HEALTH("Health"),
    TRANSPORT("Transport"),
    PROPERTY("Property");
    private final String name;

    Nature(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
