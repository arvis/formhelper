package com.viestards.formhelper;

/**
 * generates option html field
 * example:
 * <option value="saab" selected>Saab</option>
 * */
public class OptionField extends BaseField {
	
	private boolean selected=false;

	public OptionField(String value,String label, boolean selected) {
		super("", value);
		this.setLabel(label);
		this.setSelected(selected);
	}
	
	public OptionField(String value,String label) {
		super("", value);
		this.setLabel(label);

	}

	@Override
	public String getField() {
		String selectedValue="";
		if (selected) selectedValue="selected";
		return String.format("<option value='%s' %s>%s</option>",getValue(),selectedValue, getLabel());
	}
	
	@Override
	public String generate(){
		return getField();
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	

}
