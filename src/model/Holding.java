/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package model;

import java.util.*;

/**
 *
 * @author diegoandrestorres
 */
public class Holding {
    
    private String name;
    private long nit;
    
    private ArrayList<Company> com;

    public Holding(String name, long nit) {
        this.name = name;
        this.nit = nit;
    }
    
    public String addCompany(Company comp){
        
        String msj = " ";
        boolean found = false;
        
        for (int i = 0; i < com.size() && !found; i++) {
            
            if (com.get(i) == null) {
                
                com.add(comp);
                msj += " Se ha creado la compañia" + "\n";
            }
        }
        return msj;
    }
    
    public String showInfo(){
        
        String msj = " ";
        
        
        
        return msj;
    }
}
