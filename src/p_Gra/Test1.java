package p_Gra;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void test() {
		PytanieWa test=new PytanieWa("Miko�aj Hugo Ko��taj","Adam Mickiewicz","asas","Zz","dramat","dramat","dramat");
		assertEquals("dramat", test.getD());
	}

}
