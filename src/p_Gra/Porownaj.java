package p_Gra;

public class Porownaj {

	
	public Porownaj()
	{
		System.out.println("Porownywanie");
	}
	
	public int CzyRowne(String pop, String ud)
	{
		if(ud.equals(pop))
		{
			return 1;
		}
		else
			return 0;
	}
}
