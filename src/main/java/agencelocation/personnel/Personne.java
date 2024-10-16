/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencelocation.personnel;

/**
 *
 * @author LENOVO
 */

  

public class Personne {
    private double cin ;
    private String nom;
    private String prenom;
    private double tel;
    private String email;

    public Personne(double cin,String nom, String prenom, double tel,String email)
    {
        this.cin=cin;
        this.nom=nom;
        this.prenom=prenom;
        this.tel=tel;
        this.email=email;
    }

    public double getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        return "Personne{cin"+cin+"nom="+nom+"prenom"+prenom+"tel"+tel+"email"+email+"}";
    }

    public void setCin(double cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(double tel) {
        this.tel = tel;
    }

}
