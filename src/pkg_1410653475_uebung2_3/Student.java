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
public class Student extends Mensch {
    String Matrikelnummer;
    String Studiengang;

    public Student(String Matrikelnummer, String Studiengang, String Vorname, String Nachname, int Alter) {
        super(Vorname, Nachname, Alter);
        this.Matrikelnummer = Matrikelnummer;
        this.Studiengang = Studiengang;
    }
    
    @Override
    String Status(){
        return "Es handelt sich um einen Studenten";
    }
    
}
