/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumInheritance;

/**
 *
 * @author Kanza Salsabila
 */
public class Baby extends Parents{
    String babyName;

    Baby(String nurul_Intan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getBabyName() {
        return babyName;
    }
    Baby(String babyName){
        super();
        this.babyName = babyName;
        System.out.println("Konstruktor Baby");
        System.out.println(babyName);
 } 
    public void cry() {
        System.out.println("owek owek");
    }
    
}
