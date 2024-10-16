/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencelocation.vehicule;

import agencelocation.personnel.Client;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class ContratLocation {
    private int id;
    private Client conducteur1;
    private Client conducteur2;
    private Vehicule vehicule;
    private Date dateDebut;
    private Date dateFin;
    private double coutParJour;

    public ContratLocation(int id, Client conducteur1, Client conducteur2, Vehicule vehicule, Date dateDebut, Date datFin, double coutParJour) {
        this.id = id;
        this.conducteur1 = conducteur1;
        this.conducteur2 = conducteur2;
        this.vehicule = vehicule;
        this.dateDebut = dateDebut;
        this.dateFin = datFin;
        this.coutParJour = coutParJour;
    }

    public int getId() {
        return id;
    }

    public Client getConducteur1() {
        return conducteur1;
    }

    public Client getConducteur2() {
        return conducteur2;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDatFin() {
        return dateFin;
    }

    public double getCoutParJour() {
        return coutParJour;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setConducteur1(Client conducteur1) {
        this.conducteur1 = conducteur1;
    }

    public void setConducteur2(Client conducteur2) {
        this.conducteur2 = conducteur2;
    }

    public void changerVoiture(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void prolongerLocation(Date datFin) {
        this.dateFin = datFin;
    }

    public void setCoutParJour(double coutParJour) {
        this.coutParJour = coutParJour;
    }

    @Override
    public String toString() {
        return "ContratLocation{" + "id=" + id + ", conducteur1=" + conducteur1 + ", conducteur2=" + conducteur2 + ", vehicule=" + vehicule + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", coutParJour=" + coutParJour + '}';
    }
    
    public double calculerCout(){
        long differenceEnMillisecondes = dateFin.getTime() - dateDebut.getTime();
        long differenceEnJours = differenceEnMillisecondes / (1000 * 60 * 60 * 24); // Conversion en jours
        return differenceEnJours * coutParJour;
    }
}
