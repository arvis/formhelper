package com.viestards.formhelper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TextAreaFieldTest {

	private TextAreaField field;
	
	@Before
	public void setUp(){
		field= new TextAreaField("testname", "value1");
	}

	@Test
	public void testGetField(){
		String result =field.getField();
		assertEquals("<textarea name='testname' id='testname' rows='3' cols='40'>value1</textarea>", result);
		
	}
	
	@Test
	public void testGenerate() {
		String result =field.generate();
		assertEquals("<label for='testname' >testname</label>"+
				"<textarea name='testname' id='testname' rows='3' cols='40'>value1</textarea>  ", result);
	}

}
