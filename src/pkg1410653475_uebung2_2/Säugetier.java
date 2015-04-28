/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1410653475_uebung2_2;

/**
 *
 * @author 1410653475
 */
public class Säugetier {
    String Name;
    int Alter;
    String Geschlecht;

    public Säugetier(String Name, int Alter, String Geschlecht) {
        this.Name = Name;
        this.Alter = Alter;
        this.Geschlecht = Geschlecht;
    }
    
    String printAll(){
        return "WSD";
        //return Name+"#"+Alter+"#"+Geschlecht;
    }
}
