/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_Gra;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;



public class AddStatsPytan {
    
   
   String [] stringpom = new String[15];
   int intpom; 
   File file = new File("");
   File file2 = new File("");
   File file3 = new File("");
   File file4 = new File("");
   String [] tabwczytaj = new String [15];
   
   void Wyborzestawu(String zestaw) throws FileNotFoundException, IOException
{
    if("1".equals(zestaw))
    {
    file = new File("src/statystyki/zestaw1.txt");
    file2 = new File("src/pytania/zestaw1.txt");
    file3 = new File("src/statystyki/1_POP.txt");
    file4 = new File("src/statystyki/1_NIEPOP.txt");

    }
    if("2".equals(zestaw))
    {
    file = new File("src/statystyki/zestaw2.txt");
    file2 = new File("src/pytania/zestaw2.txt");
    file3 = new File("src/statystyki/2_POP.txt");
    file4 = new File("src/statystyki/2_NIEPOP.txt");
    }
    if("3".equals(zestaw))
    {
    file = new File("src/statystyki/zestaw3.txt");
    file2 = new File("src/pytania/zestaw3.txt");
    file3 = new File("src/statystyki/3_POP.txt");
    file4 = new File("src/statystyki/3_NIEPOP.txt");
    }
    
    Scanner odczyt = new Scanner((file2), "windows-1250");
    
          String pom;
          pom=odczyt.nextLine();
          
        for(int i=0;i<15;i++)
           for(int j=0; j<7; j++)
               if(j==1)
               tabwczytaj[i] = odczyt.nextLine();
                else
                   odczyt.nextLine();
        
        Scanner odczyt2 = new Scanner((file), "windows-1250");
          pom=odczyt2.nextLine();
            for(int i=0;i<15;i++)
                stringpom[i] = odczyt2.nextLine();

        }
   
   
   void ustawiloscodp(int wybor, String pytanie) throws FileNotFoundException, UnsupportedEncodingException
   {
       File file5 = new File("");
       
       Scanner odczyt1 = new Scanner((file3), "windows-1250");
       Scanner odczyt2 = new Scanner((file4), "windows-1250");
          
          odczyt1.nextLine();
          odczyt2.nextLine();
       
          
          if(wybor==1)
          {
          
          for(int j=0;j<15;j++)
          stringpom[j] = odczyt2.nextLine();
             
          for(int i=0;i<15;i++)
          if(tabwczytaj[i].equals(pytanie))
          {
            intpom = Integer.parseInt(stringpom[i]);
            intpom++;
            stringpom[i] = Integer.toString(intpom);  
            file5 = file4;
          }
          }
          else
          {
          for(int j=0;j<15;j++)
          stringpom[j] = odczyt1.nextLine();
             
          for(int i=0;i<15;i++)
          if(tabwczytaj[i].equals(pytanie))
          {
            intpom = Integer.parseInt(stringpom[i]);
            intpom++;
            stringpom[i] = Integer.toString(intpom);  
            file5 = file3;
          }    
              
          }
       
        PrintWriter bum1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file5), "windows-1250"), true);
    bum1.println("Pytania");
           for(int i=0;i<15;i++)
                   bum1.println(stringpom[i]);

    bum1.print("koniec");
    
           bum1.close(); 
            
            
   }
   
   void ustawiloscpytan(String pytanie) throws FileNotFoundException, IOException
    {
        
        
        for(int i=0;i<15;i++)
        if(tabwczytaj[i].equals(pytanie))
        {
            intpom = Integer.parseInt(stringpom[i]);
            intpom++;
            stringpom[i] = Integer.toString(intpom);
        }
  
  PrintWriter bum1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), "windows-1250"), true);
    
    bum1.println("Pytania");
           for(int i=0;i<15;i++)
                   bum1.println(stringpom[i]);

    bum1.print("koniec");
    
           bum1.close(); 
        
       

    }
}

