package com.viestards.formhelper;


public class InputField extends BaseField {
	private String delimiter=" ";

	
	public InputField(String name, String value) {
		super(name, value);
		setHtmType("input");
		
		
	}

	@Override
	public String generate() {
		//return "<input name='%s' id='%s' value='%s'> " % (name,name,value) ;
		
		return getFieldLabel() +delimiter+getField()+delimiter+getError();
	}

	@Override
	public String getField() {
		return String.format("<input name='%s' id='%s' value='%s' />", getName() ,getName(),getValue());
	}

	@Override
	public String getError() {
		return "";
	}

	@Override
	public String getFieldLabel() {
		if ( this.getLabel().length()==0){
			setLabel(getName());
		}
		
		return String.format("<label for='%s' >%s</label>",getName(),getLabel());
	}


}
