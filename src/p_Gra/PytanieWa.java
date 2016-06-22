package p_Gra;

public class PytanieWa extends Pytanie{

	String trudnosc;
	public PytanieWa(String trud,String pyt, String A, String B, String C, String D, String popr) {
		super(pyt, A, B, C, D, popr);
		trudnosc = trud;
	}
	
	public String getA()
	{
		return odpA;
	}
	public String getB()
	{
		return odpB;
	}
	public String getC()
	{
		return odpC;
	}
	public String getD()
	{
		return odpD;
	}
	public String getPopr()
	{
		return poprawnaodp;
	}
	public String getPytanie()
	{
		return pytanie;
	}
	
	public String getTrud()
	{
		return trudnosc;
	}
	

}
