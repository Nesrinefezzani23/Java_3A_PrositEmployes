public class Employé {
    private int id;
    private String nom;
    private String prenom;
    private String nomDepartement;
    private int grade;

    public Employé() {}

    public Employé(int id, String nom, String prenom, String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (obj instanceof Employé employe) {
            return id == employe.id && nom.equals(employe.nom);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employé{" +
                "ID=" + id +
                ", Nom='" + nom + '\'' +
                ", Prénom='" + prenom + '\'' +
                ", Nom Département='" + nomDepartement + '\'' +
                ", Grade=" + grade +
                '}';
    }
}
