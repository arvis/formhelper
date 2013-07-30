package com.viestards.formhelper;

public class CheckBoxField extends BaseField {
	
	private boolean checked=false;

	public CheckBoxField(String name, String value) {
		super(name, value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getField() {
		String checkedValue="";
		if (this.checked) checkedValue="checked";
		return String.format("<input type='checkbox' name='%s' id='%s' value='%s' %s>%s",
				getName() ,getName(),getValue(),checkedValue,  getLabel());
	}
	
	@Override
	public String generate() {
		final String err="";
		return getField()+ this.getFieldDelimiter()+getError(err);
	}

	
	@Override
	public String getFieldLabel() {
		if ( this.getLabel().length()==0){
			setLabel(getName());
		}
		
		return getLabel();
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

}
