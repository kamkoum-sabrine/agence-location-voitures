/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencelocation.personnel;

/**
 *
 * @author LENOVO
 */
public class Chauffeur extends Personne{
    private boolean disponibilite;
    private int experience;
    
    public Chauffeur(double cin,String nom, String prenom, double tel,String email, boolean disponibilite, int experience){
        super(cin, nom, prenom, tel, email);
        this.disponibilite = disponibilite;
        this.experience = experience;
    }

    public boolean getDisponibilite() {
        return disponibilite;
    }

    public int getExperience() {
        return experience;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    
}
