package p_Gra;

public class SprawdzOdpFacade {

	private String udzielona;
	private String poprawna;
	
	private Porownaj por= new Porownaj();
	
	public SprawdzOdpFacade()
	{
	}
	
	public SprawdzOdpFacade(String udzielona, String poprawna)
	{
		this.udzielona=udzielona;
		this.poprawna=poprawna;
	}
	
	public int getValue()
	{
		if(por.CzyRowne(poprawna,udzielona)==1)
			return 1;
		else
			return 0;
	}
}
