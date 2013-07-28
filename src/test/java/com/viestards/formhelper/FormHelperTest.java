package com.viestards.formhelper;

import static org.junit.Assert.*;

import javax.validation.constraints.NotNull;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import com.viestards.formhelper.FormHelper;

public class FormHelperTest {

	class CarForm extends FormHelper {
		
		@NotNull
		private String brand;
		private String licenceNumber;
		private String description;
		
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getLicenceNumber() {
			return licenceNumber;
		}
		public void setLicenceNumber(String licenceNumber) {
			this.licenceNumber = licenceNumber;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		
	}
	

	
	@BeforeClass
    public static void setUp() {
		
	}
	
	
	@Test
	public void testIsValid() {
		CarForm car=new CarForm();
		car.setBrand("Ford");
		Assert.assertTrue(car.isValid());
		//fail("Not yet implemented");
	}
	
	@Test
	public void testGenerate(){
		fail("Not yet implemented");
	}
	
	@Test
	public void testGenerateBootstrap(){
		fail("Not yet implemented");
	}
	
	
	

}
