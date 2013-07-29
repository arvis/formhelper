package com.viestards.formhelper;

public abstract class BaseField  {
	
	private String name;
	private String value;
	private String label;
	private String fieldDelimiter="";
	
	private String htmType;
	
	public BaseField(String name, String value ){
		this.name=name;
		this.value=value;
		label="";
	}

	public abstract String getField();
	
	public String generate() {
		final String err="";
		return getFieldLabel()+fieldDelimiter+getField()+fieldDelimiter+getError(err);
	}
	
	
	public String getFieldLabel() {
		if ( this.getLabel().length()==0){
			setLabel(getName());
		}
		
		return String.format("<label for='%s' >%s</label>",getName(),getLabel());
	}
	
	public String getError(String errDescription) {
		return String.format("%s %s %s",fieldDelimiter, errDescription, fieldDelimiter);
	}
	
	
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

	public String getFieldDelimiter() {
		return fieldDelimiter;
	}

	public void setFieldDelimiter(String fieldDelimiter) {
		this.fieldDelimiter = fieldDelimiter;
	}

	
}
