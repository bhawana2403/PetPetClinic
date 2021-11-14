package spring.example.petclinic.domain;

public enum CaseManager {
   DARYL("Daryl"),
    TITUS("Titus"),
    JAMES("James"),
    ALFONZO("Alfonzo");
    private final String name;

    CaseManager(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
