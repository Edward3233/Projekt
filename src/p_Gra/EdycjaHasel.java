/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_Gra;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class EdycjaHasel extends javax.swing.JFrame  {

   File file4 = new File("");
        File file = new File("");
        File file2 = new File("");
        File file3 = new File("");
        String [] tabiloscwyswietlen = new String [15];
        String [] tabpop = new String [15];
        String [] tabniepop = new String [15];
        String [][] tabpytania = new String [15][7];

    EdycjaHasel(String zestaw) throws IOException {
        this.getContentPane().setBackground(Color.black);
        initComponents();
        
       this.jLabel6.setVisible(false);
       
        if("1".equals(zestaw))
                {
         file = new File("src/statystyki/zestaw1.txt");
         file2 = new File("src/statystyki/1_POP.txt");
         file3 = new File("src/statystyki/1_NIEPOP.txt");
         file4 = new File("src/pytania/zestaw1.txt");
 
                }
         if("2".equals(zestaw))
                {
         file = new File("src/statystyki/zestaw2.txt");
         file2 = new File("src/statystyki/2_POP.txt");
         file3 = new File("src/statystyki/2_NIEPOP.txt");
         file4 = new File("src/pytania/zestaw2.txt");
 
                }
          if("3".equals(zestaw))
                {
         file = new File("src/statystyki/zestaw3.txt");
         file2 = new File("src/statystyki/3_POP.txt");
         file3 = new File("src/statystyki/3_NIEPOP.txt");
         file4 = new File("src/pytania/zestaw3.txt");
 
                }
          
       Scanner odczyt = new Scanner((file4), "windows-1250");
    
          odczyt.nextLine();
          
       for(int i=0;i<15;i++)
                for(int j=0; j<7; j++)
                {
                       tabpytania[i][j] = odczyt.nextLine();
            
                }
        Scanner odczyt2 = new Scanner((file), "windows-1250");
        odczyt2.nextLine();
            for(int i=0;i<15;i++)
                this.tabiloscwyswietlen[i] = odczyt2.nextLine();
            
            Scanner odczyt3 = new Scanner((file2), "windows-1250");
        odczyt3.nextLine();
            for(int i=0;i<15;i++)
                this.tabpop[i] = odczyt3.nextLine();
            
            Scanner odczyt4 = new Scanner((file3), "windows-1250");
        odczyt4.nextLine();
            for(int i=0;i<15;i++)
                this.tabniepop[i] = odczyt4.nextLine();
        
        
    }

    private EdycjaHasel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));
        setMaximumSize(new java.awt.Dimension(780, 519));
        setMinimumSize(new java.awt.Dimension(780, 519));
        setResizable(false);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pytanie 1", "Pytanie 2", "Pytanie 3", "Pytanie 4", "Pytanie 5", "Pytanie 6", "Pytanie 7", "Pytanie 8", "Pytanie 9", "Pytanie 10", "Pytanie 11", "Pytanie 12", "Pytanie 13", "Pytanie 14", "Pytanie 15" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jButton1.setText("Edytuj");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Powrót");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Odp A");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Odp B");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Odp C");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Odp D");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Odp poprawna");

        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Blad!");

        jTextField1.setText("Wybierz pytanie z listy ;)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(339, 339, 339)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(194, 194, 194)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel3)
                .addGap(232, 232, 232)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        int i = 0;

       i = jList1.getSelectedIndex();
       this.jTextField1.setText(tabpytania[i][1]);
       this.jTextField5.setText(tabpytania[i][2]);
       this.jTextField2.setText(tabpytania[i][3]);
       this.jTextField3.setText(tabpytania[i][4]);
       this.jTextField6.setText(tabpytania[i][5]);
       this.jTextField4.setText(tabpytania[i][6]);
       
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Menu form = new Menu();
        this.setVisible(false);
        form.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        
      
           String a, b, c, d, e;
           a = jTextField5.getText();
           b = jTextField2.getText();
           c = jTextField3.getText();
           d = jTextField6.getText();
           e = jTextField4.getText();
           boolean dalej = false;
           int licznik = 0;
           if( a.equals(b) && b.equals(c) && c.equals(d) )
               this.jLabel6.setVisible(dalej = true);
           if( a.equals(b) && b.equals(c) || a.equals(b) && b.equals(d) || a.equals(c) && c.equals(d) || b.equals(c) && c.equals(d) )
               this.jLabel6.setVisible(dalej = true);
           if( a.equals(b) && c.equals(d) || a.equals(c) && b.equals(d) || a.equals(d) && b.equals(c) )
               this.jLabel6.setVisible(dalej = true);
           if( a.equals(b) || a.equals(c) || a.equals(d) || b.equals(c) || b.equals(d) || c.equals(d) )
               this.jLabel6.setVisible(dalej = true);
           if("".equals(a) || "".equals(b) || "".equals(c) || "".equals(d) || "".equals(this.jTextField4.getText()))
               this.jLabel6.setVisible(dalej = true);
           if(a.equals(e))
               licznik ++;
           if(b.equals(e))
               licznik ++;
           if(c.equals(e))
               licznik ++;
           if(d.equals(e))
               licznik ++;
           if(licznik>1 || licznik == 0)
               this.jLabel6.setVisible(dalej = true);
           
          
           
           
           if(dalej == false)
           {
           int i = jList1.getSelectedIndex();
           tabpytania[i][1] = jTextField1.getText();
           tabpytania[i][2] = jTextField5.getText();
           tabpytania[i][3] = jTextField2.getText();
           tabpytania[i][4] = jTextField3.getText();
           tabpytania[i][5] = jTextField6.getText();
           tabpytania[i][6] = jTextField4.getText();
           FileOutputStream output;
               try {
                   PrintWriter zapis = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file4), "windows-1250"), true);
                   zapis.println("Pytania");
                   
                    for(int l=0;l<15;l++)
                for(int j=0; j<7; j++)
                {
                     if(l==14 && j == 6)
                         zapis.write(tabpytania[l][j]);
                     else
                    zapis.println(tabpytania[l][j]);
  
                     
               }
        
                      zapis.close();
                      
               zapis = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), "windows-1250"), true);
               zapis.println("Pytania");
               tabiloscwyswietlen[i] = "0";
               for(int l=0;l<15;l++)
                   zapis.println(tabiloscwyswietlen[l]);
               
               zapis.write("koniec");
               
               zapis.close();
               
               zapis = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file2), "windows-1250"), true);
               zapis.println("Poprawne odp");
               this.tabpop[i] = "0";
               for(int l=0;l<15;l++)
                   zapis.println(tabpop[l]);
               
               zapis.write("koniec");
               zapis.close();
               
               zapis = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file3), "windows-1250"), true);
               zapis.println("Niepoprawne odp");
               this.tabniepop[i] = "0";
               for(int l=0;l<15;l++)
                   zapis.println(tabniepop[l]);
               
               
               zapis.write("koniec");
               zapis.close();
               
               this.jLabel6.setVisible(false);
               
               
           }   catch (FileNotFoundException ex) {
                   Logger.getLogger(EdycjaHasel.class.getName()).log(Level.SEVERE, null, ex);
               } catch (IOException ex) {
                   Logger.getLogger(EdycjaHasel.class.getName()).log(Level.SEVERE, null, ex);
               }
     
           }
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EdycjaHasel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdycjaHasel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdycjaHasel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdycjaHasel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EdycjaHasel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
