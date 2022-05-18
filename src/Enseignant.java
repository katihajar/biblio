import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class Enseignant {
    private long idEnseignant;
    private String adresse;
    private Date dateFin;
    private int penalite;
    private long NumeroAdh;
    private String nom;
    private String prenom;
    private long NombreEmprunte;
    private long DureeMax;
    private long emprunt;
    private String departement;
    private String email;
    //File prof = new File("adherentEtudiant.txt");


    public long getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(long idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getPenalite() {
        return penalite;
    }

    public void setPenalite(int penalite) {
        this.penalite = penalite;
    }

    public long getNumeroAdh() {
        return NumeroAdh;
    }

    public void setNumeroAdh(long numeroAdh) {
        NumeroAdh = numeroAdh;
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

    public long getNombreEmprunte() {
        return NombreEmprunte;
    }

    public void setNombreEmprunte(long nombreEmprunte) {
        NombreEmprunte = nombreEmprunte;
    }

    public long getDureeMax() {
        return DureeMax;
    }

    public void setDureeMax(long dureeMax) {
        DureeMax = dureeMax;
    }

    public long getEmprunt() {
        return emprunt;
    }

    public void setEmprunt(long emprunt) {
        this.emprunt = emprunt;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enseignant(long idEnseignant, String adresse, Date dateFin, int penalite, long numeroAdh, String nom, String prenom, long nombreEmprunte, long dureeMax, long emprunt, String departement, String email) {
        this.idEnseignant = idEnseignant;
        this.adresse = adresse;
        this.dateFin = dateFin;
        this.penalite = penalite;
        NumeroAdh = numeroAdh;
        this.nom = nom;
        this.prenom = prenom;
        NombreEmprunte = nombreEmprunte;
        DureeMax = dureeMax;
        this.emprunt = emprunt;
        this.departement = departement;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "idEnseignant=" + idEnseignant +
                ", adresse='" + adresse + '\'' +
                ", dateFin=" + dateFin +
                ", penalite=" + penalite +
                ", NumeroAdh=" + NumeroAdh +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", NombreEmprunte=" + NombreEmprunte +
                ", DureeMax=" + DureeMax +
                ", emprunt=" + emprunt +
                ", departement='" + departement + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    void emprunter(Exemplaire exemplaire) {

    }


    void rendre(Exemplaire exemplaire) {

    }

    void resever(Exemplaire exemplaire) {

    }
    public void ajoutEnseignant(Enseignant ensg) throws IOException {
       /*Scanner scanner;
        try {
            scanner = new Scanner(prof).useDelimiter( ",");

            while (scanner.hasNext()) {
                final String lineFromFile = scanner.nextLine();
                if (lineFromFile.contains(ensg.nom)&&lineFromFile.contains(ensg.prenom)) {
                    // a match!
                    System.out.println("I found ");
                    break;
                }
            }
            // créer le fichier s'il n'existe pas
            if (!prof.exists()) {
                prof.createNewFile();
            }
            FileWriter fw = new FileWriter(prof.getAbsoluteFile(),true);
            PrintWriter bw = new PrintWriter(fw);
            String resultat = ensg.toString();
            System.out.println(resultat);
            bw.println(resultat);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
