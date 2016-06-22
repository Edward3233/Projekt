package p_Gra;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test3 {

	@Test
	public void test() {
		MenuModel mo = new MenuModel();
		mo.addTwoNumbers("Dawid", "zestawrand");
		assertEquals("zestawrand", mo.getZestaw());
	}

}
