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
public class Auto extends Fahrzeug implements Comparable {
    
    private boolean Klimaanlage=false;
    private short Airbags;

    public Auto(short Airbags, short Reifen, String Farbe, short PS, short Tueren) {
        super(Reifen, Farbe, PS, Tueren);
        
        this.Airbags = Airbags;
    }

    public boolean isKlimaanlage() {
        return Klimaanlage;
    }

    @Override
    public String toString() {
        return "Mein Auto hat "+getPS()+" PS und fährt mit " +getGeschwindigkeit()+" km/h";
    }

    public void setKlimaanlage(boolean Klimaanlage) {
        this.Klimaanlage = Klimaanlage;
    }

    public short getAirbags() {
        return Airbags;
    }

    public void setAirbags(short Airbags) {
        this.Airbags = Airbags;
    }
    
    
    void klimaanlageAn(){
        if(this.Klimaanlage==false){
            this.Klimaanlage=true;
        }else{
            System.out.println("Klima läuft bereits!");
        }
    }
    
    void klimaanlageAus(){
        if(this.Klimaanlage==true){
            this.Klimaanlage=false;
        }else{
            System.out.println("Klima bereits aus!");
        }
    }

    @Override
    public int compareTo(Object o) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;
        Auto a = (Auto) o;
        
        if(this.getPS()==a.getPS()) return EQUAL;
        
        if(this.getPS()>a.getPS()){
            return BEFORE;
        }else{
            return AFTER;
        }
        
        
    }

    
    
    
}
