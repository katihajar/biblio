
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Bibliothèque {
    public static void main(String [] args ) throws IOException {

        Scanner nom = new Scanner(System.in);
        Scanner prenom = new Scanner(System.in);
        Scanner address = new Scanner(System.in);
        Scanner id = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom :");
        String nomAdherent = nom.next();
        System.out.println("Veuillez saisir votre prenom :");
        String prenomAdherent = prenom.next();
        System.out.println("Veuillez saisir votre code etudiant :");
        int ids = id.nextInt();
        System.out.println("Veuillez saisir votre address :");
        String addres = address.next();
        System.out.println("Ajout d'un Adherent");
        Etudiant etudiant = new Etudiant(ids,addres,new Date(),0,0,nomAdherent,prenomAdherent,0,0,0);
        etudiant.ajoutEtudiant(etudiant);


    }

}
