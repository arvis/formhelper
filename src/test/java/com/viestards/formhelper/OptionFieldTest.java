package com.viestards.formhelper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OptionFieldTest {

	private OptionField field;
	
	@Before
	public void setUp(){
		field= new  OptionField("myValue","Optionlabel");
	}
	
	
	@Test
	public void testGetField() {
		String result=field.getField();
		assertEquals("<option value='myValue' >Optionlabel</option>", result);
	}

	@Test
	public void testGenerate() {
		assertEquals(field.generate(), field.getField());
	}
	
	@Test
	public void testGetFieldSelected() {
		OptionField fieldSelected= new  OptionField("myValue","Optionlabel",true);
		String result=fieldSelected.getField();
		assertEquals("<option value='myValue' selected>Optionlabel</option>", result);
	}

	@Test
	public void testHtmlEscpae() {
		OptionField fieldSelected= new  OptionField("šņukurs","Šņukurs",true);
		String result=fieldSelected.getField();
		//System.out.println(result);
		assertEquals("<option value='&scaron;ņukurs' selected>&Scaron;ņukurs</option>", result);
		
		
	}
	
	
	

}
