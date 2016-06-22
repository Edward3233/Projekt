package p_Gra;

public abstract class Pytanie {
	
	String odpA;
	String odpB;
	String odpC;
	String odpD;
	String pytanie;
	String poprawnaodp;
	
	public Pytanie(String pyt,String A,String B,String C,String D,String popr)
	{
		odpA=A;
		odpB=B;
		odpC=C;
		odpD=D;
		pytanie=pyt;
		poprawnaodp=popr;
		
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
	
	

}
