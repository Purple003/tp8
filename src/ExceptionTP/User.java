package ExceptionTP;

public class User {
    private String nom;
    private int age;

    public User(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void validate() throws InvalidUserException {
        if (nom == null || nom.isEmpty()) throw new InvalidUserException("Nom vide");
        if (age < 18) throw new InvalidUserException("Âge < 18 interdit");
    }

    public String toString() { return nom + " (" + age + " ans)"; }
}
