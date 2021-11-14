package spring.example.petclinic.domain;

public enum SubCategory {
    QUERY("Query"),
    COMPLAINTS("Complaints");
    private final String name;

    SubCategory(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
