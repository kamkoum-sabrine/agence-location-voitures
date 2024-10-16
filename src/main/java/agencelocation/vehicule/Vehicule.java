/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencelocation.vehicule;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Vehicule {
    protected String matricule;
    protected String marque;
    protected String modele;
    protected String puissance;
    protected String Carburant;
    protected Date AnneeModele;
    protected Double kilometrage;
    protected Boolean roueSecours;
    protected Boolean CricOutils;
    protected Boolean RadioAntenne;
    protected Boolean enjolivers;
    protected Boolean retroviseurs;
    protected Boolean climatiseurMarche;
    
    public Vehicule(String matricule, String marque, String modele, String puissance, String carburant , Date anneeModele, 
            Double kilometrage, Boolean roueSecours, Boolean CricOutils, Boolean RadioAntenne, Boolean enjolivers,
            Boolean retroviseurs,Boolean climatiseurMarche){
        this.matricule = matricule;
        this.modele = modele;
        this.marque = marque;
        this.puissance = puissance;
        this.Carburant = carburant;
        this.AnneeModele = anneeModele;
        this.kilometrage = kilometrage;
        this.roueSecours = roueSecours;
        this.CricOutils = CricOutils;
        this.RadioAntenne = RadioAntenne;
        this.enjolivers = enjolivers;
        this.retroviseurs = retroviseurs;
        this.climatiseurMarche = climatiseurMarche;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getPuissance() {
        return puissance;
    }

    public String getCarburant() {
        return Carburant;
    }

    public Date getAnneeModele() {
        return AnneeModele;
    }

    public Double getKilometrage() {
        return kilometrage;
    }

    public Boolean getRoueSecours() {
        return roueSecours;
    }

    public Boolean getCricOutils() {
        return CricOutils;
    }

    public Boolean getRadioAntenne() {
        return RadioAntenne;
    }

    public Boolean getEnjolivers() {
        return enjolivers;
    }

    public Boolean getRetroviseurs() {
        return retroviseurs;
    }

    public Boolean getClimatiseurMarche() {
        return climatiseurMarche;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }

    public void setCarburant(String Carburant) {
        this.Carburant = Carburant;
    }

    public void setAnneeModele(Date AnneeModele) {
        this.AnneeModele = AnneeModele;
    }

    public void setKilometrage(Double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public void setRoueSecours(Boolean roueSecours) {
        this.roueSecours = roueSecours;
    }

    public void setCricOutils(Boolean CricOutils) {
        this.CricOutils = CricOutils;
    }

    public void setRadioAntenne(Boolean RadioAntenne) {
        this.RadioAntenne = RadioAntenne;
    }

    public void setEnjolivers(Boolean enjolivers) {
        this.enjolivers = enjolivers;
    }

    public void setRetroviseurs(Boolean retroviseurs) {
        this.retroviseurs = retroviseurs;
    }

    public void setClimatiseurMarche(Boolean climatiseurMarche) {
        this.climatiseurMarche = climatiseurMarche;
    }

    @Override
    public String toString() {
        return "Vehicule{" + "matricule=" + matricule + ", marque=" + marque + ", modele=" + modele + ", puissance=" + puissance + ", Carburant=" + Carburant + ", AnneeModele=" + AnneeModele + ", kilometrage=" + kilometrage + ", roueSecours=" + roueSecours + ", CricOutils=" + CricOutils + ", RadioAntenne=" + RadioAntenne + ", enjolivers=" + enjolivers + ", retroviseurs=" + retroviseurs + ", climatiseurMarche=" + climatiseurMarche + '}';
    }
  
}
