package p_Gra;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test4 {

	@Test
	public void test() {
		MenuView mo = new MenuView();
		mo.jTextField1.setText("Kamil");
		mo.jTextField2.setText("Kamil");
		assertEquals("Kamil", mo.getImie());
	}

}
