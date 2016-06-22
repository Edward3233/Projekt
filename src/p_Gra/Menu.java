/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_Gra;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Menu extends javax.swing.JFrame {

	
	
	public static void main(String args[])
	{
		MenuModel model= new MenuModel();
		MenuView view = new MenuView();
		
		MenuController control = new MenuController(view, model);
		view.setVisible(true);
	}
}
    
