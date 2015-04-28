/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1410653475_u2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 1410653475
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto bmw = new Auto((short)4,(short)4,"SILVER",(short)220,(short)5);
        Auto audi = new Auto((short)8,(short)4,"BLACK",(short)180,(short)5);
        Auto audi2 = new Auto((short)4,(short)4,"BLUE",(short)150,(short)5);
        Auto audi3 = new Auto((short)4,(short)4,"RED",(short)300,(short)5);
        Auto audi4 = new Auto((short)4,(short)4,"SILVER",(short)400,(short)5);
        Auto audi5 = new Auto((short)4,(short)4,"WHITE",(short)120,(short)5);
        
        Wasserfahrzeug titanic = new Wasserfahrzeug(10.54, (short)3, 100000.0, (short)0, "BLUE", (short)51000, (short)0);
        
        
        //System.out.println(bmw);
        //System.out.println(audi);
        //System.out.println(titanic);
        
        List<Auto> liste = new ArrayList<>();
        liste.add(audi);
        liste.add(bmw);
        liste.add(audi2);
        liste.add(audi3);
        liste.add(audi4);
        liste.add(audi5);
        Collections.sort(liste);
        
        for(Auto element:liste){
            System.out.println(element.toString());
        }
        
        
    }
    
}
