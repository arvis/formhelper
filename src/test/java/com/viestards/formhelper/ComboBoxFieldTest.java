package com.viestards.formhelper;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ComboBoxFieldTest {

	private ComboBoxField field;
	private ArrayList<OptionField> optionList;
	
	@Before
	public void setUp(){
		optionList=new ArrayList<OptionField>();
		
		optionList.add(new OptionField("value1", "LabelValue1"));
		optionList.add(new OptionField("value2", "LabelValue2",true));
		field= new ComboBoxField("mylist",optionList);
	}

	@Test
	public void testGenerate() {
		String result=field.generate();
		assertEquals("<select name='mylist' id='mylist' >"
				+ "<option value=''></option>"
				+ "<option value='value1' >LabelValue1</option>"
				+ "<option value='value2' selected>LabelValue2</option>"
				+ "</select>  " , result);
	}

}
