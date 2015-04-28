package pkg1410653475_u2;

/**
 *
 * @author 1410653475
 */
public class Fahrzeug {
    
    private short Reifen;

    public enum COLOR {RED, WHITE, SILVER, BLACK, BLUE};
    COLOR c;
    
    private short PS;
    private short Tueren;
    private short Geschwindigkeit;
    private boolean Gestartet;
    public static int Anzahl;

    
    public Fahrzeug(short Reifen, String farbe, short PS, short Tueren) {
        c = COLOR.RED;
        this.Reifen = Reifen;
        this.PS = PS;
        this.Tueren = Tueren;
        Anzahl++;
        c = COLOR.valueOf(farbe);
    }

    public short getReifen() {
        return Reifen;
    }

    public void setReifen(short Reifen) {
        this.Reifen = Reifen;
    }

    public COLOR getC() {
        return c;
    }

    public void setC(COLOR c) {
        this.c = c;
    }

    public short getPS() {
        return PS;
    }

    public void setPS(short PS) {
        this.PS = PS;
    }

    public short getTueren() {
        return Tueren;
    }

    public void setTueren(short Tueren) {
        this.Tueren = Tueren;
    }

    public short getGeschwindigkeit() {
        return Geschwindigkeit;
    }

    public void setGeschwindigkeit(short Geschwindigkeit) {
        this.Geschwindigkeit = Geschwindigkeit;
    }

    public boolean isGestartet() {
        return Gestartet;
    }

    public void setGestartet(boolean Gestartet) {
        this.Gestartet = Gestartet;
    }

    public static int getAnzahl() {
        return Anzahl;
    }

    public static void setAnzahl(int Anzahl) {
        Fahrzeug.Anzahl = Anzahl;
    }
    
        
    void starten(){
        this.Gestartet = true;
    }
    
    void stoppen(){
        this.Gestartet = false;
    }
    
    void beschleunigen(short geschwindigkeit){
        if(this.Gestartet==true && (this.Geschwindigkeit+geschwindigkeit<=250)){
            this.Geschwindigkeit += geschwindigkeit;
        }
        
    }
    
    void bremsen(short geschwindigkeit){
        if(this.Gestartet==true && (this.Geschwindigkeit-geschwindigkeit>=0)){
            this.Geschwindigkeit -= geschwindigkeit;
        }
        
    }

}
