/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torpedojatek;

import java.util.Random;

/**
 *
 * @author hallgato
 */
public class Hajo {
    int[] pozicio = new int[3];
    int talal;
    
    public Hajo(){
        setPozicio(pozicio);
    }
    
    public void setPozicio(int[] pozicio){
        Random randomHely = new Random();
        int kezdoPoz = randomHely.nextInt(5);
        System.out.println("Kezdő elhelyezkedése a hajónak: "+kezdoPoz);
        for (int i = 0; i < pozicio.length; i++) {
            this.pozicio[i] = kezdoPoz;
            kezdoPoz++;
        }
    }
    
    public String talalat(int poz){
        int i = 0;
        while(i<pozicio.length && !(poz == pozicio[i])){
            i++;
        }
        if(i<pozicio.length){
            return "Talált";
        }
        return "Mellé";
    }
}