/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencelocation.personnel;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Client extends Personne{
     private ArrayList<Integer> historiqueLocation; //type Location dans le tableau

    public Client(double cin,String nom, String prenom, double tel,String email) {   
        super(cin,nom,prenom,tel,email);
        this.historiqueLocation=new ArrayList<>();
    }

    public void AfficherLesLocations(){
        for (int i = 0; i < historiqueLocation.size(); i++){
            System.out.println(historiqueLocation.get(i));
        }
    }

    public int CaluculeNbLocations(){
        return this.historiqueLocation.size();
    }
    
    public boolean VerifierHistorique(){
        return this.historiqueLocation.size()==1;
    }
}
