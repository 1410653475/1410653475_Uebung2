/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1410653475_u2;


/**
 *
 * @author 1410653475
 */
public class Wasserfahrzeug extends Fahrzeug {
    
    private double Tiefgang;
    private short Schrauben;
    private double Ladung;

    public Wasserfahrzeug(double Tiefgang, short Schrauben, double Ladung, short Reifen, String Farbe, short PS, short Tueren) {
        super(Reifen, Farbe, PS, Tueren);
        this.Tiefgang = Tiefgang;
        this.Schrauben = Schrauben;
        this.Ladung = Ladung;
    }

    @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat "+getPS()+" PS und einen Tiefgang von "+getTiefgang()+"m";
    }

    
    public double getTiefgang() {
        return Tiefgang;
    }

    public void setTiefgang(double Tiefgang) {
        this.Tiefgang = Tiefgang;
    }

    public short getSchrauben() {
        return Schrauben;
    }

    public void setSchrauben(short Schrauben) {
        this.Schrauben = Schrauben;
    }

    public double getLadung() {
        return Ladung;
    }

    public void setLadung(double Ladung) {
        this.Ladung = Ladung;
    }
    
    
    void entladen() throws InterruptedException{
        this.Ladung=0.0;
        
        Thread.sleep(5000);
    }
}
