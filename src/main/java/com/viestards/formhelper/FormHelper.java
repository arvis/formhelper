package com.viestards.formhelper;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import java.util.Set;

public class FormHelper {
	
	private static Validator validator;
	private Object formObject;
	
	public FormHelper(Object formObject){
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();		
		this.setFormObject(formObject);
	}
	
	
	/**
	* checks for form validation
	*/
	public boolean isValid(){
		Set<ConstraintViolation<FormHelper>> validationResults =validator.validate(this);
		
		if (validationResults.size()==0){
			return true;
		}
		
		return false;
	}
	
	/**
	 * Generates html form as
	 * Example output:
	 * <input id="myid" name="myid" />
	 * */
	public String generate(){
		Set<ConstraintViolation<FormHelper>> validationResults =validator.validate(this);

		return "";
	}
	
	/**
	 * generetes html form as Twitter bootstrap form
	 * NOT implemented yet
	 * 
	 * */
	public String generateAsBootrsap(){
		
		return "";
	}


	public Object getFormObject() {
		return formObject;
	}


	public void setFormObject(Object formObject) {
		//TODO: check if some validation is needed
		this.formObject = formObject;
	}
	
	
	

}
