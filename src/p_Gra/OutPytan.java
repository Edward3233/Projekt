/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_Gra;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class OutPytan {
    
    
    public PytanieWa []tabpytania = new PytanieWa [5];
    public PytanieWa [] tabwczytaj = new PytanieWa [15];
    
    Integer [] tabpom = {0,1,2,3,4};
    int pom = 0;
    File file = new File("");
    
    

void WyborZestawu(String zestaw) throws FileNotFoundException
{
    if("1".equals(zestaw))
    {
    file = new File("src/pytania/zestaw1.txt");
    }
    if("2".equals(zestaw))
    {
        file = new File("src/pytania/zestaw2.txt");  
        
    }
    if("3".equals(zestaw))
    {
        file = new File("src/pytania/zestaw3.txt");   
    
        
    }
     Scanner odczyt = new Scanner((file), "windows-1250");

          odczyt.nextLine();
        for(int i=0;i<15;i++)
               tabwczytaj[i] = new PytanieWa(odczyt.nextLine(),odczyt.nextLine(),odczyt.nextLine(),odczyt.nextLine(),odczyt.nextLine(),odczyt.nextLine(),odczyt.nextLine());
        
        
        
        
        }
   
    @SuppressWarnings("empty-statement")
         
 void WczytajPytania(String a) throws FileNotFoundException, IOException
 {
  
     
        
       int k=0;
        for(int i=0;i<15;i++)
        {
            if(a.equalsIgnoreCase(tabwczytaj[i].getTrud()))
            {

              tabpytania[k] = tabwczytaj[i];
            
              k++;
            }
        }
         
      
     
Collections.shuffle(Arrays.asList(tabpom));   
        
      }
 

 String Wczytaja()
 {
     return tabpytania[tabpom[pom]].getA();
             
 }
 
String Wczytajb()
 {
     return tabpytania[tabpom[pom]].getB();
             
 }
 String Wczytajc()
 {
     return tabpytania[tabpom[pom]].getC();
             
 }
 String Wczytajd()
 {
    
     return tabpytania[tabpom[pom]].getD();
     
             
 }
 
 void ods()
 {
     pom++;
 }
 
 String Wczytajpop()
 {  
     return tabpytania[tabpom[pom]].getPopr();
 }
        
 
 String ZadajPytanie()
 {  
     
     Random rand = new Random();         
     return tabpytania[tabpom[pom]].getPytanie();
  
     }
   
 
}
