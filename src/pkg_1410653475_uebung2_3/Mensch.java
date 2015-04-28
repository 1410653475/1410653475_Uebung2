/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg_1410653475_uebung2_3;

/**
 *
 * @author 1410653475
 */
public class Mensch {
    
    String Vorname;
    String Nachname;
    int Alter;

    public Mensch(String Vorname, String Nachname, int Alter) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Alter = Alter;
    }
    
    String Status(){
        return "Es handelt sich um einen Menschen: "+Vorname+", "+Nachname+", "+Alter;
    }
}
