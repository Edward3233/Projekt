/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_Gra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import static java.lang.Integer.parseInt;


public class SaveGry {
    
    File file = new File("src/statystyki/save.txt");
    
        int friend;
        int polnapol;
        int pub;
        int licznik;
        String zestaw;
        String imie;
        int[] tabpom = new int [5];
        int pom;
   
        
    boolean ustaw() throws FileNotFoundException, IOException
    {
        
        int pomocnicza = 0;
       
        
        FileReader odczyt = new FileReader(file);
        BufferedReader buff = new BufferedReader(odczyt);
        buff.readLine();
        pomocnicza = parseInt(buff.readLine());
        if(pomocnicza == 1)
        {
        pom = parseInt(buff.readLine());
        for (int i = 0; i < 5; i++) {
            tabpom[i] = parseInt(buff.readLine());
        }
        polnapol = parseInt(buff.readLine());
        friend = parseInt(buff.readLine());
        pub =  parseInt(buff.readLine());
        licznik =  parseInt(buff.readLine());
        zestaw = buff.readLine();
        imie = buff.readLine();
        }
        else
            return false;
        
        return true;
        
    }
    
   

    void zapisz(int friend, int polnapol, int pub, int licznik, String zestaw, String imie, Integer[] tabpom, int pom) throws FileNotFoundException, UnsupportedEncodingException {
        
        PrintWriter bum1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), "windows-1250"), true);

        bum1.println("Stan gry");
        bum1.println(1);
        bum1.println(pom);
        for (int i = 0; i < 5; i++) {
            bum1.println(tabpom[i]);
        }
        bum1.println(polnapol);
        bum1.println(friend);
        bum1.println(pub);
        bum1.println(licznik);
        bum1.println(zestaw);
        bum1.println(imie);
        bum1.write("koniec");
        bum1.close();
        
    }
    
}

