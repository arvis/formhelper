package com.viestards.formhelper;


public class InputField extends BaseField {

	
	public InputField(String name, String value) {
		super(name, value);
		setHtmType("input");
	}

	@Override
	public String getField() {
		return String.format("<input name='%s' id='%s' value='%s' />", getName() ,getName(),getValue());
	}



}
