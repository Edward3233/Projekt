package p_Gra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuController {
	
	private MenuView vi = new MenuView();
	private MenuModel mo = new MenuModel();
	
	public MenuController(MenuView vi, MenuModel mo)
	{
		this.vi = vi;
		this.mo = mo;
		
		this.vi.addDalejListener(new GoListener());
	}


class GoListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
	            String imie = null, zestaw = null;
	            // Surround interactions with the view with
	            // a try block in case numbers weren't
	            // properly entered
            try{
            	imie = vi.getImie();
	            zestaw = vi.getZestaw();
	            mo.addTwoNumbers(imie, zestaw);
	            }	
	            catch(NumberFormatException ex){
	                System.out.println(ex);	                 
	            }
	        
        if(imie!=null && zestaw !=null)  
		try {
        Gra form = Gra.getInstance(mo.getImie(),mo.getZestaw(), 0);
        form.setVisible(true);
        vi.setVisible(false);
     } catch (IOException ex) {
         Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
     }


	    }
}
	     

	}
