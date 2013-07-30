package com.viestards.formhelper;


public class InputField extends BaseField {

	private String inputType="text"; //TODO: set as enumerate or something
	
	public InputField(String name, String value) {
		super(name, value);
		setHtmType("input");
	}

	@Override
	public String getField() {
		return String.format("<input type='%s' name='%s' id='%s' value='%s' />",
				getInputType(), getName() ,getName(),getValue());
	}

	public String getInputType() {
		return inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}



}
