import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Etudiant {
    private long idEtudiant;
    private String adresse;
    private Date dateFin;
    private int penalite;
    private long NumeroAdh;
    private String nom;
    private String prenom;
    private long NombreEmprunte;
    private long DureeMax;
    private long emprunt;
   // File etd = new File("adherentEtudiant.txt");

    public Etudiant(long idEtudiant, String adresse, Date dateFin, int penalite, long numeroAdh, String nom, String prenom, long nombreEmprunte, long dureeMax, long emprunt) {
        this.idEtudiant = idEtudiant;
        this.adresse = adresse;
        this.dateFin = dateFin;
        this.penalite = penalite;
        NumeroAdh = numeroAdh;
        this.nom = nom;
        this.prenom = prenom;
        NombreEmprunte = nombreEmprunte;
        DureeMax = dureeMax;
        this.emprunt = emprunt;
    }

    public long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(long idEtudiant) {
        this.idEtudiant = idEtudiant;
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



    @Override
    public String toString() {
        return "Etudiant{" +
                "idEtudiant=" + idEtudiant +
                ", adresse='" + adresse + '\'' +
                ", dateFin=" + dateFin +
                ", penalite=" + penalite +
                ", NumeroAdh=" + NumeroAdh +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", NombreEmprunte=" + NombreEmprunte +
                ", DureeMax=" + DureeMax +
                ", emprunt=" + emprunt +
                '}';
    }


    void emprunter(Exemplaire exemplaire) {

    }

    void rendre(Exemplaire exemplaire) {

    }

    void resever(Exemplaire exemplaire) {

    }
    public void CalculPenalite() {

    }
    public void suppEtudiant(Etudiant etudiant) throws IOException {
/*
        Scanner scanner;
        scanner = new Scanner(etd).useDelimiter(",");
        FileWriter fw = new FileWriter(etd.getAbsoluteFile(),true);
        PrintWriter bw = new PrintWriter(fw);
        FileReader fr = new FileReader(etd);
        BufferedReader br = new BufferedReader(fr);

 */
        /*while (br.readLine()) {
            final String lineFromFile = scanner.nextLine();
            System.out.println(lineFromFile.contains(etudiant.nom));
            //contraint exist etudiant java
            if ((lineFromFile.contains(etudiant.nom))) {
               bw.println(curr);
            }
        }*/
    }
    public void ajoutEtudiant(Etudiant etudiant) throws IOException {
       // Scanner scanner;
            /*
        try {
           if (!etd.exists()) {
                etd.createNewFile();
            }
            scanner = new Scanner(etd).useDelimiter( ",");

            while (scanner.hasNext()) {
                final String lineFromFile = scanner.nextLine();
                System.out.println(lineFromFile.contains(etudiant.nom));
                //contraint exist etudiant java
                if ((lineFromFile.contains(etudiant.nom))) {
                    // a match!
                    System.out.println(" found ");
                    break;
                }
                else {
                    FileWriter fw = new FileWriter(etd.getAbsoluteFile(),true);
                    PrintWriter bw = new PrintWriter(fw);
                    String resultat = etudiant.toString();
                    System.out.println(resultat);
                    bw.println(resultat);
                    bw.close();
                    break;

                }
            }
            // créer le fichier s'il n'existe pas


        } catch (IOException e) {
            e.printStackTrace();
        }
        */

    }

}
