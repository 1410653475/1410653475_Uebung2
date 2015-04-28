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
public class Mensch extends Säugetier {

    public Mensch(String Name, int Alter, String Geschlecht) {
        super(Name, Alter, Geschlecht);
    }

    @Override
    String printAll(){
        return Name+"#"+Alter+"#"+Geschlecht;
    }
    
}
