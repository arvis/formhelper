package com.viestards.formhelper;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.util.Set;
import java.lang.reflect.Field;

public class FormHelper {
	
	private static Validator validator;
	private Object formObject;
	private String fieldDelimiter="";
	
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
		final Field[] fieldList= this.formObject.getClass().getDeclaredFields();
		
		String formHTML="";
		//Object fieldType;
		String fieldName;
		try {
			for (Field field : fieldList){
				//System.out.format("name: %s Type: %s%n",field.getName(), field.getType());
				//System.out.format("GenericType: %s%n", field.getGenericType());
				field.setAccessible(true);
				Class<?> fieldType = field.getType();
				
				if (fieldType==String.class){
					final String val = (String)field.get(this.formObject);
					formHTML+=new InputField(field.getName(),val ).generate();
				}
				
		}
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(formHTML);
		
		return formHTML;
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


	public String getFieldDelimiter() {
		return fieldDelimiter;
	}


	public void setFieldDelimiter(String fieldDelimiter) {
		this.fieldDelimiter = fieldDelimiter;
	}
	
	
	

}
