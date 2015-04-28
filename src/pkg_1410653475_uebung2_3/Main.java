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
public class Main{
    public static void main(String[] args){
        Mensch ich = new Mensch("Michael","Erharter",21);
        System.out.println(ich.Status());
        
        Student ich2 = new Student("1410653475","WEB14","Michael","Erharter",21);
        
        System.out.println(ich2.Status());
    }
}
