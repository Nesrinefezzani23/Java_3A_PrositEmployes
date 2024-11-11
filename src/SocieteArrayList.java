import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employé> {
    private List<Employé> employes;

    public SocieteArrayList() {
        employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employé e) {
        employes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return employes.stream().anyMatch(e -> e.getNom().equals(nom));
    }

    @Override
    public boolean rechercherEmploye(Employé e) {
        return employes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employé e) {
        employes.remove(e);
    }

    @Override
    public void displayEmploye() {
        //employes.forEach(System.out::println);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employes.sort(Comparator
                .comparing(Employé::getNomDepartement)
                .thenComparing(Employé::getGrade));
    }
}
