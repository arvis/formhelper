package com.viestards.formhelper;

import java.util.ArrayList;


/**
 * Generates combo box field
 * Example HTMl code:
 * <select>
 * <option value=""></option>
 * <option value="volvo">Volvo</option>
 * <option value="saab" selected>Saab</option>
 * <option value="opel">Opel</option>
 * <option value="audi">Audi</option>
 *	</select>
 * */
public class ComboBoxField extends BaseField {
	
	private ArrayList<OptionField> optionFieldList;
	private String name;
	
	public ComboBoxField(String name,ArrayList<OptionField> optionFieldList){
		super(name,"");
		this.name=name;
		this.setOptionFieldList(optionFieldList);
	}
	
	@Override
	public String generate(){
	
		String result= String.format("<select name='%s' id='%s' ><option value=''></option>" , getName(),getName());
		
		for (OptionField field : optionFieldList){
			result+=field.generate();
		}
		
		//TODO: better way of string concatenation
		return result+"</select>"+getError("") ;
	}

	@Override
	public String getField() {
		return this.generate();
	}
	
	public ArrayList<OptionField> getOptionFieldList() {
		return optionFieldList;
	}

	public void setOptionFieldList(ArrayList<OptionField> optionFieldList) {
		this.optionFieldList = optionFieldList;
	}
	
	public void addOptionFieldList(OptionField field) {
		this.optionFieldList.add(field);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
