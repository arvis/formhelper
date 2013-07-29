package com.viestards.formhelper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.viestards.formhelper.InputField;

public class InputFieldTest {

	private static InputField input;
	
	@Before
	public void setUp(){
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
	public void testError(){
		String result =input.getError("");
		assertEquals("  ", result);
	}
	
	@Test
	public void testCustomLabel(){
		input.setLabel("Custum one");
		String result =input.getFieldLabel();
		assertEquals("<label for='testname' >Custum one</label>", result);
	}
	
	
	
	@Test
	public void testGenerate() {
		String result =input.generate();
		assertEquals("<label for='testname' >testname</label><input name='testname' id='testname' value='' />  ", result);
	}
	
	/**
	 * tests if html is correctly escaped and harmfull scripts can not be executed
	 * */
	@Test
	public void testGenerateHtmlEscape() {
		InputField harmfullInput=new InputField("simple", "value");
		harmfullInput.setLabel("harmfull imput<script>alert('All your base are belong to us!')</script> ");
		String result =harmfullInput.generate();
		System.out.println(result);
		assertEquals("<label for='simple' >"
				+ "harmfull imput&lt;script&gt;"
				+ "alert('All your base are belong to us!')&lt;/script&gt; </label>"
				+ "<input name='simple' id='simple' value='value' />  ", result);
	}
	
	


}
