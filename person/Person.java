package person;

public class Person {

    private String nom;
    private String prenom;
    private int age;


    public Person(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }


    public String getNom() {
        return nom;
    }
    public String getprenom() {
        return prenom;
    }
    public int getAge() {
        return age;
    }
    
}
