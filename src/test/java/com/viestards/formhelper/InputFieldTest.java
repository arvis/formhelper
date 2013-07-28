package com.viestards.formhelper;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.viestards.formhelper.InputField;

public class InputFieldTest {

	private static InputField input;
	
	@BeforeClass
	public static void setUp(){
		input=new InputField("testname", "");
	}

	@Test
	public void testGetField(){
		String result =input.getField();
		//org.junit.ComparisonFailure: expected:<<input []/>> but was:<<input [name='testname' id='testname' value='' ]/>>
		assertEquals("<input name='testname' id='testname' value='' />", result);
	}
	@Test
	public void testGetFieldLabel(){
		String result =input.getFieldLabel();
		assertEquals("<label for='testname' >testname</label>", result);
	}

	@Test
	public void testGenerate() {
		String result =input.generate();
		assertEquals("<label for='testname' >testname</label> <input name='testname' id='testname' value='' /> ", result);
	}
	
	
	


}
