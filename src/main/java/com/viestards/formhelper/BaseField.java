package com.viestards.formhelper;

public abstract class BaseField  {
	
	private String name;
	private String value;
	private String label;
	
	private String htmType;
	
	public BaseField(String name, String value ){
		this.name=name;
		this.value=value;
		label="";
	}
	
	public abstract String getFieldLabel();
	public abstract String getField();
	public abstract String getError();
	
	public abstract String generate();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}


	public String getHtmType() {
		return htmType;
	}

	public void setHtmType(String htmType) {
		this.htmType = htmType;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}

	
}
