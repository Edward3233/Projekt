package p_Gra;

public class MenuModel {
	
	private String imie;
	private String zestaw;
	
	public void addTwoNumbers(String imie, String zestaw){
		this.imie = imie;
		this.zestaw=zestaw;
	}
		    
	public String getZestaw()
	{
		 return zestaw;
	}
	
	public String getImie()
	{
		 return imie;
	}
}
