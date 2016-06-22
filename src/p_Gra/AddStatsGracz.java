/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_Gra;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class AddStatsGracz {
    
    File file = new File("");
    String imie;
    int licznik;

    AddStatsGracz(String imie, int licznik) {
         file = new File("src/statystyki/gracz.txt");
     
         this.imie = imie;
         this.licznik = licznik;
    }
    
    void dodaj_statysytke_gracza() throws FileNotFoundException, IOException
    {
        if(licznik==17)
        {
            licznik = 15;
        }
        else
        {
        licznik = licznik - 2;
        }
        String pom; 
        pom = Integer.toString(licznik); 
        
        FileWriter file2 = new FileWriter(file, true);
        BufferedWriter out = new BufferedWriter(file2);
        out.newLine();
        out.write(imie);
        out.newLine();
        out.write(pom);
        out.close();

        
    }
    
}
