package torpedojatek;

import java.util.Random;
import java.util.Scanner;

public class Hajo {
    int[] pozicio = new int[3];
    int talalatSzam = 0;
    
    public Hajo(){
        setPozicio(pozicio);
    }
    
    public void setPozicio(int[] pozicio){
        Random randomHely = new Random();
        int kezdoPoz = randomHely.nextInt(5);
        assert kezdoPoz > 4: "Rossz helyen jött létre.";
        System.out.println("Kezdő elhelyezkedése a hajónak: "+kezdoPoz);
        for (int i = 0; i < pozicio.length; i++) {
            this.pozicio[i] = kezdoPoz;
            kezdoPoz++;
        }
    }
    
    public String talalat(int poz){
        System.out.println("Üdvözöllek a torpedó játékban.");
        Scanner proba = new Scanner(System.in);
        System.out.println("Csak 1-7-es pozíciókra tud támadni.");
        System.out.println("Kérem adja meg milyen pozícióra szeretne támadni: ");
        int lovesPoz = proba.nextInt()-1;
        assert lovesPoz < 1: "1-esnél kisebb pozícióra nem lehet támadni!";
        
        while(talalatSzam < 3){
            int i = 0;
            while(i<pozicio.length && !(poz == pozicio[i])){
                i++;
            }
            if(i<pozicio.length){
                return "Talált";
            }
        }
        return "Mellé";
    }
}