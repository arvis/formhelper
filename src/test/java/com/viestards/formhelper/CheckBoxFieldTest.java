package com.viestards.formhelper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckBoxFieldTest {
	
	private CheckBoxField field;

	@Before
	public void setUp(){
		field= new CheckBoxField("testname", "value1");
	}

	@Test
	public void testGetField(){
		String result =field.getField();
		System.out.println(result);
		assertEquals("<input type='checkbox' "
				+ "name='testname' id='testname' value='value1' >", result);
	}

	@Test
	public void testGetFieldChecked(){
		field.setChecked(true);
		String result =field.getField();
		System.out.println(result);
		assertEquals("<input type='checkbox' name='testname' "
				+ "id='testname' value='value1' checked>", result);
	}
	
	@Test
	public void testGenerate(){
		field.setChecked(true);
		field.setLabel("My custom label");
		String result =field.generate();
		System.out.println(result);
		assertEquals("<input type='checkbox' name='testname' id='testname' value='value1' checked>My custom label  ", result);
	}
	
	
	@Test
	public void testFieldLabel(){
		field.setLabel("My custom label");
		String result =field.getFieldLabel();
		assertEquals("My custom label", result);
		
	}
	

}
