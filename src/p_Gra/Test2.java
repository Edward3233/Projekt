package p_Gra;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {

	@Test
	public void test() {
		MenuModel mo = new MenuModel();
		mo.addTwoNumbers("kamil", "czesiek");
		assertEquals("kamil", mo.getImie());
	}

}
